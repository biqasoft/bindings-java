package com.biqasoft.entity.core;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * Created by Nikita on 9/15/2016.
 */
public class GlobalStoredBaseClass extends BaseClass {

    @Indexed
    @ApiModelProperty(notes = "this is domain - company global ID in system")
    protected String domain;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

}
