/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.dto.useraccount;

import java.io.Serializable;

public class UserNameWithPassword implements Serializable {

    private String username;
    private String password; // do not add @JsonIgnore
    public String twoStepCode;

    public String getTwoStepCode() {
        return twoStepCode;
    }

    public void setTwoStepCode(String twoStepCode) {
        this.twoStepCode = twoStepCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
