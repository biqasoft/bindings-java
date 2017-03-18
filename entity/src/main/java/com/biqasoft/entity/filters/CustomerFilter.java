/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.filters;

import com.biqasoft.entity.core.BaseClassFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.biqasoft.entity.constants.SYSTEM_FIELDS_CONST;

import java.util.ArrayList;
import java.util.List;

@ApiModel("Customer Filter for customers and leads")
public class CustomerFilter extends BaseClassFilter {

    @ApiModelProperty("show only when current user is responsible manager")
    private boolean showOnlyWhenIamResponsible;

    @ApiModelProperty("show only leads")
    private boolean lead;

    @ApiModelProperty("show only customers")
    private boolean customer;

    @ApiModelProperty("show only active leads and customers")
    private boolean active;

    @ApiModelProperty("show only important leads and customers")
    private boolean important;

    @ApiModelProperty("can be 'ANY' - to show ALL")
    private String leadGenMethodId = SYSTEM_FIELDS_CONST.ANY;

    @ApiModelProperty("can be 'ANY' - to show ALL")
    private String leadGenProjectId = SYSTEM_FIELDS_CONST.ANY;

    @ApiModelProperty("can be 'ANY' - to show ALL")
    private String salesFunnelStatusID = SYSTEM_FIELDS_CONST.ANY;


    @ApiModelProperty("use static segment filter or not ?")
    private boolean useStaticSegments = false;

    @ApiModelProperty("array of static segment IDs ")
    private List<String> staticSegmentsIDs = new ArrayList<>();


    @ApiModelProperty("show only leads and customer when responsible managers is IDs of the following accounts ('responsiblesManagersList') - param")
    private boolean useResponsiblesManagersList = false;

    @ApiModelProperty("array of IDs responsible managers accounts")
    private List<String> responsiblesManagersList = new ArrayList<>();


    @ApiModelProperty("show only leads and customers with some IDs")
    private boolean useCustomerIDsList = false;

    @ApiModelProperty("array of IDs customers")
    private List<String> customerIDsList = new ArrayList<>();


    // from 19.09.2015
    // options available below

    @ApiModelProperty("show only customers who has active task number less that some number (integer type) ")
    private boolean useActiveTaskNumberLessThan = false;
    private Long activeTaskNumberLessThan = null;

    @ApiModelProperty("show only customers who has active task number more that some number (integer type) ")
    private boolean useActiveTaskNumberMoreThan = false;
    private Long activeTaskNumberMoreThan = null;


    @ApiModelProperty("show only customers who has deals amount more than some number (Double/integer type) ")
    private boolean useDealsAmountMoreThan = false;
    private Double dealsAmountMoreThan = null;

    @ApiModelProperty("show only customers who has deals amount less that some number (Double/integer type) ")
    private boolean useDealsAmountLessThan = false;
    private Double dealsAmountLessThan = null;


    @ApiModelProperty("show only customers who has opportunities amount more than some number (Double/integer type) ")
    private boolean useOpportunityAmountMoreThan = false;
    private Double opportunityAmountMoreThan = null;

    @ApiModelProperty("show only customers who has opportunities amount less that some number (Double/integer type) ")
    private boolean useOpportunityAmountLessThan = false;
    private Double opportunityAmountLessThan = null;


    @ApiModelProperty("show only customers who has opportunities amount more than some number (Double/integer type) ")
    private boolean useOpportunityNumberMoreThan = false;
    private Double opportunityNumberMoreThan = null;

    @ApiModelProperty("show only customers who has opportunities amount less that some number (Double/integer type) ")
    private boolean useOpportunityNumberLessThan = false;
    private Double opportunityNumberLessThan = null;


    @ApiModelProperty("show only customers who has deals amount more than some number (Double/integer type) ")
    private boolean useDealsNumberMoreThan = false;
    private Double dealsNumberMoreThan = null;

    @ApiModelProperty("show only customers who has deals amount less that some number (Double/integer type) ")
    private boolean useDealsNumberLessThan = false;
    private Double dealsNumberLessThan = null;


    protected boolean useRelativeLastDealDateFrom;
    protected boolean useRelativeLastDealDateTo;

    protected boolean useRelativeLastOpportunityDateTo;
    protected boolean useRelativeLastOpportunityDateFrom;

    protected String relativeLastDealDateTo;
    protected String relativeLastDealDateFrom;

    protected String relativeLastOpportunityDateFrom;
    protected String relativeLastOpportunityDateTo;

    public boolean isUseRelativeLastDealDateFrom() {
        return useRelativeLastDealDateFrom;
    }

    public void setUseRelativeLastDealDateFrom(boolean useRelativeLastDealDateFrom) {
        this.useRelativeLastDealDateFrom = useRelativeLastDealDateFrom;
    }

