/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.datasources;

import com.biqasoft.entity.core.BaseClass;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.javers.core.metamodel.annotation.DiffIgnore;
import org.springframework.data.mongodb.core.index.Indexed;
import com.biqasoft.entity.constants.DATA_SOURCES_RETURNED_TYPES;
import com.biqasoft.entity.datasources.light.Lights;
import com.biqasoft.entity.core.objects.field.DataSourcesTypes;
import com.biqasoft.entity.system.NameValueMap;
import com.biqasoft.entity.constants.DATA_SOURCES;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ApiModel
public abstract class AbstractDataSourceSavedData extends BaseClass {

    @ApiModelProperty("Return only one data expression, not data-set")
    @Indexed
    private boolean oneData;

    /**
     * {@link DATA_SOURCES}
     */
    @ApiModelProperty("Which internal class controls the result of data")
    @Indexed
    private String controlledClass;

    @ApiModelProperty("This is array of parameters to controller")
    private List<NameValueMap> parameters = new ArrayList<>();

    @DiffIgnore
    @ApiModelProperty("Resulted calculated data")
    private DataSourcesTypes values;

    @ApiModelProperty("Does system ( may be automatically ) create this object or user ")
    @Indexed
    private boolean systemIssued;

    /**
     * {@link DATA_SOURCES_RETURNED_TYPES}
     */
    @ApiModelProperty("What is return type? STRING, INTEGER,.... or smth else")
    @Indexed
    private String returnType;

    @ApiModelProperty("Does it successfully resolved?")
    private boolean resolved;

    @ApiModelProperty("If we have error in resolving- here we have message")
    private String errorResolvedMessage = null;

    @DiffIgnore
    @ApiModelProperty("Last update data")
    private Date lastUpdate;

    @DiffIgnore
    @ApiModelProperty("Lights: success, warning, error colors")
    private Lights lights = new Lights();


    public Lights getLights() {
        return lights;
    }

    public void setLights(Lights lights) {
        this.lights = lights;
    }

    public String getErrorResolvedMessage() {
        return errorResolvedMessage;
    }

    public void setErrorResolvedMessage(String errorResolvedMessage) {
        this.errorResolvedMessage = errorResolvedMessage;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public boolean isOneData() {
        return oneData;
    }

    public void setOneData(boolean oneData) {
        this.oneData = oneData;
    }

    public String getControlledClass() {
        return controlledClass;
    }

    public void setControlledClass(String controlledClass) {
        this.controlledClass = controlledClass;
    }

    public List<NameValueMap> getParameters() {
        return parameters;
    }

    public void setParameters(List<NameValueMap> parameters) {
        this.parameters = parameters;
    }

    public DataSourcesTypes getValues() {
        return values;
    }

    public void setValues(DataSourcesTypes values) {
        this.values = values;
    }

    public boolean isSystemIssued() {
        return systemIssued;
    }

    public void setSystemIssued(boolean systemIssued) {
        this.systemIssued = systemIssued;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }
}
