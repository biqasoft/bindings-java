/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.core;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Nikita Bakaev, ya@nbakaev.ru on 1/19/2016.
 * All Rights Reserved
 */
@ApiModel("This is note for regular expression for one field; There are 2 opportunities:" +
        "1) choose fieldName and regex pattern; choose `value=null`" +
        "2) choose fieldName and value(such as string, integer etc... value) and `pattern=null`  ")
public class RegexBuilderNode {

    @ApiModelProperty("field in database")
    private String fieldName = null;

    @ApiModelProperty("regex pattern as string")
    private String pattern = null;

    @ApiModelProperty("if you do not want use regex - you can choose value of field instead; and choose `pattern=null`")
    private Object value = null;


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

}
