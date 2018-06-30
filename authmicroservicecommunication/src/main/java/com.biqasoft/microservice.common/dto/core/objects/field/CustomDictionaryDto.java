/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.microservice.common.dto.core.objects.field;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@ApiModel("Dictionary type for custom fields - list of predefined values")
public class CustomDictionaryDto {

    private String id;

    @ApiModelProperty("List of values which can be selected")
    private List<CustomDictionaryItemDto> values = new ArrayList<>();

    @ApiModelProperty("Current selected value")
    private CustomDictionaryItemDto value = new CustomDictionaryItemDto();

}
