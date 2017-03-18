/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.analytics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CustomerWebAnalytics implements Serializable {

    private List<String> cookiesIds = new ArrayList<>();


    public List<String> getCookiesIds() {
        return cookiesIds;
    }

    public void setCookiesIds(List<String> cookiesIds) {
        this.cookiesIds = cookiesIds;
    }
}
