/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.dto.httpresponse;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

@ApiModel(description = "Dropbox and other common link, which user should follow to go or download or smth else")
public class LinkFieldDataResponse implements Serializable {

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
