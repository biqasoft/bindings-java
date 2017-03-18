/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.dto.httpresponse;

import com.biqasoft.entity.core.objects.CustomObjectData;
import com.biqasoft.entity.objects.CustomObjectTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nikita Bakaev, ya@nbakaev.ru on 2/4/2016.
 * All Rights Reserved
 */
public class CustomObjectSearchResultNode {

    private CustomObjectTemplate customObjectTemplate = null;
    private List<CustomObjectData> customObjectDataList = new ArrayList<>();


    public CustomObjectTemplate getCustomObjectTemplate() {
        return customObjectTemplate;
    }

    public void setCustomObjectTemplate(CustomObjectTemplate customObjectTemplate) {
        this.customObjectTemplate = customObjectTemplate;
    }

    public List<CustomObjectData> getCustomObjectDataList() {
        return customObjectDataList;
    }

    public void setCustomObjectDataList(List<CustomObjectData> customObjectDataList) {
        this.customObjectDataList = customObjectDataList;
    }
}
