package com.biqasoft.auth;

import com.biqasoft.auth.dto.AuthenticateRequest;
import com.biqasoft.auth.dto.AuthenticateResponse;
import com.biqasoft.auth.exception.auth.ThrowAuthExceptionHelper;
import com.biqasoft.auth.exception.auth.BiqaAuthenticationLocalizedException;
import com.biqasoft.common.exceptions.dto.ErrorResource;
import com.biqasoft.entity.core.useraccount.UserAccount;
import com.biqasoft.microservice.communicator.exceptions.InvalidRequestException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Authenticate HTTP REST user request with spring security
 * <p>
 * Used by REST & Async Gateway
 */
@Service
public class GatewayAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

    private final CurrentUserContextProvider currentUserContextProvider;
    private final MicroserviceUsersAuthenticate microserviceUsersAuthenticate;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public GatewayAuthenticationProvider(CurrentUserContextProvider currentUserContextProvider, MicroserviceUsersAuthenticate microserviceUsersAuthenticate) {
        this.currentUserContextProvider = currentUserContextProvider;
        this.microserviceUsersAuthenticate = microserviceUsersAuthenticate;
    }

    /**
     * This method authenticate user by username and password
     * and indirectly call {@link GatewayAuthenticationProvider#retrieveUser}
     *
     * @param username                 username or oauth2 token of user. Or null if http token
     * @param password                 user password, or oauth2 access token, or http token
     * @param webAuthenticationDetails web request
     */
    public void authenticateUser(String username, String password, WebAuthenticationDetails webAuthenticationDetails) {
        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(username, password);

        if (webAuthenticationDetails != null) {
            authRequest.setDetails(webAuthenticationDetails);
        }

        Authentication authentication = authenticate(authRequest);
        SecurityContext securityContext = SecurityContextHolder.getContext();
        securityContext.setAuthentication(authentication);
    }

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
    }

    /**
     * This is public authentication user request and checking username password, expires, create roles etc.
     *
     * @param username       username or oauth2 token
     * @param authentication credentials, for example password
     * @return authenticated user
     * @throws AuthenticationException there was a problem in authenticating, such as wrong password, or expired user...
     */
    @Override
    public UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        String password = (String) authentication.getCredentials();
        UserAccount user;

        AuthenticateRequest authenticateRequest = new AuthenticateRequest();

        // if username is null -> client can not process header, we sent raw token to auth microservice
        // for example GET /myaccount?token=1234567 where 1234567 is special token which auth microservice should now
        // ps AbstractUserDetailsAuthenticationProvider <- spring set NONE_PROVIDED if username is null
        if (!StringUtils.isEmpty(username) && !"NONE_PROVIDED".equals(username)) {
            authenticateRequest.setPassword(password);
            authenticateRequest.setUsername(username);
        } else {
            authenticateRequest.setToken(password);
        }

        AuthenticateResponse authenticateResponse = null;

        try {
            String remoteAddress = ((WebAuthenticationDetails) authentication.getDetails()).getRemoteAddress();
            if (remoteAddress != null) {
                authenticateRequest.setIp(remoteAddress);
            }
        } catch (Exception e) {
            logger.error("can not get remote ip", e);
        }

        try {
            // http request here
            authenticateResponse = microserviceUsersAuthenticate.authenticate(authenticateRequest);
        } catch (InvalidRequestException e) {
            ErrorResource errorResource;

            try {
                ClientHttpResponse errorAuthResponse = e.getClientHttpResponse();
                if (errorAuthResponse != null && (errorAuthResponse.getRawStatusCode() == 401 || errorAuthResponse.getRawStatusCode() == 403)) {
                    errorResource = objectMapper.readValue(IOUtils.toByteArray(errorAuthResponse.getBody()), ErrorResource.class);
                    throw new BiqaAuthenticationLocalizedException(errorResource);
                }

            } catch (IOException e1) {
                throw new BiqaAuthenticationLocalizedException(e1.getMessage());
            }

        }

        if (authenticateResponse == null || !authenticateResponse.getAuthenticated()) {
            ThrowAuthExceptionHelper.throwExceptionBiqaAuthenticationLocalizedException("auth.exception.error.contract");
        }
        List<GrantedAuthority> auths = authenticateResponse.getAuths().stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());

        user = authenticateResponse.getUserAccount();

        // this is not necessary, but we do not want to make new requests, so cache domain, domain settings and authenticated user
        currentUserContextProvider.setUserAccount(user);
        currentUserContextProvider.setDomain(authenticateResponse.getDomain());
        currentUserContextProvider.setDomainSettings(authenticateResponse.getDomainSettings());

        MDC.put("currentUserId", user.getId()); // this will be in logger

        return new User(user.getUsername(), "secret", // this is password spring do not allow null password, but we do not transfer password from microservice
                user.getEnabled(), // enabled
                true, // account not expired
                true, // credentials not expired
                true, // account not locked
                auths);
    }

    /**
     * extract auth token from http request
     * See {@link org.springframework.security.web.authentication.www.BasicAuthenticationFilter#extractAndDecodeHeader}
     *
     * @param request
     */
    public static String getAuthorizationFromHttpRequestParamAsHeader(HttpServletRequest request) {
        // wrong handle + sign (escape as with empty character)
//        String par = request.getParameter("token");
//        if (par == null){
//            return null;
//        }
        try {
            if (StringUtils.isEmpty(request.getQueryString())) {
                return null;
            }

            return request.getQueryString().split("token=")[1];
        } catch (Exception e) {
            return null;
        }

//        return par;
    }

}
