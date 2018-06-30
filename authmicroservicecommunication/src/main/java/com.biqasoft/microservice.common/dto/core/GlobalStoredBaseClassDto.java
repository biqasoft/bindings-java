package com.biqasoft.microservice.common.dto.core;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by Nikita on 9/15/2016.
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GlobalStoredBaseClassDto extends BaseClassDto {

    @ApiModelProperty(notes = "this is domain - company global ID in system")
    protected String domain;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

}
