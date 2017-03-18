/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.datasources.history.response;

import io.swagger.annotations.ApiModel;
import org.javers.core.metamodel.annotation.Value;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Value
@ApiModel("This is embeddable object to other object, which contains some statistics that is cached and updated in some period")
public class DataSourceIntegerAggregatedResponseFull implements Serializable {

    private List<DataSourceIntegerAggregatedResponse> values = new ArrayList<>();


    public List<DataSourceIntegerAggregatedResponse> getValues() {
        return values;
    }

    public void setValues(List<DataSourceIntegerAggregatedResponse> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataSourceIntegerAggregatedResponseFull that = (DataSourceIntegerAggregatedResponseFull) o;

        return values != null ? values.equals(that.values) : that.values == null;

    }

    @Override
    public int hashCode() {
        return values != null ? values.hashCode() : 0;
    }
}
