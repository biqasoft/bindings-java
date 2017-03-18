/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.filters;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(" Lead gen method and project builder stats for excel download  ")
public class LeadGenMethodExcelFilter extends LeadGenMethodFilter {

    @ApiModelProperty("devide all lead gen projects per own sheet")
    private boolean devideProjectsPerSheets;

    public boolean isDevideProjectsPerSheets() {
        return devideProjectsPerSheets;
    }

    public void setDevideProjectsPerSheets(boolean devideProjectsPerSheets) {
        this.devideProjectsPerSheets = devideProjectsPerSheets;
    }
}
