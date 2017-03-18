/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.dto.httpresponse;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nikita Bakaev, ya@nbakaev.ru on 2/4/2016.
 * All Rights Reserved
 */
public class CustomObjectSearchResult {

    /**
     * key is customObjectTemplate id
     */
    private Map<String,CustomObjectSearchResultNode > customObjects = new HashMap<>();

    private long objectNumber;

    public long getObjectNumber() {
        return objectNumber;
    }

    public void setObjectNumber(long objectNumber) {
        this.objectNumber = objectNumber;
    }

    public Map<String, CustomObjectSearchResultNode> getCustomObjects() {
        return customObjects;
    }

    public void setCustomObjects(Map<String, CustomObjectSearchResultNode> customObjects) {
        this.customObjects = customObjects;
    }
}
