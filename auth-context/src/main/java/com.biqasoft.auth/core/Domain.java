/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.auth.core;

import com.biqasoft.microservice.common.dto.core.CreatedInfoDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * This is object for system use only
 * User can not modify it, but can see through API
 * To store some global domain data purpose use {@link DomainSettings} class which domain administrator is free to modify
 */
@ApiModel("Represent main domain info")
@Data
public class Domain {

    private String domain;

    @ApiModelProperty("this domain is active - not blocked. NOTE: not active domains do not process for metrics and data source changes")
    private boolean active = true;

    private CreatedInfoDto createdInfo;

    /**
     * Created by Nikita Bakaev, ya@nbakaev.ru on 4/17/2016.
     * All Rights Reserved
     */
    @Data
    public static class DatabaseCredentials {

        private String username = null;
        private String password = null;

        private String tenant = null;

        private List<String> roles = new ArrayList<>();

    }
}
