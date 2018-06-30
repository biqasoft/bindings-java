/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.microservice.common.dto.oauth2;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 * Date: 10/9/2015
 * All Rights Reserved
 */
@Data
public class OAuth2NewTokenRequest implements Serializable {

    private List<String> roles = new ArrayList<>();
    private String clientApplicationID;
    private Date expire = null;

}
