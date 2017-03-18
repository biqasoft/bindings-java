/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.customer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.javers.core.metamodel.annotation.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Value
@ApiModel("Some summary information about customer or lead")
public class CustomerOverview implements Serializable {

    @ApiModelProperty("Number of active tasks for customer")
    private long activeTaskNumber = 0;

    @ApiModelProperty("Amount of customer deals")
    private BigDecimal dealsAmount = new BigDecimal(BigInteger.ZERO);

    @ApiModelProperty("Average amount of customer deals")
    private BigDecimal averageDealsAmount = new BigDecimal(BigInteger.ZERO);

    @ApiModelProperty("Amount of customer opportunity")
    private BigDecimal opportunityAmount = new BigDecimal(BigInteger.ZERO);

    @ApiModelProperty("Average amount of customer opportunity")
    private BigDecimal averageOpportunityAmount = new BigDecimal(BigInteger.ZERO);

    @ApiModelProperty("Number of customer Opportunities")
    private long opportunityNumber = 0;

    @ApiModelProperty("Number of customer deals")
    private long dealsNumber = 0;

    @ApiModelProperty("Date when last deal was created")
    private Date lastDealDate;

    @ApiModelProperty("Date when last opportunity was created")
    private Date lastOpportunityDate;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerOverview that = (CustomerOverview) o;

        if (activeTaskNumber != that.activeTaskNumber) return false;
        if (opportunityNumber != that.opportunityNumber) return false;
        if (dealsNumber != that.dealsNumber) return false;
        if (dealsAmount != null ? !dealsAmount.equals(that.dealsAmount) : that.dealsAmount != null) return false;
        if (averageDealsAmount != null ? !averageDealsAmount.equals(that.averageDealsAmount) : that.averageDealsAmount != null) return false;
        if (opportunityAmount != null ? !opportunityAmount.equals(that.opportunityAmount) : that.opportunityAmount != null) return false;
        if (averageOpportunityAmount != null ? !averageOpportunityAmount.equals(that.averageOpportunityAmount) : that.averageOpportunityAmount != null) return false;
        if (lastDealDate != null ? !lastDealDate.equals(that.lastDealDate) : that.lastDealDate != null) return false;
        return lastOpportunityDate != null ? lastOpportunityDate.equals(that.lastOpportunityDate) : that.lastOpportunityDate == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (activeTaskNumber ^ (activeTaskNumber >>> 32));
        result = 31 * result + (dealsAmount != null ? dealsAmount.hashCode() : 0);
        result = 31 * result + (averageDealsAmount != null ? averageDealsAmount.hashCode() : 0);
        result = 31 * result + (opportunityAmount != null ? opportunityAmount.hashCode() : 0);
        result = 31 * result + (averageOpportunityAmount != null ? averageOpportunityAmount.hashCode() : 0);
        result = 31 * result + (int) (opportunityNumber ^ (opportunityNumber >>> 32));
        result = 31 * result + (int) (dealsNumber ^ (dealsNumber >>> 32));
        result = 31 * result + (lastDealDate != null ? lastDealDate.hashCode() : 0);
        result = 31 * result + (lastOpportunityDate != null ? lastOpportunityDate.hashCode() : 0);
        return result;
    }

    public BigDecimal getAverageDealsAmount() {
        return averageDealsAmount;
    }

    public void setAverageDealsAmount(BigDecimal averageDealsAmount) {
        this.averageDealsAmount = averageDealsAmount;
    }

    public BigDecimal getAverageOpportunityAmount() {
        return averageOpportunityAmount;
    }

    public void setAverageOpportunityAmount(BigDecimal averageOpportunityAmount) {
        this.averageOpportunityAmount = averageOpportunityAmount;
    }

    public Date getLastDealDate() {
        return lastDealDate;
    }

    public void setLastDealDate(Date lastDealDate) {
        this.lastDealDate = lastDealDate;
    }

    public Date getLastOpportunityDate() {
        return lastOpportunityDate;
    }

    public void setLastOpportunityDate(Date lastOpportunityDate) {
        this.lastOpportunityDate = lastOpportunityDate;
    }

    public long getActiveTaskNumber() {
        return activeTaskNumber;
    }

    public void setActiveTaskNumber(long activeTaskNumber) {
        this.activeTaskNumber = activeTaskNumber;
    }

    public BigDecimal getDealsAmount() {
        return dealsAmount;
    }

    public void setDealsAmount(BigDecimal dealsAmount) {
        this.dealsAmount = dealsAmount;
    }

    public BigDecimal getOpportunityAmount() {
        return opportunityAmount;
    }

    public void setOpportunityAmount(BigDecimal opportunityAmount) {
        this.opportunityAmount = opportunityAmount;
    }

    public long getOpportunityNumber() {
        return opportunityNumber;
    }

    public void setOpportunityNumber(long opportunityNumber) {
        this.opportunityNumber = opportunityNumber;
    }

    public long getDealsNumber() {
        return dealsNumber;
    }

    public void setDealsNumber(long dealsNumber) {
        this.dealsNumber = dealsNumber;
    }
}
