package com.biqasoft.auth;

import com.biqasoft.auth.internal.grpc.UsersGet;
import com.biqasoft.auth.internal.grpc.UsersGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.web.server.context.ServerSecurityContextRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.InetSocketAddress;

/**
 * Authenticate HTTP REST user request with spring security
 * <p>
 * Used by REST & Async Gateway
 */
@Service
public class GatewayAuthenticationProvider implements ServerSecurityContextRepository, ReactiveAuthenticationManager {

    private static final Logger logger = LoggerFactory.getLogger(GatewayAuthenticationProvider.class);

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    private UsersGrpc.UsersStub usersStub;

    @Autowired
    public GatewayAuthenticationProvider(@Value("${biqa.ms.auth:users}") String usersMs) {
        ServiceInstance users = loadBalancerClient.choose(usersMs);
        ManagedChannel channel = ManagedChannelBuilder.forAddress(users.getHost(), users.getPort()).usePlaintext(true).build();
        usersStub = UsersGrpc.newStub(channel);
    }

    /**
     * extract auth token from http request
     * See {@link org.springframework.security.web.authentication.www.BasicAuthenticationFilter#extractAndDecodeHeader}
     *
     * @param request
     */
    private static String getAuthorizationFromHttpRequestParamAsHeader(ServerHttpRequest request) {
        try {
            String token = request.getQueryParams().getFirst("token");
            if (StringUtils.isEmpty(token)) {
                return null;
            }
            return token;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Mono<Authentication> authenticate(Authentication authentication) {
        return Mono.just(authentication);
    }

    @Override
    public Mono<Void> save(ServerWebExchange exchange, SecurityContext context) {
        return null;
    }

    @Override
    public Mono<SecurityContext> load(ServerWebExchange exchange) {
        return Mono.create(monoSink -> {
            UsersGet.UserAuthenticateRequest.Builder authenticateRequest = UsersGet.UserAuthenticateRequest.newBuilder();

            String authorization = exchange.getRequest().getHeaders().getFirst("Authorization");
            if (authorization != null) {
                authenticateRequest.setToken(authorization);
            }

            if (authorization == null) {
                String httpRequestParamAsHeader = GatewayAuthenticationProvider.getAuthorizationFromHttpRequestParamAsHeader(exchange.getRequest());
                if (httpRequestParamAsHeader != null) {
                    authenticateRequest.setToken(httpRequestParamAsHeader);
                }

                InetSocketAddress remoteAddress1 = exchange.getRequest().getRemoteAddress();
                if (remoteAddress1 == null) {
                    logger.error("can not get remote ip");
                } else {
                    authenticateRequest.setIp(remoteAddress1.getAddress().getHostAddress());
                }

                usersStub.authenticateUser(authenticateRequest.build(), new StreamObserver<>() {

                    @Override
                    public void onNext(UsersGet.UserAuthenticateResponse value) {
                        if (!value.getAuthenticated()) {
                            // TODO: check if success authenticated
//                            throw new BiqaAuthenticationLocalizedException(errorResource);   monoSink.success(null);
                        } else {
                            monoSink.success(new SecurityContextImpl(new AppUserCtx(value)));
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        monoSink.error(t);
                    }

                    @Override
                    public void onCompleted() {
                    }
                });

            }
        });
    }

}
