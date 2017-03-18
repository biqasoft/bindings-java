/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.filters;

import com.biqasoft.entity.core.BaseClassFilter;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDealsAndOpportunityFilter extends BaseClassFilter {

    private boolean useAmountMoreThan = false;
    private Double amountMoreThan = null;

    private boolean useAmountLessThan = false;
    private Double amountLessThan = null;

    // 0-6 //
    private boolean usePriorityMoreThan = false;
    private Integer priorityMoreThan = null;

    private boolean usePriorityLessThan = false;
    private Integer priorityLessThan = null;

    private boolean useCustomerIDs = false;
    private List<String> customerIDs = new ArrayList<>();
    /////////////////////////////////////////////

    @ApiModelProperty("can be 'ANY' - to show ALL")
    private String leadGenMethodId;

    @ApiModelProperty("can be 'ANY' - to show ALL")
    private String leadGenProjectId;

    private boolean sortByAmount = false;


    public boolean isUseAmountMoreThan() {
        return useAmountMoreThan;
    }

    public void setUseAmountMoreThan(boolean useAmountMoreThan) {
        this.useAmountMoreThan = useAmountMoreThan;
    }

    public Double getAmountMoreThan() {
        return amountMoreThan;
    }

    public void setAmountMoreThan(Double amountMoreThan) {
        this.amountMoreThan = amountMoreThan;
    }

    public boolean isUseAmountLessThan() {
        return useAmountLessThan;
    }

    public void setUseAmountLessThan(boolean useAmountLessThan) {
        this.useAmountLessThan = useAmountLessThan;
    }

    public Double getAmountLessThan() {
        return amountLessThan;
    }

    public void setAmountLessThan(Double amountLessThan) {
        this.amountLessThan = amountLessThan;
    }

    public boolean isUsePriorityMoreThan() {
        return usePriorityMoreThan;
    }

    public void setUsePriorityMoreThan(boolean usePriorityMoreThan) {
        this.usePriorityMoreThan = usePriorityMoreThan;
    }

    public Integer getPriorityMoreThan() {
        return priorityMoreThan;
    }

    public void setPriorityMoreThan(Integer priorityMoreThan) {
        this.priorityMoreThan = priorityMoreThan;
    }

    public boolean isUsePriorityLessThan() {
        return usePriorityLessThan;
    }

    public void setUsePriorityLessThan(boolean usePriorityLessThan) {
        this.usePriorityLessThan = usePriorityLessThan;
    }

    public Integer getPriorityLessThan() {
        return priorityLessThan;
    }

    public void setPriorityLessThan(Integer priorityLessThan) {
        this.priorityLessThan = priorityLessThan;
    }

    public boolean isUseCustomerIDs() {
        return useCustomerIDs;
    }

    public void setUseCustomerIDs(boolean useCustomerIDs) {
        this.useCustomerIDs = useCustomerIDs;
    }

    public List<String> getCustomerIDs() {
        return customerIDs;
    }

    public void setCustomerIDs(List<String> customerIDs) {
        this.customerIDs = customerIDs;
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

    public boolean isSortByAmount() {
        return sortByAmount;
    }

    public void setSortByAmount(boolean sortByAmount) {
        this.sortByAmount = sortByAmount;
    }
}
