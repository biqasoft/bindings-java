/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.access;


import com.biqasoft.entity.core.useraccount.UserAccountPredicate;

import java.io.Serializable;

/**
 * Created by Nikita Bakaev, ya@nbakaev.ru on 5/6/2016.
 * All Rights Reserved
 */
public class ReadEditDeleteRules implements Serializable {

    private UserAccountPredicate allowedRead = new UserAccountPredicate();
    private UserAccountPredicate allowedDelete = new UserAccountPredicate();
    private UserAccountPredicate allowedModify = new UserAccountPredicate();


    public UserAccountPredicate getAllowedRead() {
        return allowedRead;
    }

    public void setAllowedRead(UserAccountPredicate allowedRead) {
        this.allowedRead = allowedRead;
    }

    public UserAccountPredicate getAllowedDelete() {
        return allowedDelete;
    }

    public void setAllowedDelete(UserAccountPredicate allowedDelete) {
        this.allowedDelete = allowedDelete;
    }

    public UserAccountPredicate getAllowedModify() {
        return allowedModify;
    }

    public void setAllowedModify(UserAccountPredicate allowedModify) {
        this.allowedModify = allowedModify;
    }
}
