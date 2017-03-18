/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.objects;

import com.biqasoft.entity.core.BaseClass;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.mongodb.core.mapping.Document;
import com.biqasoft.entity.filters.CustomObjectsDataFilter;

import java.util.Date;

@Document
@ApiModel(description = "This is dynamic segment with customer builder")
public class CustomObjectDataSegment extends BaseClass {

    private CustomObjectsDataFilter customObjectsDataBuilder;


    @ApiModelProperty(" limit this segments with pagination\n" +
            " WARNINGS: this can exclude some objects\n" +
            " and you will see only some PART\n" +
            " of objects")
    private boolean usePagination = false;

    private Date lastUpdate = null;
    private Long lastUpdateNumber = 0L;


    public CustomObjectsDataFilter getCustomObjectsDataBuilder() {
        return customObjectsDataBuilder;
    }

    public void setCustomObjectsDataBuilder(CustomObjectsDataFilter customObjectsDataBuilder) {
        this.customObjectsDataBuilder = customObjectsDataBuilder;
    }

    public boolean isUsePagination() {
        return usePagination;
    }

    public void setUsePagination(boolean usePagination) {
        this.usePagination = usePagination;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Long getLastUpdateNumber() {
        return lastUpdateNumber;
    }

    public void setLastUpdateNumber(Long lastUpdateNumber) {
        this.lastUpdateNumber = lastUpdateNumber;
    }
}
