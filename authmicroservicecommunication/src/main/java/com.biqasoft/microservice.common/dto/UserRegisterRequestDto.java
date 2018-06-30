/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.microservice.common.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserRegisterRequestDto {

    @ApiModelProperty("Just user account class")
    private UserAccountDto userAccount;

    @ApiModelProperty("Does send email to new account with login and plain-text password")
    private boolean sendWelcomeEmail = false;

    private String domain;

    private String password = null;

    public UserRegisterRequestDto() {
    }

    public UserRegisterRequestDto(UserAccountDto userAccount, boolean sendWelcomeEmail, String domain, String password) {
        this.userAccount = userAccount;
        this.sendWelcomeEmail = sendWelcomeEmail;
        this.domain = domain;
        this.password = password;
    }

}
