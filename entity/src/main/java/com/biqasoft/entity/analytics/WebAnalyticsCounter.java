/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.analytics;

import com.biqasoft.entity.core.GlobalStoredBaseClass;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@ApiModel("This is global object to storing analytics web counter and information from it available for everyone by counter id")
public class WebAnalyticsCounter extends GlobalStoredBaseClass {

    @ApiModelProperty("site address")
    private String site;

    @ApiModelProperty("enable")
    private boolean enabled;

    @ApiModelProperty("enable lead post (from web forms and landing pages)")
    private boolean elp = false;

    @ApiModelProperty("show promo code in the left/other corner to detect call-tracker (instead)")
    private boolean pc = false;


    public boolean isPc() {
        return pc;
    }

    public void setPc(boolean pc) {
        this.pc = pc;
    }

    public boolean isElp() {
        return elp;
    }

    public void setElp(boolean elp) {
        this.elp = elp;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }


}
