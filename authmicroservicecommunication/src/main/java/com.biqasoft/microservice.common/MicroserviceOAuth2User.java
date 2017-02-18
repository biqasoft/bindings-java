package com.biqasoft.microservice.common;

import com.biqasoft.entity.dto.useraccount.UserNameWithPassword;
import com.biqasoft.microservice.common.dto.OAuth2MicroserviceNewCredentialsRequest;
import com.biqasoft.microservice.common.dto.OAuth2MicroserviceNewTokenRequest;
import com.biqasoft.microservice.common.dto.UserAccountOAuth2;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.MicroMapping;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.MicroPathVar;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.MicroPayloadVar;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.Microservice;

import org.springframework.http.HttpMethod;

import java.util.List;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 7/18/2016
 *         All Rights Reserved
 */
@Microservice(value = "users", basePath = "/v1/users/oauth2")
public interface MicroserviceOAuth2User {

    @MicroMapping(path = "/additional_username_password", method = HttpMethod.POST)
    UserNameWithPassword createAdditionalUsernameAndPasswordCredentialsOauth(OAuth2MicroserviceNewCredentialsRequest UserAccountGroup);

    @MicroMapping(path = "/token/user_id/{userId}/token_id", method = HttpMethod.POST)
    void deleteOauthTokenFromUserAccountById(@MicroPathVar("userId") String userId,
                                             @MicroPayloadVar("oauthToken") String oauthToken);

    @MicroMapping(path = "", method = HttpMethod.POST)
    UserAccountOAuth2 createNewOAuthToken(OAuth2MicroserviceNewTokenRequest tokenRequest);

    @MicroMapping("/my_tokens")
    List<UserAccountOAuth2> getAllMyOAuthTokens();
}
