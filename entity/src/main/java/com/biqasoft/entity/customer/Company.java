/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.customer;

import com.biqasoft.entity.core.BaseClass;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Company extends BaseClass {

    private String site;
    private String telephone;
    private String email;

    @Indexed
    private boolean partner;
    @Indexed
    private boolean client;

    @Indexed
    private String responsibleManagerID;

    @ApiModelProperty(notes = "is this customer active (true, false). Used to filter not relevant customers and leads")
    @Indexed
    private boolean active;

    @ApiModelProperty(notes = "is this customer important (true, false). Used to filter not relevant customers and leads")
    private boolean important;


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

    public boolean isPartner() {
        return partner;
    }

    public void setPartner(boolean partner) {
        this.partner = partner;
    }

    public boolean isClient() {
        return client;
    }

    public void setClient(boolean client) {
        this.client = client;
    }


    //    private String totalReceivedMoney;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getResponsibleManagerID() {
        return responsibleManagerID;
    }

    public void setResponsibleManagerID(String responsibleManagerID) {
        this.responsibleManagerID = responsibleManagerID;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (partner != company.partner) return false;
        if (client != company.client) return false;
        if (active != company.active) return false;
        if (important != company.important) return false;
        if (site != null ? !site.equals(company.site) : company.site != null) return false;
        if (telephone != null ? !telephone.equals(company.telephone) : company.telephone != null) return false;
        if (email != null ? !email.equals(company.email) : company.email != null) return false;
        return responsibleManagerID != null ? responsibleManagerID.equals(company.responsibleManagerID) : company.responsibleManagerID == null;

    }

    @Override
    public int hashCode() {
        int result = site != null ? site.hashCode() : 0;
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (partner ? 1 : 0);
        result = 31 * result + (client ? 1 : 0);
        result = 31 * result + (responsibleManagerID != null ? responsibleManagerID.hashCode() : 0);
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (important ? 1 : 0);
        return result;
    }
}
