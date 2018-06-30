/*
 * Copyright (c) 2016. com.biqasoft
 */

package com.biqasoft.auth.exception.auth.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldErrorResource {
    private String resource;
    private String field;
    private String code;
    private String message;

}