/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.payments;

import com.biqasoft.entity.core.BaseClass;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.mongodb.core.index.Indexed;

import java.math.BigDecimal;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public abstract class Payment extends BaseClass {

    protected BigDecimal amount = new BigDecimal("0");

    @Indexed
    protected String leadGenProjectId = null;
    @Indexed
    protected String leadGenMethodId = null;
    @Indexed
    protected boolean dynamicControlled = false;


    public String getLeadGenProjectId() {
        return leadGenProjectId;
    }

    public void setLeadGenProjectId(String leadGenProjectId) {
        this.leadGenProjectId = leadGenProjectId;
    }

    public String getLeadGenMethodId() {
        return leadGenMethodId;
    }

    public void setLeadGenMethodId(String leadGenMethodId) {
        this.leadGenMethodId = leadGenMethodId;
    }

    public boolean isDynamicControlled() {
        return dynamicControlled;
    }

    public void setDynamicControlled(boolean dynamicControlled) {
        this.dynamicControlled = dynamicControlled;
    }


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}
