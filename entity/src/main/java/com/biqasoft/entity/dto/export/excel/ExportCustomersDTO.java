/*
 * Copyright 2016 the original author or authors.
 */

package com.biqasoft.entity.dto.export.excel;

import com.biqasoft.entity.customer.Customer;
import com.biqasoft.entity.filters.CustomerFilter;

import java.util.List;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 7/11/2016
 *         All Rights Reserved
 */
public class ExportCustomersDTO extends ExportV1Base {

    private List<Customer> resultedObjects;
    private CustomerFilter customerFilter;

    public CustomerFilter getCustomerFilter() {
        return customerFilter;
    }

    public void setCustomerFilter(CustomerFilter customerFilter) {
        this.customerFilter = customerFilter;
    }

    public List<Customer> getResultedObjects() {
        return resultedObjects;
    }

    public void setResultedObjects(List<Customer> resultedObjects) {
        this.resultedObjects = resultedObjects;
    }

}
