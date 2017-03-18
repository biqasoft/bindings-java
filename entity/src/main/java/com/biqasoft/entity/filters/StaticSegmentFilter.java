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
public class StaticSegmentFilter extends BaseClassFilter {

    @ApiModelProperty("use static segment filter or not ?")
    private boolean useStaticSegments = false;

    @ApiModelProperty("array of static segment IDs ")
    private List<String> staticSegmentsIDs = new ArrayList<>();


    public boolean isUseStaticSegments() {
        return useStaticSegments;
    }

    public void setUseStaticSegments(boolean useStaticSegments) {
        this.useStaticSegments = useStaticSegments;
    }

    public List<String> getStaticSegmentsIDs() {
        return staticSegmentsIDs;
    }

    public void setStaticSegmentsIDs(List<String> staticSegmentsIDs) {
        this.staticSegmentsIDs = staticSegmentsIDs;
    }
}
