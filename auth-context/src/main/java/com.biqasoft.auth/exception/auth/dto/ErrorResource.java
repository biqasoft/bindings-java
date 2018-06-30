/*
 * Copyright (c) 2016. com.biqasoft
 */

package com.biqasoft.auth.exception.auth.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorResource {

    private String code;
    private String message;
    private List<FieldErrorResource> fieldErrors;

    private String englishErrorMessage = null;
    private String idErrorMessage = null;

    private String domain;

    public ErrorResource() {
    }

    public ErrorResource(String code, String message) {
        this.code = code;
        this.message = message;
    }

}