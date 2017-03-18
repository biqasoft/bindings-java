/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.core.objects;

import com.biqasoft.entity.core.BaseClass;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * Created by Nikita Bakaev, ya@nbakaev.ru on 12/4/2015.
 * All Rights Reserved
 */
public abstract class CustomObject extends BaseClass {

    @ApiModelProperty("ID of collection - template of objects")
    @Indexed(unique = true)
    private String collectionId;

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

}
