/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.filters;

import com.biqasoft.entity.core.BaseClassFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

@ApiModel(" This is CompanyBuilder ( Filter) for customers and leads")
public class CompanyFilter extends BaseClassFilter {

    @ApiModelProperty("show only when current user is responsible manager")
    private boolean onlyPartner;

    @ApiModelProperty("show only leads")
    private boolean onlyClient;

    @ApiModelProperty("show only companies when responsible managers is IDs of the following accounts ('responsiblesManagersList') - param")
    private boolean useResponsiblesManagersList = false;

    @ApiModelProperty("array of IDs responsible managers accounts")
    private List<String> responsiblesManagersList = new ArrayList<>();

    @ApiModelProperty("show only companies when responsible managers is IDs of the following accounts ('responsiblesManagersList') - param")
    private boolean useCompanyIDsList = false;

    @ApiModelProperty("array of IDs customers")
    private List<String> companyIDsList = new ArrayList<>();

    @ApiModelProperty("show only active leads and customers")
    private boolean active;

    @ApiModelProperty("show only important leads and customers")
    private boolean important;

    @ApiModelProperty("show only when current user is responsible manager")
    private boolean showOnlyWhenIamResponsible;


    public boolean isShowOnlyWhenIamResponsible() {
        return showOnlyWhenIamResponsible;
    }

    public void setShowOnlyWhenIamResponsible(boolean showOnlyWhenIamResponsible) {
        this.showOnlyWhenIamResponsible = showOnlyWhenIamResponsible;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isImportant() {
        return important;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }

    public boolean isUseCompanyIDsList() {
        return useCompanyIDsList;
    }

    public void setUseCompanyIDsList(boolean useCompanyIDsList) {
        this.useCompanyIDsList = useCompanyIDsList;
    }

    public List<String> getCompanyIDsList() {
        return companyIDsList;
    }

    public void setCompanyIDsList(List<String> companyIDsList) {
        this.companyIDsList = companyIDsList;
    }

    public boolean isUseResponsiblesManagersList() {
        return useResponsiblesManagersList;
    }

    public void setUseResponsiblesManagersList(boolean useResponsiblesManagersList) {
        this.useResponsiblesManagersList = useResponsiblesManagersList;
    }

    public List<String> getResponsiblesManagersList() {
        return responsiblesManagersList;
    }

    public void setResponsiblesManagersList(List<String> responsiblesManagersList) {
        this.responsiblesManagersList = responsiblesManagersList;
    }

    public boolean isOnlyClient() {
        return onlyClient;
    }

    public void setOnlyClient(boolean onlyClient) {
        this.onlyClient = onlyClient;
    }

    public boolean isOnlyPartner() {
        return onlyPartner;
    }

    public void setOnlyPartner(boolean onlyPartner) {
        this.onlyPartner = onlyPartner;
    }
}
