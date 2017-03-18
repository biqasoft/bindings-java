/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.filters;

import com.biqasoft.entity.core.BaseClassFilter;

public class ColdCallKPIFilter extends BaseClassFilter {

    private boolean useRelativeCalledDateFrom;
    private boolean useRelativeCalledDateTo;

    private String relativeCalledDateFrom;
    private String relativeCalledDateTo;


    public boolean isUseRelativeCreatedDateFrom() {
        return useRelativeCreatedDateFrom;
    }

    public void setUseRelativeCreatedDateFrom(boolean useRelativeCreatedDateFrom) {
        this.useRelativeCreatedDateFrom = useRelativeCreatedDateFrom;
    }

    public boolean isUseRelativeCreatedDateTo() {
        return useRelativeCreatedDateTo;
    }

    public void setUseRelativeCreatedDateTo(boolean useRelativeCreatedDateTo) {
        this.useRelativeCreatedDateTo = useRelativeCreatedDateTo;
    }

    public String getRelativeCreatedDateFrom() {
        return relativeCreatedDateFrom;
    }

    public void setRelativeCreatedDateFrom(String relativeCreatedDateFrom) {
        this.relativeCreatedDateFrom = relativeCreatedDateFrom;
    }

    public String getRelativeCreatedDateTo() {
        return relativeCreatedDateTo;
    }

    public void setRelativeCreatedDateTo(String relativeCreatedDateTo) {
        this.relativeCreatedDateTo = relativeCreatedDateTo;
    }

    public boolean isUseRelativeCalledDateFrom() {
        return useRelativeCalledDateFrom;
    }

    public void setUseRelativeCalledDateFrom(boolean useRelativeCalledDateFrom) {
        this.useRelativeCalledDateFrom = useRelativeCalledDateFrom;
    }

    public boolean isUseRelativeCalledDateTo() {
        return useRelativeCalledDateTo;
    }

    public void setUseRelativeCalledDateTo(boolean useRelativeCalledDateTo) {
        this.useRelativeCalledDateTo = useRelativeCalledDateTo;
    }

    public String getRelativeCalledDateFrom() {
        return relativeCalledDateFrom;
    }

    public void setRelativeCalledDateFrom(String relativeCalledDateFrom) {
        this.relativeCalledDateFrom = relativeCalledDateFrom;
    }

    public String getRelativeCalledDateTo() {
        return relativeCalledDateTo;
    }

    public void setRelativeCalledDateTo(String relativeCalledDateTo) {
        this.relativeCalledDateTo = relativeCalledDateTo;
    }
}
