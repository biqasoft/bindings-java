/*
 * Copyright 2016 the original author or authors.
 */

package com.biqasoft.entity.dto.export.excel;

import com.biqasoft.entity.filters.CustomObjectsDataFilter;
import com.biqasoft.entity.core.objects.CustomObjectData;
import com.biqasoft.entity.objects.CustomObjectTemplate;

import java.io.Serializable;
import java.util.List;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 7/11/2016
 *         All Rights Reserved
 */
public class ExportCustomObjectDTO extends ExportV1Base  implements Serializable {

    private CustomObjectTemplate customObjectTemplate;
    private CustomObjectsDataFilter builder;
    private List<CustomObjectData> list;

    public CustomObjectTemplate getCustomObjectTemplate() {
        return customObjectTemplate;
    }

    public void setCustomObjectTemplate(CustomObjectTemplate customObjectTemplate) {
        this.customObjectTemplate = customObjectTemplate;
    }

    public CustomObjectsDataFilter getBuilder() {
        return builder;
    }

    public void setBuilder(CustomObjectsDataFilter builder) {
        this.builder = builder;
    }

    public List<CustomObjectData> getList() {
        return list;
    }

    public void setList(List<CustomObjectData> list) {
        this.list = list;
    }
}
