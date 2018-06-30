/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.microservice.common.dto.core.objects.field;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@ApiModel("This object is used in different places, where user create own data-structures, " +
        "such as dataSource, or customFields. This object contains different types of data")
@Data
public class DataSourcesTypesDto {

    private String stringVal = null;

    @ApiModelProperty("Please note about integer range(max integer value)")
    private Integer intVal = null;
    private Object objVal = null;
    private Double doubleVal = null;
    private Date dateVal = null;
    private CustomDictionaryDto dictVal = null;
    private Boolean boolVal = null;
    private List<String> stringList = null;
    private Long longVal = null;

    public DataSourcesTypesDto() {
    }

    public DataSourcesTypesDto(String stringVal) {
        this.stringVal = stringVal;
    }

    public DataSourcesTypesDto(Integer intVal) {
        this.intVal = intVal;
    }

    public DataSourcesTypesDto(Object objVal) {
        this.objVal = objVal;
    }

    public DataSourcesTypesDto(Double doubleVal) {
        this.doubleVal = doubleVal;
    }

    public DataSourcesTypesDto(Date dateVal) {
        this.dateVal = dateVal;
    }

    public DataSourcesTypesDto(CustomDictionaryDto dictVal) {
        this.dictVal = dictVal;
    }

    public DataSourcesTypesDto(Boolean boolVal) {
        this.boolVal = boolVal;
    }

    public DataSourcesTypesDto(List<String> stringList) {
        this.stringList = stringList;
    }

    public DataSourcesTypesDto(Long longVal) {
        this.longVal = longVal;
    }

}
