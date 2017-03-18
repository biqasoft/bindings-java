/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.filters;

import com.biqasoft.entity.core.BaseClassFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

@ApiModel(" This is CustomerBuilder ( Filter) for customers and leads")
public class StorageFileFilter extends BaseClassFilter {

    @ApiModelProperty("use static segment filter or not ?")
    private boolean useListOfIDs = false;

    @ApiModelProperty("array of static segment IDs ")
    private List<String> listOfIDs = new ArrayList<>();

    @ApiModelProperty("only uploaded")
    private boolean onlyUploaded = false;

    @ApiModelProperty("connected customer id")
    private String connectedCustomerId = null;

    public String getConnectedCustomerId() {
        return connectedCustomerId;
    }

    public void setConnectedCustomerId(String connectedCustomerId) {
        this.connectedCustomerId = connectedCustomerId;
    }

    public boolean isOnlyUploaded() {
        return onlyUploaded;
    }

    public void setOnlyUploaded(boolean onlyUploaded) {
        this.onlyUploaded = onlyUploaded;
    }

    public boolean isUseListOfIDs() {
        return useListOfIDs;
    }

    public void setUseListOfIDs(boolean useListOfIDs) {
        this.useListOfIDs = useListOfIDs;
    }

    public List<String> getListOfIDs() {
        return listOfIDs;
    }

    public void setListOfIDs(List<String> listOfIDs) {
        this.listOfIDs = listOfIDs;
    }
}
