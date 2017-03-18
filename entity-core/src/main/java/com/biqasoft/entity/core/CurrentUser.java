/*
 * Copyright (c) 2016. com.biqasoft
 */

package com.biqasoft.entity.core;

import com.biqasoft.entity.core.useraccount.UserAccount;

import java.util.Date;

/**
 * Created by Nikita Bakaev, ya@nbakaev.ru on 2/17/2016.
 * All Rights Reserved
 */
public interface CurrentUser {

    String DEFAULT_LANGUAGE = "en_US";
    String DEFAULT_DATE_FORMAT = "dd.MM.yyyy HH:mm";

    /**
     * Get HTTP authenticated user
     * @return current HTTP request UserAccount, or null if no authenticated
     */
    UserAccount getCurrentUser();

    DomainSettings getCurrentUserDomain();

    Domain getDomain();

    /**
     * Print user formatted date as string
     * @param date
     * @return
     */
    String printWithDateFormat(Date date);

    /**
     * Get user domain
     * @return user UI language
     */
    String getLanguage();

    default String getDateFormat(){return DEFAULT_DATE_FORMAT;};

    boolean haveRole(String role);
}
