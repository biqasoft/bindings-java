/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.indicators.dto;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.mongodb.core.index.Indexed;

import java.io.Serializable;
import java.math.BigDecimal;

public class DealStats implements Serializable {

    @ApiModelProperty(notes = "ID of useraccount created deal")
    @Indexed
    private String responsibleManagerID;

    private String customerDealID;
    private BigDecimal customerDealAmount;

    private long customerDealCycle;


    public String getResponsibleManagerID() {
        return responsibleManagerID;
    }

    public void setResponsibleManagerID(String responsibleManagerID) {
        this.responsibleManagerID = responsibleManagerID;
    }

    public String getCustomerDealID() {
        return customerDealID;
    }

    public void setCustomerDealID(String customerDealID) {
        this.customerDealID = customerDealID;
    }

    public BigDecimal getCustomerDealAmount() {
        return customerDealAmount;
    }

    public void setCustomerDealAmount(BigDecimal customerDealAmount) {
        this.customerDealAmount = customerDealAmount;
    }

    public long getCustomerDealCycle() {
        return customerDealCycle;
    }

    public void setCustomerDealCycle(long customerDealCycle) {
        this.customerDealCycle = customerDealCycle;
    }
}
