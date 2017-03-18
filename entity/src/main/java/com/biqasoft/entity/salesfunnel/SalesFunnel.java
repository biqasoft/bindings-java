/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.salesfunnel;

import com.biqasoft.entity.core.BaseClass;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class SalesFunnel extends BaseClass {

    private boolean systemIssued = false;

    @Indexed
    private String type;
    @Indexed
    private String phase;

    private List<SalesFunnelStatus> salesFunnelStatuses = new ArrayList<>();


    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }


    public boolean isSystemIssued() {
        return systemIssued;
    }

    public void setSystemIssued(boolean systemIssued) {
        this.systemIssued = systemIssued;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<SalesFunnelStatus> getSalesFunnelStatuses() {
        return salesFunnelStatuses;
    }

    public void setSalesFunnelStatuses(List<SalesFunnelStatus> salesFunnelStatuses) {
        this.salesFunnelStatuses = salesFunnelStatuses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalesFunnel that = (SalesFunnel) o;

        if (systemIssued != that.systemIssued) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (phase != null ? !phase.equals(that.phase) : that.phase != null) return false;
        return salesFunnelStatuses != null ? salesFunnelStatuses.equals(that.salesFunnelStatuses) : that.salesFunnelStatuses == null;

    }

    @Override
    public int hashCode() {
        int result = (systemIssued ? 1 : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (phase != null ? phase.hashCode() : 0);
        result = 31 * result + (salesFunnelStatuses != null ? salesFunnelStatuses.hashCode() : 0);
        return result;
    }
}
