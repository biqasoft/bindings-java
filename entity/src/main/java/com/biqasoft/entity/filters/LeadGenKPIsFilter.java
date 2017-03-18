/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.filters;

import com.biqasoft.entity.constants.SYSTEM_FIELDS_CONST;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(" This is LeadGenKPIsBuilder")
public class LeadGenKPIsFilter {

    @ApiModelProperty("can be 'ANY' - to show ALL")
    private String leadGenMethodId = SYSTEM_FIELDS_CONST.ANY;

    @ApiModelProperty("can be 'ANY' - to show ALL")
    private String leadGenProjectId = SYSTEM_FIELDS_CONST.ANY;

    private String startDate;
    private String finalDate;


    @ApiModelProperty("If this true - all KPIs metrics will be included - otherwise - only changes")
    private boolean includeRepeatedData = false;

    public boolean isIncludeRepeatedData() {
        return includeRepeatedData;
    }

    public void setIncludeRepeatedData(boolean includeRepeatedData) {
        this.includeRepeatedData = includeRepeatedData;
    }

    public String getLeadGenMethodId() {
        return leadGenMethodId;
    }

    public void setLeadGenMethodId(String leadGenMethodId) {
        this.leadGenMethodId = leadGenMethodId;
    }

    public String getLeadGenProjectId() {
        return leadGenProjectId;
    }

    public void setLeadGenProjectId(String leadGenProjectId) {
        this.leadGenProjectId = leadGenProjectId;
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
