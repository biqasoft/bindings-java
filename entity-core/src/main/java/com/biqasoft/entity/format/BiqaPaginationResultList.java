/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.format;

import com.biqasoft.entity.core.BaseClass;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ApiModel("DTO for BaseClass")
public class BiqaPaginationResultList<T extends BaseClass> implements Serializable {

    @ApiModelProperty(value = "this is list of resulted object. If we use pagination this is only some part", required = true)
    private List<T> resultedObjects = new ArrayList<>();

    @ApiModelProperty(value = "this is result of requested objects. If we use pagination - we will get ALL number of objects for requested criteria, not only objects" +
            "that we get on pagination results because of limits", required = true)
    private long entityNumber = 0;


    public List<T> getResultedObjects() {
        return resultedObjects;
    }

    public void setResultedObjects(List<T> resultedObjects) {
        this.resultedObjects = resultedObjects;
    }

    public long getEntityNumber() {
        return entityNumber;
    }

    public void setEntityNumber(long entityNumber) {
        this.entityNumber = entityNumber;
    }
}
