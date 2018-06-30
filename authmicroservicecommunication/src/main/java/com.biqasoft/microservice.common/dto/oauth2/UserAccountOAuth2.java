/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.microservice.common.dto.oauth2;

import com.biqasoft.microservice.common.dto.core.CreatedInfoDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 * Date: 10/9/2015
 * All Rights Reserved
 */
@Data
public class UserAccountOAuth2 {

    @ApiModelProperty("Client OAuth application ID")
    private String clientApplicationID;

    @ApiModelProperty("This is username, which must be send instead of `username` in basic auth")
    private String userName;

    @ApiModelProperty("This is token with which another server will make authenticating instead of `password` in basic auth ")
    private String accessToken;

    @ApiModelProperty("this is access code which will be send to another server and this server will obtain code to `accessToken`")
    private String accessCode;

    private Date expire;

    @ApiModelProperty("This is OAuth2 Scope")
    private List<String> roles = new ArrayList<>();

    @ApiModelProperty("Does this token enabled or not")
    private boolean enabled;

    private CreatedInfoDto createdInfo;

}
