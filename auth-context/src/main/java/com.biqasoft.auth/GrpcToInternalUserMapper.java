package com.biqasoft.auth;


import com.biqasoft.auth.core.UserAccount;

public class GrpcToInternalUserMapper {

    public static UserAccount mapFromGrpc (com.biqasoft.auth.internal.grpc.UserOuterClass.User user) {
        UserAccount account = new UserAccount();
        account.setUsername(user.getUsername());
        account.setFirstname(user.getFirstname());
        account.setLastname(user.getLastname());
        account.setPatronymic(user.getPatronymic());
        account.setEmail(user.getEmail());
        account.setEnabled(user.getEnabled());
        account.setId(user.getId());
//        account.setIpPattern(user.getI);

        // TODO: map all fields

        return account;
    }

}
