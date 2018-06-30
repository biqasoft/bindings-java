/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.microservice.common.dto.core.objects.field;

import lombok.Data;

@Data
public class CustomDictionaryItemDto {

    private String id;

    private String name;
    private String value;

    public CustomDictionaryItemDto(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public CustomDictionaryItemDto(String name) {
        this.name = name;
    }

    public CustomDictionaryItemDto() {
    }

}
