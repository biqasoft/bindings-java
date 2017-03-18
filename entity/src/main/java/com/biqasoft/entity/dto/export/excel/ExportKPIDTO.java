/*
 * Copyright 2016 the original author or authors.
 */

package com.biqasoft.entity.dto.export.excel;

import com.biqasoft.entity.datasources.DataSource;
import com.biqasoft.entity.filters.DataSourceFilter;

import java.util.List;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 7/11/2016
 *         All Rights Reserved
 */
public class ExportKPIDTO extends ExportV1Base {

    private List<DataSource> resultedObjects;
    private DataSourceFilter dataSourceFilter;

    public List<DataSource> getResultedObjects() {
        return resultedObjects;
    }

    public void setResultedObjects(List<DataSource> resultedObjects) {
        this.resultedObjects = resultedObjects;
    }

    public DataSourceFilter getDataSourceFilter() {
        return dataSourceFilter;
    }

    public void setDataSourceFilter(DataSourceFilter dataSourceFilter) {
        this.dataSourceFilter = dataSourceFilter;
    }
}
