/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.microservice.common.dto.oauth2;

import com.biqasoft.microservice.common.dto.core.GlobalStoredBaseClassDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 * Date: 10/9/2015
 * All Rights Reserved
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class OAuth2Application extends GlobalStoredBaseClassDto {

    private String response_type = "code";
    private String redirect_uri;

    @JsonIgnore
    private String secretCode;

    private List<String> roles = new ArrayList<>();

    @ApiModelProperty(value = "If this is true, application will automatically give access to application in browser",
            notes = "Used for trusted partners and application")
    private boolean giveAccessWithoutPrompt = false;

    @ApiModelProperty("This is publically available application")
    private boolean publicApp = false;

}
