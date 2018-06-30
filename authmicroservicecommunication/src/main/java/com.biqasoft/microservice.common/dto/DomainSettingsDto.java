/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.microservice.common.dto;

import com.biqasoft.microservice.common.dto.core.objects.CustomFieldDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApiModel
@Data
public class DomainSettingsDto {

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

    // key is name of biqaClass BiqaClassService#getNameForBiqaClass
    private Map<String, List<CustomFieldDto>> defaultCustomFields = new HashMap<>();

    @JsonIgnore
    public List<CustomFieldDto> getCustomFieldForClass(String className){
        List<CustomFieldDto> customFields = defaultCustomFields.get(className);
        if (customFields == null){
            customFields = new ArrayList<>();
            defaultCustomFields.put(className, customFields);
        }

        return customFields;
    }

}
