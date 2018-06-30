/*
 * Copyright 2016 the original author or authors.
 */

package com.biqasoft.microservice.common.dto.oauth2;


import com.biqasoft.microservice.common.dto.UserAccountDto;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 7/28/2016
 *         All Rights Reserved
 */
@Data
public class OAuth2MicroserviceNewCredentialsRequest {

    private UserAccountDto userAccount;
    private List<String> rolesRequested;
    private Date expireDate;

}
