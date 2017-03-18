/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.analytics;

import io.swagger.annotations.ApiModel;
import org.javers.core.metamodel.annotation.Value;

import java.io.Serializable;

@ApiModel
@Value
public class UTMAllMetricInfo implements Serializable {

    private String type;
    private String utm_source;
    private String utm_medium;
    private String utm_campaign;
    private String utm_content;
    private String utm_term;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUtm_source() {
        return utm_source;
    }

    public void setUtm_source(String utm_source) {
        this.utm_source = utm_source;
    }

    public String getUtm_medium() {
        return utm_medium;
    }

    public void setUtm_medium(String utm_medium) {
        this.utm_medium = utm_medium;
    }

    public String getUtm_campaign() {
        return utm_campaign;
    }

    public void setUtm_campaign(String utm_campaign) {
        this.utm_campaign = utm_campaign;
    }

    public String getUtm_content() {
        return utm_content;
    }

    public void setUtm_content(String utm_content) {
        this.utm_content = utm_content;
    }

    public String getUtm_term() {
        return utm_term;
    }

    public void setUtm_term(String utm_term) {
        this.utm_term = utm_term;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UTMAllMetricInfo that = (UTMAllMetricInfo) o;

        if (utm_campaign != null ? !utm_campaign.equals(that.utm_campaign) : that.utm_campaign != null) return false;
        if (utm_medium != null ? !utm_medium.equals(that.utm_medium) : that.utm_medium != null) return false;
        if (utm_source != null ? !utm_source.equals(that.utm_source) : that.utm_source != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = utm_source != null ? utm_source.hashCode() : 0;
        result = 31 * result + (utm_medium != null ? utm_medium.hashCode() : 0);
        result = 31 * result + (utm_campaign != null ? utm_campaign.hashCode() : 0);
        return result;
    }
}
