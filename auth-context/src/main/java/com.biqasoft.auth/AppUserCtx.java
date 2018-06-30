package com.biqasoft.auth;

import com.biqasoft.auth.core.Domain;
import com.biqasoft.auth.core.DomainSettings;
import com.biqasoft.auth.core.UserAccount;
import com.biqasoft.auth.internal.grpc.UsersGet;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Current authenticated user context
 */
public class AppUserCtx implements Authentication, CurrentUserContextProvider {

    private boolean isAuthenticated;
    private final List<SimpleGrantedAuthority> roles;
    private final String username;
    private final UserAccount account;

    AppUserCtx(UsersGet.UserAuthenticateResponse authenticateResult) {
        isAuthenticated = authenticateResult.getAuthenticated();
        if (isAuthenticated) {
            roles = authenticateResult.getAuthsList().stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
            account = GrpcToInternalUserMapper.mapFromGrpc(authenticateResult.getUserAccount());
            username = authenticateResult.getUserAccount().getUsername();
        } else {
            roles = new ArrayList<>();
            username = "ANONYMOUS";
            account = null;
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public Object getCredentials() {
        return " ";
    }

    @Override
    public UserAccount getDetails() {
        return account;
    }

    @Override
    public Object getPrincipal() {
        return username;
    }

    @Override
    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
    }

    @Override
    public String getName() {
        return account.getUsername();
    }

    @Override
    public UserAccount getUserAccount() {
        return account;
    }

    @Override
    public DomainSettings getDomainSettings() {
        // TODO: important to implement
        throw new IllegalStateException("Not implemented method yet");
    }

    @Override
    public Domain getDomain() {
        // TODO: important to implement
        throw new IllegalStateException("Not implemented method yet");
    }

    @Override
    public boolean hasRole(String role) {
        return roles.contains(new SimpleGrantedAuthority(role));
    }

}
