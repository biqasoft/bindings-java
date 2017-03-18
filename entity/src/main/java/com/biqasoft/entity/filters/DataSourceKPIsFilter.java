/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.filters;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(" This is LeadGenKPIsBuilder")
public class DataSourceKPIsFilter {

    @ApiModelProperty("can be 'ANY' - to show ALL")
    private String dataSourceId = null;

    private String startDate;
    private String finalDate;

    @ApiModelProperty(value = "If this true - all KPIs metrics will be included - otherwise - only changes", notes = "Changes to `true` can extremely reduce performance")
    private boolean includeRepeatedData = false;


    public boolean isIncludeRepeatedData() {
        return includeRepeatedData;
    }

    public void setIncludeRepeatedData(boolean includeRepeatedData) {
        this.includeRepeatedData = includeRepeatedData;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }
}
