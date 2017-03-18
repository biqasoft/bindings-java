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
public class DataSourceFilter extends BaseClassFilter {

    @ApiModelProperty("use static segment filter or not ?")
    private boolean useListOfIDs = false;

    @ApiModelProperty("array of static segment IDs ")
    private List<String> listOfIDs = new ArrayList<>();

    @ApiModelProperty("use resolved field")
    private boolean useResolved = false;
    @ApiModelProperty("resolved true/false field value")
    private boolean resolved = false;

    @ApiModelProperty("use systemIssued field")
    private boolean useSystemIssued = false;
    @ApiModelProperty("systemIssued true/false field value")
    private boolean systemIssued = false;

    @ApiModelProperty("use controlledClass field")
    private boolean useControlledClass = false;
    @ApiModelProperty("controlledClass value")
    private String controlledClass = null;

    @ApiModelProperty("use returnType field")
    private boolean useReturnType = false;
    @ApiModelProperty("returnType field value")
    private String returnType = null;

    @ApiModelProperty("use light field")
    private boolean useLightStatus = false;
    @ApiModelProperty("returnType field value")
    private String lightStatus = null;


    public boolean isUseLightStatus() {
        return useLightStatus;
    }

    public void setUseLightStatus(boolean useLightStatus) {
        this.useLightStatus = useLightStatus;
    }

    public String getLightStatus() {
        return lightStatus;
    }

    public void setLightStatus(String lightStatus) {
        this.lightStatus = lightStatus;
    }

    public boolean isUseResolved() {
        return useResolved;
    }

    public void setUseResolved(boolean useResolved) {
        this.useResolved = useResolved;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }

    public boolean isUseSystemIssued() {
        return useSystemIssued;
    }

    public void setUseSystemIssued(boolean useSystemIssued) {
        this.useSystemIssued = useSystemIssued;
    }

    public boolean isSystemIssued() {
        return systemIssued;
    }

    public void setSystemIssued(boolean systemIssued) {
        this.systemIssued = systemIssued;
    }

    public boolean isUseControlledClass() {
        return useControlledClass;
    }

    public void setUseControlledClass(boolean useControlledClass) {
        this.useControlledClass = useControlledClass;
    }

    public String getControlledClass() {
        return controlledClass;
    }

    public void setControlledClass(String controlledClass) {
        this.controlledClass = controlledClass;
    }

    public boolean isUseReturnType() {
        return useReturnType;
    }

    public void setUseReturnType(boolean useReturnType) {
        this.useReturnType = useReturnType;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
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
