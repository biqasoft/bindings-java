/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.analytics;

import org.javers.core.metamodel.annotation.Value;

import java.io.Serializable;

@Value
public class MarketingScore implements Serializable {


    private UTMAllMetricInfo utm = null;
    private String telephone = null;
    private String promo = null;


    public UTMAllMetricInfo getUtm() {
        return utm;
    }

    public void setUtm(UTMAllMetricInfo utm) {
        this.utm = utm;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarketingScore that = (MarketingScore) o;

        if (utm != null ? !utm.equals(that.utm) : that.utm != null) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        return promo != null ? promo.equals(that.promo) : that.promo == null;

    }

    @Override
    public int hashCode() {
        int result = utm != null ? utm.hashCode() : 0;
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (promo != null ? promo.hashCode() : 0);
        return result;
    }
}
