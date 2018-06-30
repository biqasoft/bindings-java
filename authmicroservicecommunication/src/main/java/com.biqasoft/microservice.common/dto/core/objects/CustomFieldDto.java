/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.microservice.common.dto.core.objects;

import com.biqasoft.microservice.common.dto.core.objects.field.DataSourcesTypesDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 * Date: 12/4/2015
 * All Rights Reserved
 */
@Data
public class CustomFieldDto {

    @ApiModelProperty("field type id. Every object with embedded customField with the same field have same this fieldId")
    protected String fieldId;

    @ApiModelProperty("Custom field name")
    private String name;

    @ApiModelProperty("description")
    private String description = null;

    @ApiModelProperty("Regular expression validation pattern")
    private String validPattern = null;

    @ApiModelProperty("Field type")
    private String type;

    @ApiModelProperty("Field style. For example how show UI control elements for String")
    private String style;

    @ApiModelProperty("Is this field required")
    private boolean required;

    @ApiModelProperty("Is this field hidden in UI. Usually used to store some technical information")
    private boolean hidden;

    @ApiModelProperty("Value - main property")
    private DataSourcesTypesDto value = new DataSourcesTypesDto();

    private String alias;


    public CustomFieldDto() {
    }

    public CustomFieldDto(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public CustomFieldDto(String name, String type, String description) {
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

}
