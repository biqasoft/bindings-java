/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.auth.core;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
@Data
public class DomainSettings {

    @ApiModelProperty("same id as domain (domainInCRM)")
    private String id;

    private String defaultIDSalesFunnelLG;
    private String defaultIDSalesFunnelLC;
    private String defaultIDSalesFunnelAM;

    private String defaultLeadGenMethodID;
    private String defaultLeadGenProjectID;

    private String defaultEmail;

    private String logoText;
    private String currency;

    @ApiModelProperty("When file is stored - Dropbox, default storage etc")
    private String defaultUploadStoreType;

    @ApiModelProperty("Default Storage ID in store. For example, if it is dropbox - it is login of account etc...")
    private String defaultUploadStoreID;

    @ApiModelProperty("Time zone offset in MINUTES")
    private int timeZoneOffset;

    @ApiModelProperty("If user do not complete task - allow done task")
    private boolean allowCompleteTaskWithoutCheckList = false;

}
