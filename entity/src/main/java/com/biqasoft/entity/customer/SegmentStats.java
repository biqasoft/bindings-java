/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.customer;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 * Date: 5/26/2015
 * All Rights Reserved
 */

@ApiModel
public class SegmentStats implements Serializable {

    private long leadsCount;
    private long customerCount;

    private BigDecimal dealsAmount = new BigDecimal(BigInteger.ZERO);
    private BigDecimal opportunityAmount = new BigDecimal(BigInteger.ZERO);

    private long dealsNumber;
    private long opportunityNumber;


    public long getDealsNumber() {
        return dealsNumber;
    }

    public void setDealsNumber(long dealsNumber) {
        this.dealsNumber = dealsNumber;
    }

    public long getOpportunityNumber() {
        return opportunityNumber;
    }

    public void setOpportunityNumber(long opportunityNumber) {
        this.opportunityNumber = opportunityNumber;
    }

    public long getLeadsCount() {
        return leadsCount;
    }

    public void setLeadsCount(long leadsCount) {
        this.leadsCount = leadsCount;
    }

    public long getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(long customerCount) {
        this.customerCount = customerCount;
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
}
