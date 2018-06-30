/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.microservice.common.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 * Date: 12/5/2015
 * All Rights Reserved
 */
@ApiModel("Common used DTO with one string field")
@Data
public class SampleDataResponseDto {

    private String data;

}
