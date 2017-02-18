/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.microservice.common.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 * Date: 10/9/2015
 * All Rights Reserved
 */

public class OAuth2NewTokenRequest implements Serializable {

    private List<String> roles = new ArrayList<>();
    private String clientApplicationID;
    private Date expire = null;

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    public String getClientApplicationID() {
        return clientApplicationID;
    }

    public void setClientApplicationID(String clientApplicationID) {
        this.clientApplicationID = clientApplicationID;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
