/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.filters;

import com.biqasoft.entity.core.BaseClassFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

@ApiModel(" This is CustomerBuilder ( Filter) for customers and leads")
public class WebAnalyticsRecordFilter extends BaseClassFilter {

    @ApiModelProperty("use static segment filter or not ?")
    private boolean useListOfIDs = false;

    @ApiModelProperty("array of static segment IDs ")
    private List<String> listOfIDs = new ArrayList<>();

    @ApiModelProperty("use static segment filter or not ?")
    private boolean useCounterId = false;

    @ApiModelProperty("array of static segment IDs ")
    private String conterID;

    private String type;

    private String utm_source;
    private String utm_medium;
    private String utm_campaign;
    private String utm_content;
    private String utm_term;

    private boolean useUtm_source = false;
    private boolean useUtm_medium = false;
    private boolean useUtm_campaign = false;
    private boolean useUtm_content = false;
    private boolean useUtm_term = false;

    private boolean useAction = false;


    public boolean isUseAction() {
        return useAction;
    }

    public void setUseAction(boolean useAction) {
        this.useAction = useAction;
    }

    public boolean isUseUtm_source() {
        return useUtm_source;
    }

    public void setUseUtm_source(boolean useUtm_source) {
        this.useUtm_source = useUtm_source;
    }

    public boolean isUseUtm_medium() {
        return useUtm_medium;
    }

    public void setUseUtm_medium(boolean useUtm_medium) {
        this.useUtm_medium = useUtm_medium;
    }

    public boolean isUseUtm_campaign() {
        return useUtm_campaign;
    }

    public void setUseUtm_campaign(boolean useUtm_campaign) {
        this.useUtm_campaign = useUtm_campaign;
    }

    public boolean isUseUtm_content() {
        return useUtm_content;
    }

    public void setUseUtm_content(boolean useUtm_content) {
        this.useUtm_content = useUtm_content;
    }

    public boolean isUseUtm_term() {
        return useUtm_term;
    }

    public void setUseUtm_term(boolean useUtm_term) {
        this.useUtm_term = useUtm_term;
    }

    private String action;


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUtm_source() {
        return utm_source;
    }

    public void setUtm_source(String utm_source) {
        this.utm_source = utm_source;
    }

    public String getUtm_medium() {
        return utm_medium;
    }

    public void setUtm_medium(String utm_medium) {
        this.utm_medium = utm_medium;
    }

    public String getUtm_campaign() {
        return utm_campaign;
    }

    public void setUtm_campaign(String utm_campaign) {
        this.utm_campaign = utm_campaign;
    }

    public String getUtm_content() {
        return utm_content;
    }

    public void setUtm_content(String utm_content) {
        this.utm_content = utm_content;
    }

    public String getUtm_term() {
        return utm_term;
    }

    public void setUtm_term(String utm_term) {
        this.utm_term = utm_term;
    }

    public boolean isUseCounterId() {
        return useCounterId;
    }

    public void setUseCounterId(boolean useCounterId) {
        this.useCounterId = useCounterId;
    }

    public String getConterID() {
        return conterID;
    }

    public void setConterID(String conterID) {
        this.conterID = conterID;
    }

    public boolean isUseListOfIDs() {
        return useListOfIDs;
    }

    public void setUseListOfIDs(boolean useListOfIDs) {
        this.useListOfIDs = useListOfIDs;
    }

    public List<String> getListOfIDs() {
        return listOfIDs;
    }

    public void setListOfIDs(List<String> listOfIDs) {
        this.listOfIDs = listOfIDs;
    }
}
