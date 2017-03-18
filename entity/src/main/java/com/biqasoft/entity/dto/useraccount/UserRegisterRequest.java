/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.dto.useraccount;

import com.biqasoft.entity.core.useraccount.UserAccount;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class UserRegisterRequest implements Serializable {

    @ApiModelProperty("Just user account class")
    private UserAccount userAccount;

    @ApiModelProperty("Does send email to new account with login and plain-text password")
    private boolean sendWelcomeEmail = false;

    private String domain;

    private String password = null;

    public UserRegisterRequest() {
    }

    public UserRegisterRequest(UserAccount userAccount, boolean sendWelcomeEmail, String domain, String password) {
        this.userAccount = userAccount;
        this.sendWelcomeEmail = sendWelcomeEmail;
        this.domain = domain;
        this.password = password;
    }

    public String getDomain() {
        return domain;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public boolean isSendWelcomeEmail() {
        return sendWelcomeEmail;
    }

    public void setSendWelcomeEmail(boolean sendWelcomeEmail) {
        this.sendWelcomeEmail = sendWelcomeEmail;
    }
}
