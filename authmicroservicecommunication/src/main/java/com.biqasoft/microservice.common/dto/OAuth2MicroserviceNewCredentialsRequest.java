/*
 * Copyright 2016 the original author or authors.
 */

package com.biqasoft.microservice.common.dto;

import com.biqasoft.entity.core.useraccount.UserAccount;

import java.util.Date;
import java.util.List;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 7/28/2016
 *         All Rights Reserved
 */
public class OAuth2MicroserviceNewCredentialsRequest {

    private UserAccount userAccount;
    private List<String> rolesRequested;
    private Date expireDate;

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public List<String> getRolesRequested() {
        return rolesRequested;
    }

    public void setRolesRequested(List<String> rolesRequested) {
        this.rolesRequested = rolesRequested;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
}
