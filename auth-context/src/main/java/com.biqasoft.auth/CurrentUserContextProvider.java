/*
 * Copyright (c) 2016. com.biqasoft
 */

package com.biqasoft.auth;


import com.biqasoft.auth.core.Domain;
import com.biqasoft.auth.core.DomainSettings;
import com.biqasoft.auth.core.UserAccount;

/**
 * Created by Nikita Bakaev, ya@nbakaev.ru on 2/17/2016.
 * All Rights Reserved
 */
public interface CurrentUserContextProvider {

    UserAccount getUserAccount();

    DomainSettings getDomainSettings();

    Domain getDomain();

    boolean hasRole(String role);

}
