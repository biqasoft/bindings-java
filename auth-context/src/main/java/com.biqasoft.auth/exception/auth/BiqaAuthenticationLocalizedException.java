/*
 * Copyright (c) 2016. com.biqasoft
 */

package com.biqasoft.auth.exception.auth;

import com.biqasoft.auth.exception.auth.dto.ErrorResource;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 6/28/2016
 *         All Rights Reserved
 */
public class BiqaAuthenticationLocalizedException extends RuntimeException {

    private ErrorResource errorResource;

    public BiqaAuthenticationLocalizedException(ErrorResource errorResource) {
        super(errorResource.getIdErrorMessage(), null, false, false);
        this.errorResource = errorResource;
    }

    public BiqaAuthenticationLocalizedException(String message) {
        super(message, null, false, false);
    }

    public ErrorResource getErrorResource() {
        return errorResource;
    }

}

