/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.datasources.history.response;

import io.swagger.annotations.ApiModel;
import org.javers.core.metamodel.annotation.Value;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document

@Value
@ApiModel("This is embeddable object to other object, which contains some statistics that is cached and updated in some period")
public class LeadGenAggregatedResponseFull implements Serializable {

    private List<DataSourceAggregatedResponse> ROI = new ArrayList<>();
    private List<DataSourceAggregatedResponse> dealsAmounts = new ArrayList<>();
    private List<DataSourceAggregatedResponse> costsAmount = new ArrayList<>();
    private List<DataSourceAggregatedResponse> leadsNumber = new ArrayList<>();
    private List<DataSourceAggregatedResponse> customersNumber = new ArrayList<>();
    private List<DataSourceAggregatedResponse> dealsNumber = new ArrayList<>();
    private List<DataSourceAggregatedResponse> costsNumber = new ArrayList<>();
    private List<DataSourceAggregatedResponse> conversionFromLeadToCustomer = new ArrayList<>();
    private List<DataSourceAggregatedResponse> leadCost = new ArrayList<>();
    private List<DataSourceAggregatedResponse> customerCost = new ArrayList<>();
    private List<DataSourceAggregatedResponse> averagePayment = new ArrayList<>();
    private List<DataSourceAggregatedResponse> ltv = new ArrayList<>();
    private List<DataSourceAggregatedResponse> dealsCycle = new ArrayList<>();

    private boolean succeed = false;


    public boolean isSucceed() {
        return succeed;
    }

    public void setSucceed(boolean succeed) {
        this.succeed = succeed;
    }

    public List<DataSourceAggregatedResponse> getCustomerCost() {
        return customerCost;
    }

    public void setCustomerCost(List<DataSourceAggregatedResponse> customerCost) {
        this.customerCost = customerCost;
    }

    public List<DataSourceAggregatedResponse> getROI() {
        return ROI;
    }

    public void setROI(List<DataSourceAggregatedResponse> ROI) {
        this.ROI = ROI;
    }

    public List<DataSourceAggregatedResponse> getDealsAmounts() {
        return dealsAmounts;
    }

    public void setDealsAmounts(List<DataSourceAggregatedResponse> dealsAmounts) {
        this.dealsAmounts = dealsAmounts;
    }

    public List<DataSourceAggregatedResponse> getCostsAmount() {
        return costsAmount;
    }

    public void setCostsAmount(List<DataSourceAggregatedResponse> costsAmount) {
        this.costsAmount = costsAmount;
    }

    public List<DataSourceAggregatedResponse> getLeadsNumber() {
        return leadsNumber;
    }

    public void setLeadsNumber(List<DataSourceAggregatedResponse> leadsNumber) {
        this.leadsNumber = leadsNumber;
    }

    public List<DataSourceAggregatedResponse> getCustomersNumber() {
        return customersNumber;
    }

    public void setCustomersNumber(List<DataSourceAggregatedResponse> customersNumber) {
        this.customersNumber = customersNumber;
    }

    public List<DataSourceAggregatedResponse> getDealsNumber() {
        return dealsNumber;
    }

    public void setDealsNumber(List<DataSourceAggregatedResponse> dealsNumber) {
        this.dealsNumber = dealsNumber;
    }

    public List<DataSourceAggregatedResponse> getCostsNumber() {
        return costsNumber;
    }

    public void setCostsNumber(List<DataSourceAggregatedResponse> costsNumber) {
        this.costsNumber = costsNumber;
    }

    public List<DataSourceAggregatedResponse> getConversionFromLeadToCustomer() {
        return conversionFromLeadToCustomer;
    }

    public void setConversionFromLeadToCustomer(List<DataSourceAggregatedResponse> conversionFromLeadToCustomer) {
        this.conversionFromLeadToCustomer = conversionFromLeadToCustomer;
    }

    public List<DataSourceAggregatedResponse> getLeadCost() {
        return leadCost;
    }

    public void setLeadCost(List<DataSourceAggregatedResponse> leadCost) {
        this.leadCost = leadCost;
    }

    public List<DataSourceAggregatedResponse> getAveragePayment() {
        return averagePayment;
    }

    public void setAveragePayment(List<DataSourceAggregatedResponse> averagePayment) {
        this.averagePayment = averagePayment;
    }

    public List<DataSourceAggregatedResponse> getLtv() {
        return ltv;
    }

    public void setLtv(List<DataSourceAggregatedResponse> ltv) {
        this.ltv = ltv;
    }

    public List<DataSourceAggregatedResponse> getDealsCycle() {
        return dealsCycle;
    }

    public void setDealsCycle(List<DataSourceAggregatedResponse> dealsCycle) {
        this.dealsCycle = dealsCycle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LeadGenAggregatedResponseFull that = (LeadGenAggregatedResponseFull) o;

        if (succeed != that.succeed) return false;
        if (ROI != null ? !ROI.equals(that.ROI) : that.ROI != null) return false;
        if (dealsAmounts != null ? !dealsAmounts.equals(that.dealsAmounts) : that.dealsAmounts != null) return false;
        if (costsAmount != null ? !costsAmount.equals(that.costsAmount) : that.costsAmount != null) return false;
        if (leadsNumber != null ? !leadsNumber.equals(that.leadsNumber) : that.leadsNumber != null) return false;
        if (customersNumber != null ? !customersNumber.equals(that.customersNumber) : that.customersNumber != null) return false;
        if (dealsNumber != null ? !dealsNumber.equals(that.dealsNumber) : that.dealsNumber != null) return false;
        if (costsNumber != null ? !costsNumber.equals(that.costsNumber) : that.costsNumber != null) return false;
        if (conversionFromLeadToCustomer != null ? !conversionFromLeadToCustomer.equals(that.conversionFromLeadToCustomer) : that.conversionFromLeadToCustomer != null) return false;
        if (leadCost != null ? !leadCost.equals(that.leadCost) : that.leadCost != null) return false;
        if (customerCost != null ? !customerCost.equals(that.customerCost) : that.customerCost != null) return false;
        if (averagePayment != null ? !averagePayment.equals(that.averagePayment) : that.averagePayment != null) return false;
        if (ltv != null ? !ltv.equals(that.ltv) : that.ltv != null) return false;
        return dealsCycle != null ? dealsCycle.equals(that.dealsCycle) : that.dealsCycle == null;

    }

    @Override
    public int hashCode() {
        int result = ROI != null ? ROI.hashCode() : 0;
        result = 31 * result + (dealsAmounts != null ? dealsAmounts.hashCode() : 0);
        result = 31 * result + (costsAmount != null ? costsAmount.hashCode() : 0);
        result = 31 * result + (leadsNumber != null ? leadsNumber.hashCode() : 0);
        result = 31 * result + (customersNumber != null ? customersNumber.hashCode() : 0);
        result = 31 * result + (dealsNumber != null ? dealsNumber.hashCode() : 0);
        result = 31 * result + (costsNumber != null ? costsNumber.hashCode() : 0);
        result = 31 * result + (conversionFromLeadToCustomer != null ? conversionFromLeadToCustomer.hashCode() : 0);
        result = 31 * result + (leadCost != null ? leadCost.hashCode() : 0);
        result = 31 * result + (customerCost != null ? customerCost.hashCode() : 0);
        result = 31 * result + (averagePayment != null ? averagePayment.hashCode() : 0);
        result = 31 * result + (ltv != null ? ltv.hashCode() : 0);
        result = 31 * result + (dealsCycle != null ? dealsCycle.hashCode() : 0);
        result = 31 * result + (succeed ? 1 : 0);
        return result;
    }
}
