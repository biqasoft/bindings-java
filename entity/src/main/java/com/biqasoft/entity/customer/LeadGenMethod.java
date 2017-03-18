/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.customer;

import com.biqasoft.entity.core.BaseClass;
import com.biqasoft.entity.system.ConnectedInfo;
import org.javers.core.metamodel.annotation.DiffIgnore;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import com.biqasoft.entity.datasources.CacheableMetaInfo;
import com.biqasoft.entity.indicators.dto.IndicatorsDTO;
import com.biqasoft.entity.salesfunnel.SalesFunnel;
import com.biqasoft.entity.annotations.BiqaDontOverrideField;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeadGenMethod extends BaseClass {

    @Indexed
    private boolean active = true;

    @DBRef
    private SalesFunnel leadGenSalesFunnel = null;

    @DBRef
    private SalesFunnel leadConversionSalesFunnel = null;

    @DBRef
    private SalesFunnel accountManagementSalesFunnel = null;

    private List<LeadGenProject> leadGenProjects = new ArrayList<>();

    private Date startDate;
    private Date finalDate;

    private ConnectedInfo connectedInfo = new ConnectedInfo();

    @DiffIgnore
    @BiqaDontOverrideField
    private CacheableMetaInfo cachedKPIsMetaInfo = new CacheableMetaInfo();

    @DiffIgnore
    @BiqaDontOverrideField
    private IndicatorsDTO cachedKPIsData = new IndicatorsDTO();


    public CacheableMetaInfo getCachedKPIsMetaInfo() {
        return cachedKPIsMetaInfo;
    }

    public void setCachedKPIsMetaInfo(CacheableMetaInfo cachedKPIsMetaInfo) {
        this.cachedKPIsMetaInfo = cachedKPIsMetaInfo;
    }

    public IndicatorsDTO getCachedKPIsData() {
        return cachedKPIsData;
    }

    public void setCachedKPIsData(IndicatorsDTO cachedKPIsData) {
        this.cachedKPIsData = cachedKPIsData;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public ConnectedInfo getConnectedInfo() {
        return connectedInfo;
    }

    public void setConnectedInfo(ConnectedInfo connectedInfo) {
        this.connectedInfo = connectedInfo;
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

    public SalesFunnel getLeadGenSalesFunnel() {
        return leadGenSalesFunnel;
    }

    public void setLeadGenSalesFunnel(SalesFunnel leadGenSalesFunnel) {
        this.leadGenSalesFunnel = leadGenSalesFunnel;
    }

    public SalesFunnel getLeadConversionSalesFunnel() {
        return leadConversionSalesFunnel;
    }

    public void setLeadConversionSalesFunnel(SalesFunnel leadConversionSalesFunnel) {
        this.leadConversionSalesFunnel = leadConversionSalesFunnel;
    }

    public SalesFunnel getAccountManagementSalesFunnel() {
        return accountManagementSalesFunnel;
    }

    public void setAccountManagementSalesFunnel(SalesFunnel accountManagementSalesFunnel) {
        this.accountManagementSalesFunnel = accountManagementSalesFunnel;
    }

    public List<LeadGenProject> getLeadGenProjects() {
        return leadGenProjects;
    }

    public void setLeadGenProjects(List<LeadGenProject> leadGenProjects) {
        this.leadGenProjects = leadGenProjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LeadGenMethod that = (LeadGenMethod) o;

        if (active != that.active) return false;
        if (leadGenSalesFunnel != null ? !leadGenSalesFunnel.equals(that.leadGenSalesFunnel) : that.leadGenSalesFunnel != null)
            return false;
        if (leadConversionSalesFunnel != null ? !leadConversionSalesFunnel.equals(that.leadConversionSalesFunnel) : that.leadConversionSalesFunnel != null)
            return false;
        if (accountManagementSalesFunnel != null ? !accountManagementSalesFunnel.equals(that.accountManagementSalesFunnel) : that.accountManagementSalesFunnel != null)
            return false;
        if (leadGenProjects != null ? !leadGenProjects.equals(that.leadGenProjects) : that.leadGenProjects != null)
            return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (finalDate != null ? !finalDate.equals(that.finalDate) : that.finalDate != null) return false;
        if (connectedInfo != null ? !connectedInfo.equals(that.connectedInfo) : that.connectedInfo != null)
            return false;
        if (cachedKPIsMetaInfo != null ? !cachedKPIsMetaInfo.equals(that.cachedKPIsMetaInfo) : that.cachedKPIsMetaInfo != null)
            return false;
        return cachedKPIsData != null ? cachedKPIsData.equals(that.cachedKPIsData) : that.cachedKPIsData == null;

    }

    @Override
    public int hashCode() {
        int result = (active ? 1 : 0);
        result = 31 * result + (leadGenSalesFunnel != null ? leadGenSalesFunnel.hashCode() : 0);
        result = 31 * result + (leadConversionSalesFunnel != null ? leadConversionSalesFunnel.hashCode() : 0);
        result = 31 * result + (accountManagementSalesFunnel != null ? accountManagementSalesFunnel.hashCode() : 0);
        result = 31 * result + (leadGenProjects != null ? leadGenProjects.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (finalDate != null ? finalDate.hashCode() : 0);
        result = 31 * result + (connectedInfo != null ? connectedInfo.hashCode() : 0);
        result = 31 * result + (cachedKPIsMetaInfo != null ? cachedKPIsMetaInfo.hashCode() : 0);
        result = 31 * result + (cachedKPIsData != null ? cachedKPIsData.hashCode() : 0);
        return result;
    }
}