    public boolean isUseRelativeLastDealDateTo() {
        return useRelativeLastDealDateTo;
    }

    public void setUseRelativeLastDealDateTo(boolean useRelativeLastDealDateTo) {
        this.useRelativeLastDealDateTo = useRelativeLastDealDateTo;
    }

    public boolean isUseRelativeLastOpportunityDateTo() {
        return useRelativeLastOpportunityDateTo;
    }

    public void setUseRelativeLastOpportunityDateTo(boolean useRelativeLastOpportunityDateTo) {
        this.useRelativeLastOpportunityDateTo = useRelativeLastOpportunityDateTo;
    }

    public boolean isUseRelativeLastOpportunityDateFrom() {
        return useRelativeLastOpportunityDateFrom;
    }

    public void setUseRelativeLastOpportunityDateFrom(boolean useRelativeLastOpportunityDateFrom) {
        this.useRelativeLastOpportunityDateFrom = useRelativeLastOpportunityDateFrom;
    }

    public String getRelativeLastDealDateTo() {
        return relativeLastDealDateTo;
    }

    public void setRelativeLastDealDateTo(String relativeLastDealDateTo) {
        this.relativeLastDealDateTo = relativeLastDealDateTo;
    }

    public String getRelativeLastDealDateFrom() {
        return relativeLastDealDateFrom;
    }

    public void setRelativeLastDealDateFrom(String relativeLastDealDateFrom) {
        this.relativeLastDealDateFrom = relativeLastDealDateFrom;
    }

    public String getRelativeLastOpportunityDateFrom() {
        return relativeLastOpportunityDateFrom;
    }

    public void setRelativeLastOpportunityDateFrom(String relativeLastOpportunityDateFrom) {
        this.relativeLastOpportunityDateFrom = relativeLastOpportunityDateFrom;
    }

    public String getRelativeLastOpportunityDateTo() {
        return relativeLastOpportunityDateTo;
    }

    public void setRelativeLastOpportunityDateTo(String relativeLastOpportunityDateTo) {
        this.relativeLastOpportunityDateTo = relativeLastOpportunityDateTo;
    }

    public boolean isShowOnlyWhenIamResponsible() {
        return showOnlyWhenIamResponsible;
    }

    public void setShowOnlyWhenIamResponsible(boolean showOnlyWhenIamResponsible) {
        this.showOnlyWhenIamResponsible = showOnlyWhenIamResponsible;
    }

    public boolean isLead() {
        return lead;
    }

    public void setLead(boolean lead) {
        this.lead = lead;
    }

    public boolean isCustomer() {
        return customer;
    }

