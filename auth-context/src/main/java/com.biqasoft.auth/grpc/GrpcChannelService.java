package com.biqasoft.auth.grpc;

import com.biqasoft.auth.internal.grpc.UsersGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;

@Service
public class GrpcChannelService {

    private final LoadBalancerClient loadBalancerClient;

    private UsersGrpc.UsersStub usersStub;

    private final String authMsTag;

    public GrpcChannelService(LoadBalancerClient loadBalancerClient, @Value("${biqa.ms.auth:users}") String usersMs) {
        this.loadBalancerClient = loadBalancerClient;
        this.authMsTag = usersMs;
    }

    public UsersGrpc.UsersStub getUserStub() {
        if (usersStub != null) {
            return usersStub;
        }

        // TODO: health check grpc status
        ServiceInstance users = loadBalancerClient.choose(authMsTag);

        // TODO get from consul
        int grpcPort = 25001;

        ManagedChannel channel = ManagedChannelBuilder.forAddress(users.getHost(), grpcPort).usePlaintext(true).build();
        usersStub = UsersGrpc.newStub(channel);
        return usersStub;
    }


}
