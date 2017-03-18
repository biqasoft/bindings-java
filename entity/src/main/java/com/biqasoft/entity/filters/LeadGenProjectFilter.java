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
public class LeadGenProjectFilter extends BaseClassFilter {

    @ApiModelProperty("use static segment filter or not ?")
    private boolean useListOfIDs = false;

    @ApiModelProperty("array of static segment IDs ")
    private List<String> listOfIDs = new ArrayList<>();

    private String leadGenMethodID;


    public String getLeadGenMethodID() {
        return leadGenMethodID;
    }

    public void setLeadGenMethodID(String leadGenMethodID) {
        this.leadGenMethodID = leadGenMethodID;
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
