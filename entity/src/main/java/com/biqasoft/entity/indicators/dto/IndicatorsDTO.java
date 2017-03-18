/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.indicators.dto;

import com.biqasoft.entity.datasources.history.scratch.AbstractDataSourceHistoryItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.javers.core.metamodel.annotation.Value;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.math.BigInteger;

@Document
@Value
@ApiModel("This object is statistics for leadGenProject or leadGenMethod")
public class IndicatorsDTO extends AbstractDataSourceHistoryItem {

    private String type;

    private String indicatorID;

    @ApiModelProperty("Return On Investment")
    private BigDecimal ROI = new BigDecimal(BigInteger.ZERO);

    @ApiModelProperty("Amount of all deals")
    private BigDecimal dealsAmounts = new BigDecimal(BigInteger.ZERO);

    @ApiModelProperty("Amount of all costs")
    private BigDecimal costsAmount = new BigDecimal(BigInteger.ZERO);

    @ApiModelProperty("Leads number")
    private long leadsNumber;

    @ApiModelProperty("customer number")
    private long customersNumber;

    @ApiModelProperty("Deals number")
    private long dealsNumber;

    @ApiModelProperty("Costs number")
    private long costsNumber;

    @ApiModelProperty("Conversion (CV) from lead to customer")
    private BigDecimal conversionFromLeadToCustomer = new BigDecimal(BigInteger.ZERO);

    @ApiModelProperty("Lead cost - How much we pay for a Lead borrowed")
    private BigDecimal leadCost = new BigDecimal(BigInteger.ZERO);

    @ApiModelProperty("Lead cost - How much we pay for a Lead borrowed")
    private BigDecimal customerCost = new BigDecimal(BigInteger.ZERO);

    @ApiModelProperty("Average payment ( deal ) from customer")
    private BigDecimal averagePayment = new BigDecimal(BigInteger.ZERO);

    @ApiModelProperty("Formula: (all deals amount) / ( customer number )")
    private BigDecimal ltv;

    @ApiModelProperty("time between creating opportunity and transfer to deal IN SECONDS")
    private BigDecimal dealsCycle = new BigDecimal(BigInteger.ZERO);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IndicatorsDTO that = (IndicatorsDTO) o;

        if (leadsNumber != that.leadsNumber) return false;
        if (customersNumber != that.customersNumber) return false;
        if (dealsNumber != that.dealsNumber) return false;
        if (costsNumber != that.costsNumber) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (indicatorID != null ? !indicatorID.equals(that.indicatorID) : that.indicatorID != null) return false;
        if (ROI != null ? !ROI.equals(that.ROI) : that.ROI != null) return false;
        if (dealsAmounts != null ? !dealsAmounts.equals(that.dealsAmounts) : that.dealsAmounts != null) return false;
        if (costsAmount != null ? !costsAmount.equals(that.costsAmount) : that.costsAmount != null) return false;
        if (conversionFromLeadToCustomer != null ? !conversionFromLeadToCustomer.equals(that.conversionFromLeadToCustomer) : that.conversionFromLeadToCustomer != null)
            return false;
        if (leadCost != null ? !leadCost.equals(that.leadCost) : that.leadCost != null) return false;
        if (customerCost != null ? !customerCost.equals(that.customerCost) : that.customerCost != null) return false;
        if (averagePayment != null ? !averagePayment.equals(that.averagePayment) : that.averagePayment != null)
            return false;
        if (ltv != null ? !ltv.equals(that.ltv) : that.ltv != null) return false;
        return dealsCycle != null ? dealsCycle.equals(that.dealsCycle) : that.dealsCycle == null;

    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (indicatorID != null ? indicatorID.hashCode() : 0);
        result = 31 * result + (ROI != null ? ROI.hashCode() : 0);
        result = 31 * result + (dealsAmounts != null ? dealsAmounts.hashCode() : 0);
        result = 31 * result + (costsAmount != null ? costsAmount.hashCode() : 0);
        result = 31 * result + (int) (leadsNumber ^ (leadsNumber >>> 32));
        result = 31 * result + (int) (customersNumber ^ (customersNumber >>> 32));
        result = 31 * result + (int) (dealsNumber ^ (dealsNumber >>> 32));
        result = 31 * result + (int) (costsNumber ^ (costsNumber >>> 32));
        result = 31 * result + (conversionFromLeadToCustomer != null ? conversionFromLeadToCustomer.hashCode() : 0);
        result = 31 * result + (leadCost != null ? leadCost.hashCode() : 0);
        result = 31 * result + (customerCost != null ? customerCost.hashCode() : 0);
        result = 31 * result + (averagePayment != null ? averagePayment.hashCode() : 0);
        result = 31 * result + (ltv != null ? ltv.hashCode() : 0);
        result = 31 * result + (dealsCycle != null ? dealsCycle.hashCode() : 0);
        return result;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndicatorID() {
        return indicatorID;
    }

    public void setIndicatorID(String indicatorID) {
        this.indicatorID = indicatorID;
    }

    public BigDecimal getROI() {
        return ROI;
    }

    public void setROI(BigDecimal ROI) {
        this.ROI = ROI;
    }

    public BigDecimal getDealsAmounts() {
        return dealsAmounts;
    }

    public void setDealsAmounts(BigDecimal dealsAmounts) {
        this.dealsAmounts = dealsAmounts;
    }

    public BigDecimal getCostsAmount() {
        return costsAmount;
    }

    public void setCostsAmount(BigDecimal costsAmount) {
        this.costsAmount = costsAmount;
    }

    public long getLeadsNumber() {
        return leadsNumber;
    }

    public void setLeadsNumber(long leadsNumber) {
        this.leadsNumber = leadsNumber;
    }

    public long getCustomersNumber() {
        return customersNumber;
    }

    public void setCustomersNumber(long customersNumber) {
        this.customersNumber = customersNumber;
    }

    public long getDealsNumber() {
        return dealsNumber;
    }

    public void setDealsNumber(long dealsNumber) {
        this.dealsNumber = dealsNumber;
    }

    public long getCostsNumber() {
        return costsNumber;
    }

    public void setCostsNumber(long costsNumber) {
        this.costsNumber = costsNumber;
    }

    public BigDecimal getConversionFromLeadToCustomer() {
        return conversionFromLeadToCustomer;
    }

    public void setConversionFromLeadToCustomer(BigDecimal conversionFromLeadToCustomer) {
        this.conversionFromLeadToCustomer = conversionFromLeadToCustomer;
    }

    public BigDecimal getLeadCost() {
        return leadCost;
    }

    public void setLeadCost(BigDecimal leadCost) {
        this.leadCost = leadCost;
    }

    public BigDecimal getCustomerCost() {
        return customerCost;
    }

    public void setCustomerCost(BigDecimal customerCost) {
        this.customerCost = customerCost;
    }

    public BigDecimal getAveragePayment() {
        return averagePayment;
    }

    public void setAveragePayment(BigDecimal averagePayment) {
        this.averagePayment = averagePayment;
    }

    public BigDecimal getLtv() {
        return ltv;
    }

    public void setLtv(BigDecimal ltv) {
        this.ltv = ltv;
    }

    public BigDecimal getDealsCycle() {
        return dealsCycle;
    }

    public void setDealsCycle(BigDecimal dealsCycle) {
        this.dealsCycle = dealsCycle;
    }
}
