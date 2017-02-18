/*
 * Copyright 2016 the original author or authors.
 */

package com.biqasoft.microservice.common.dto;

import com.biqasoft.entity.core.useraccount.UserAccount;
import com.biqasoft.entity.core.useraccount.oauth2.OAuth2Application;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 7/28/2016
 *         All Rights Reserved
 */
public class OAuth2MicroserviceNewTokenRequest {

    private UserAccount userAccount;
    private OAuth2Application oAuth2Application;
    private OAuth2NewTokenRequest request;


    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public OAuth2Application getoAuth2Application() {
        return oAuth2Application;
    }

    public void setoAuth2Application(OAuth2Application oAuth2Application) {
        this.oAuth2Application = oAuth2Application;
    }

    public OAuth2NewTokenRequest getRequest() {
        return request;
    }

    public void setRequest(OAuth2NewTokenRequest request) {
        this.request = request;
    }
}
