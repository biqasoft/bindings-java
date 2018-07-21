package com.biqasoft.auth.client;

import com.biqasoft.auth.GrpcToInternalUserMapper;
import com.biqasoft.auth.core.UserAccount;
import com.biqasoft.auth.grpc.GrpcChannelService;
import com.biqasoft.auth.internal.grpc.UsersGet;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AuthUserClient {

    private final GrpcChannelService grpcChannelService;

    @Autowired
    public AuthUserClient(GrpcChannelService grpcChannelService) {
        this.grpcChannelService = grpcChannelService;
    }

    public Mono<UserAccount> getUserById(String id) {
        return Mono.create(monoSink -> {
            var authenticateRequest = UsersGet.UserGetRequest.newBuilder();
            authenticateRequest.setId(id);

            grpcChannelService.getUserStub().getUserById(authenticateRequest.build(), new StreamObserver<>() {

                @Override
                public void onNext(UsersGet.UserGetResponse value) {
                   monoSink.success(GrpcToInternalUserMapper.mapFromGrpc(value.getUser()));
                }

                @Override
                public void onError(Throwable t) {
                    monoSink.error(t);
                }

                @Override
                public void onCompleted() {
                }
            });

        });
    }

}
