/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.datasources.history.response;

import io.swagger.annotations.ApiModel;
import org.javers.core.metamodel.annotation.Value;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Document
@Value
@ApiModel("This is embeddable object to other object, which contains some statistics that is cached and updated in some period")
public class DataSourceAggregatedResponse implements Serializable {

    private BigDecimal value;
    private Date date;

    public DataSourceAggregatedResponse() {
    }

    public DataSourceAggregatedResponse(BigDecimal value, Date date) {
        this.value = value;
        this.date = date;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataSourceAggregatedResponse that = (DataSourceAggregatedResponse) o;

        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        return date != null ? date.equals(that.date) : that.date == null;

    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
