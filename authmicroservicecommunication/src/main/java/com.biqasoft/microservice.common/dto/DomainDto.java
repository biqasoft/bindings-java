/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.microservice.common.dto;

import com.biqasoft.microservice.common.dto.core.CreatedInfoDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This is object for system use
 * user can not modify it, but can see through API
 * user cam modify {@link DomainSettingsDto} class
 */
@ApiModel("Represent main domain info such as balance, limits, etc. Not contain settings etc")
@Data
public class DomainDto {

    private String domain;

    @ApiModelProperty("main balance for domain")
    private double balance;

    @ApiModelProperty("additional balance wich user get from some sales etc")
    private double bonusBalance;

    @ApiModelProperty("balance currency")
    private String balanceCurrency = "RUB";

    @ApiModelProperty("affiliate program / partners sales")
    private String partnerID;

    @ApiModelProperty("which tarif of all domain")
    private String tariff;

    @ApiModelProperty("when tariff is expires")
    private Date tariffUntil;

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
