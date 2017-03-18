/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.payments;

import com.biqasoft.entity.system.ConnectedInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@ApiModel
public class CustomerDeal extends Payment {

    @Indexed
    private ConnectedInfo connectedInfo = new ConnectedInfo();

    @ApiModelProperty(value = "If we transfer (win) opportunity to deal",
            notes = "cycle deals. Used to get LTV & time between we get opportunity and then sell smth. " +
                    "If it `null` - That mean that we just create new opportunity instead of transfer from opportunity. And this is bad practise")
    private Date opportunityCreatedDate = null;
    private String opportunityCreatedById = null;


    @ApiModelProperty("time between creating opportunity and transfer to deal IN SECONDS")
    private long dealsCycle;


    public long getDealsCycle() {
        return dealsCycle;
    }

    public void setDealsCycle(long dealsCycle) {
        this.dealsCycle = dealsCycle;
    }


    public String getOpportunityCreatedById() {
        return opportunityCreatedById;
    }

    public void setOpportunityCreatedById(String opportunityCreatedById) {
        this.opportunityCreatedById = opportunityCreatedById;
    }

    public Date getOpportunityCreatedDate() {
        return opportunityCreatedDate;
    }

    public void setOpportunityCreatedDate(Date opportunityCreatedDate) {
        this.opportunityCreatedDate = opportunityCreatedDate;
    }

    public ConnectedInfo getConnectedInfo() {
        return connectedInfo;
    }

    public void setConnectedInfo(ConnectedInfo connectedInfo) {
        this.connectedInfo = connectedInfo;
    }
}
