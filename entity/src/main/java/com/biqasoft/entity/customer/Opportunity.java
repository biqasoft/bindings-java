/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.customer;

import com.biqasoft.entity.payments.Payment;
import com.biqasoft.entity.system.ConnectedInfo;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Date;

public class Opportunity extends Payment {

    @Indexed
    private int priority;

    @Indexed
    private boolean active;

    private Date startDate;
    private Date finalDate;

    private ConnectedInfo connectedInfo = new ConnectedInfo();


    public ConnectedInfo getConnectedInfo() {
        return connectedInfo;
    }

    public void setConnectedInfo(ConnectedInfo connectedInfo) {
        this.connectedInfo = connectedInfo;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }


    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

}
