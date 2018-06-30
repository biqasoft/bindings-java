/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.microservice.common.dto.core.objects;

import com.biqasoft.microservice.common.dto.core.BaseClassDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by Nikita Bakaev, ya@nbakaev.ru on 12/4/2015.
 * All Rights Reserved
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class CustomObjectDto extends BaseClassDto {

    @ApiModelProperty("ID of collection - template of objects")
    private String collectionId;

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

}