    public void setCustomer(boolean customer) {
        this.customer = customer;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isImportant() {
        return important;
    }

    public void setImportant(boolean important) {
        this.important = important;
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

    public String getSalesFunnelStatusID() {
        return salesFunnelStatusID;
    }

    public void setSalesFunnelStatusID(String salesFunnelStatusID) {
        this.salesFunnelStatusID = salesFunnelStatusID;
    }

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

    public boolean isUseResponsiblesManagersList() {
        return useResponsiblesManagersList;
    }

    public void setUseResponsiblesManagersList(boolean useResponsiblesManagersList) {
        this.useResponsiblesManagersList = useResponsiblesManagersList;
    }

    public List<String> getResponsiblesManagersList() {
        return responsiblesManagersList;
    }

    public void setResponsiblesManagersList(List<String> responsiblesManagersList) {
        this.responsiblesManagersList = responsiblesManagersList;
    }

    public boolean isUseCustomerIDsList() {
        return useCustomerIDsList;
    }

    public void setUseCustomerIDsList(boolean useCustomerIDsList) {
        this.useCustomerIDsList = useCustomerIDsList;
    }

    public List<String> getCustomerIDsList() {
        return customerIDsList;
    }

    public void setCustomerIDsList(List<String> customerIDsList) {
        this.customerIDsList = customerIDsList;
    }

    public boolean isUseActiveTaskNumberLessThan() {
        return useActiveTaskNumberLessThan;
    }

    public void setUseActiveTaskNumberLessThan(boolean useActiveTaskNumberLessThan) {
        this.useActiveTaskNumberLessThan = useActiveTaskNumberLessThan;
    }

    public Long getActiveTaskNumberLessThan() {
        return activeTaskNumberLessThan;
    }

    public void setActiveTaskNumberLessThan(Long activeTaskNumberLessThan) {
        this.activeTaskNumberLessThan = activeTaskNumberLessThan;
    }

    public boolean isUseActiveTaskNumberMoreThan() {
        return useActiveTaskNumberMoreThan;
    }

    public void setUseActiveTaskNumberMoreThan(boolean useActiveTaskNumberMoreThan) {
        this.useActiveTaskNumberMoreThan = useActiveTaskNumberMoreThan;
    }

    public Long getActiveTaskNumberMoreThan() {
        return activeTaskNumberMoreThan;
    }

    public void setActiveTaskNumberMoreThan(Long activeTaskNumberMoreThan) {
        this.activeTaskNumberMoreThan = activeTaskNumberMoreThan;
    }

    public boolean isUseDealsAmountMoreThan() {
        return useDealsAmountMoreThan;
    }

    public void setUseDealsAmountMoreThan(boolean useDealsAmountMoreThan) {
        this.useDealsAmountMoreThan = useDealsAmountMoreThan;
    }

    public Double getDealsAmountMoreThan() {
        return dealsAmountMoreThan;
    }

    public void setDealsAmountMoreThan(Double dealsAmountMoreThan) {
        this.dealsAmountMoreThan = dealsAmountMoreThan;
    }

    public boolean isUseDealsAmountLessThan() {
        return useDealsAmountLessThan;
    }

    public void setUseDealsAmountLessThan(boolean useDealsAmountLessThan) {
        this.useDealsAmountLessThan = useDealsAmountLessThan;
    }

    public Double getDealsAmountLessThan() {
        return dealsAmountLessThan;
    }

    public void setDealsAmountLessThan(Double dealsAmountLessThan) {
        this.dealsAmountLessThan = dealsAmountLessThan;
    }

    public boolean isUseOpportunityAmountMoreThan() {
        return useOpportunityAmountMoreThan;
    }

    public void setUseOpportunityAmountMoreThan(boolean useOpportunityAmountMoreThan) {
        this.useOpportunityAmountMoreThan = useOpportunityAmountMoreThan;
    }

    public Double getOpportunityAmountMoreThan() {
        return opportunityAmountMoreThan;
    }

    public void setOpportunityAmountMoreThan(Double opportunityAmountMoreThan) {
        this.opportunityAmountMoreThan = opportunityAmountMoreThan;
    }

    public boolean isUseOpportunityAmountLessThan() {
        return useOpportunityAmountLessThan;
    }

    public void setUseOpportunityAmountLessThan(boolean useOpportunityAmountLessThan) {
        this.useOpportunityAmountLessThan = useOpportunityAmountLessThan;
    }

    public Double getOpportunityAmountLessThan() {
        return opportunityAmountLessThan;
    }

    public void setOpportunityAmountLessThan(Double opportunityAmountLessThan) {
        this.opportunityAmountLessThan = opportunityAmountLessThan;
    }

    public boolean isUseOpportunityNumberMoreThan() {
        return useOpportunityNumberMoreThan;
    }

    public void setUseOpportunityNumberMoreThan(boolean useOpportunityNumberMoreThan) {
        this.useOpportunityNumberMoreThan = useOpportunityNumberMoreThan;
    }

    public Double getOpportunityNumberMoreThan() {
        return opportunityNumberMoreThan;
    }

    public void setOpportunityNumberMoreThan(Double opportunityNumberMoreThan) {
        this.opportunityNumberMoreThan = opportunityNumberMoreThan;
    }

    public boolean isUseOpportunityNumberLessThan() {
        return useOpportunityNumberLessThan;
    }

    public void setUseOpportunityNumberLessThan(boolean useOpportunityNumberLessThan) {
        this.useOpportunityNumberLessThan = useOpportunityNumberLessThan;
    }

    public Double getOpportunityNumberLessThan() {
        return opportunityNumberLessThan;
    }

    public void setOpportunityNumberLessThan(Double opportunityNumberLessThan) {
        this.opportunityNumberLessThan = opportunityNumberLessThan;
    }

    public boolean isUseDealsNumberMoreThan() {
        return useDealsNumberMoreThan;
    }

    public void setUseDealsNumberMoreThan(boolean useDealsNumberMoreThan) {
        this.useDealsNumberMoreThan = useDealsNumberMoreThan;
    }

    public Double getDealsNumberMoreThan() {
        return dealsNumberMoreThan;
    }

    public void setDealsNumberMoreThan(Double dealsNumberMoreThan) {
        this.dealsNumberMoreThan = dealsNumberMoreThan;
    }

    public boolean isUseDealsNumberLessThan() {
        return useDealsNumberLessThan;
    }

    public void setUseDealsNumberLessThan(boolean useDealsNumberLessThan) {
        this.useDealsNumberLessThan = useDealsNumberLessThan;
    }

    public Double getDealsNumberLessThan() {
        return dealsNumberLessThan;
    }

    public void setDealsNumberLessThan(Double dealsNumberLessThan) {
        this.dealsNumberLessThan = dealsNumberLessThan;
    }
}
