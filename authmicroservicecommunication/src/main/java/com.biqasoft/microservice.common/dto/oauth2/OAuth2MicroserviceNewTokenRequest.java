/*
 * Copyright 2016 the original author or authors.
 */

package com.biqasoft.microservice.common.dto.oauth2;

import com.biqasoft.microservice.common.dto.UserAccountDto;
import lombok.Data;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 7/28/2016
 *         All Rights Reserved
 */
@Data
public class OAuth2MicroserviceNewTokenRequest {

    private UserAccountDto userAccount;
    private OAuth2Application oAuth2Application;
    private OAuth2NewTokenRequest request;

}
