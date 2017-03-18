/*
 * Copyright 2016 the original author or authors.
 */

package com.biqasoft.entity.dto.export.excel;

import com.biqasoft.entity.filters.LeadGenMethodExcelFilter;

import java.util.List;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 7/11/2016
 *         All Rights Reserved
 */
public class ExportLeadGenMethodDTO extends ExportV1Base {

    private List<ExportLeadGenMethodWithProjects> resultedObjects;
    private LeadGenMethodExcelFilter leadGenMethodBuilder;


    public List<ExportLeadGenMethodWithProjects> getResultedObjects() {
        return resultedObjects;
    }

    public void setResultedObjects(List<ExportLeadGenMethodWithProjects> resultedObjects) {
        this.resultedObjects = resultedObjects;
    }

    public LeadGenMethodExcelFilter getLeadGenMethodBuilder() {
        return leadGenMethodBuilder;
    }

    public void setLeadGenMethodBuilder(LeadGenMethodExcelFilter leadGenMethodBuilder) {
        this.leadGenMethodBuilder = leadGenMethodBuilder;
    }
}
