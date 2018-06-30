/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.microservice.common.dto.core;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "Information about creating this object. Who and when created it")
public class CreatedInfoDto {

    private Date createdDate;
    private String createdById;

    public CreatedInfoDto() {
    }

    public CreatedInfoDto(Date createdDate, String createdById) {
        this.createdDate = createdDate;
        this.createdById = createdById;
    }

    public CreatedInfoDto(Date createdDate) {
        this.createdDate = createdDate;
    }

}
