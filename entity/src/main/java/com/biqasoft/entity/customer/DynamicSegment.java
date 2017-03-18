/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.customer;

import com.biqasoft.entity.core.BaseClass;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.mongodb.core.mapping.Document;
import com.biqasoft.entity.filters.CustomerFilter;

import java.util.Date;

@Document
@ApiModel(description = "This is dynamic segment with customer builder")
public class DynamicSegment extends BaseClass {

    private CustomerFilter customerBuilder;


    @ApiModelProperty(" limit this segments with pagination\n" +
            " WARNINGS: this can exclude some customers\n" +
            " and you will see only some PART\n" +
            " of customers")
    private boolean usePagination;

    private Date lastUpdate = null;
    private Long lastUpdateNumber = 0L;


    public CustomerFilter getCustomerBuilder() {
        return customerBuilder;
    }

    public void setCustomerBuilder(CustomerFilter customerBuilder) {
        this.customerBuilder = customerBuilder;
    }

    public boolean isUsePagination() {
        return usePagination;
    }

    public void setUsePagination(boolean usePagination) {
        this.usePagination = usePagination;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Long getLastUpdateNumber() {
        return lastUpdateNumber;
    }

    public void setLastUpdateNumber(Long lastUpdateNumber) {
        this.lastUpdateNumber = lastUpdateNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DynamicSegment that = (DynamicSegment) o;

        if (usePagination != that.usePagination) return false;
        if (customerBuilder != null ? !customerBuilder.equals(that.customerBuilder) : that.customerBuilder != null)
            return false;
        if (lastUpdate != null ? !lastUpdate.equals(that.lastUpdate) : that.lastUpdate != null) return false;
        return lastUpdateNumber != null ? lastUpdateNumber.equals(that.lastUpdateNumber) : that.lastUpdateNumber == null;

    }

    @Override
    public int hashCode() {
        int result = customerBuilder != null ? customerBuilder.hashCode() : 0;
        result = 31 * result + (usePagination ? 1 : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        result = 31 * result + (lastUpdateNumber != null ? lastUpdateNumber.hashCode() : 0);
        return result;
    }
}
