/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.customer;

import com.biqasoft.entity.analytics.UTMAllMetricInfo;
import com.biqasoft.entity.datasources.CacheableMetaInfo;
import com.biqasoft.entity.indicators.dto.IndicatorsDTO;
import com.biqasoft.entity.core.BaseClass;
import org.javers.core.metamodel.annotation.DiffIgnore;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeadGenProject extends BaseClass {

    @Indexed
    private String leadGenMethodId;

    @Indexed
    private boolean active = true;

    @Indexed
    private Date startDate;
    @Indexed
    private Date finalDate;

    private double plannedCosts = 0;
    private double plannedDeals = 0;

    private List<UTMAllMetricInfo> utm_metrics = new ArrayList<>();

    private List<String> telephones = new ArrayList<>();
    private List<String> promoCodes = new ArrayList<>();

    private List<Integer> yandexDirectCompaignsIds = new ArrayList<>();
    private List<String> costsIDs = new ArrayList<>();

    @DiffIgnore
    private CacheableMetaInfo cachedKPIsMetaInfo = new CacheableMetaInfo();
    @DiffIgnore
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

    public List<Integer> getYandexDirectCompaignsIds() {
        return yandexDirectCompaignsIds;
    }

    public void setYandexDirectCompaignsIds(List<Integer> yandexDirectCompaignsIds) {
        this.yandexDirectCompaignsIds = yandexDirectCompaignsIds;
    }


    public double getPlannedCosts() {
        return plannedCosts;
    }

    public void setPlannedCosts(double plannedCosts) {
        this.plannedCosts = plannedCosts;
    }

    public double getPlannedDeals() {
        return plannedDeals;
    }

    public void setPlannedDeals(double plannedDeals) {
        this.plannedDeals = plannedDeals;
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

    public List<String> getCostsIDs() {
        return costsIDs;
    }

    public void setCostsIDs(List<String> costsIDs) {
        this.costsIDs = costsIDs;
    }

    public List<String> getTelephones() {
        return telephones;
    }


    public void setTelephones(List<String> telephones) {
        this.telephones = telephones;
    }

    public List<String> getPromoCodes() {
        return promoCodes;
    }

    public void setPromoCodes(List<String> promoCodes) {
        this.promoCodes = promoCodes;
    }

    public List<UTMAllMetricInfo> getUtm_metrics() {
        return utm_metrics;
    }

    public void setUtm_metrics(List<UTMAllMetricInfo> utm_metrics) {
        this.utm_metrics = utm_metrics;
    }

    public String getLeadGenMethodId() {
        return leadGenMethodId;
    }

    public void setLeadGenMethodId(String leadGenMethodId) {
        this.leadGenMethodId = leadGenMethodId;
    }

}
