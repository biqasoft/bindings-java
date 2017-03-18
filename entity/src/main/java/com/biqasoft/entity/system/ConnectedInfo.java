/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.system;

import com.biqasoft.entity.constants.DOCUMENT_FILE;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.javers.core.metamodel.annotation.Value;
import org.springframework.data.mongodb.core.index.Indexed;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Value
@ApiModel("Some other documents that are connected with this record")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ConnectedInfo implements Serializable {

    /**
     * {@link DOCUMENT_FILE}
     */
    @ApiModelProperty("Does file connected with `TASK`, `CUSTOMER` ...")
    @Indexed
    private String connectedType = null;

    @ApiModelProperty("Connected customer ID")
    @Indexed
    private String connectedCustomerId = null;

    @ApiModelProperty("Connected task ID")
    @Indexed
    private String connectedTaskId = null;

    @ApiModelProperty("Connected opportunity ID")
    @Indexed
    private String connectedOpportunityId = null;

    @ApiModelProperty(" IDs of files")
    @Indexed
    private List<String> connectedFiles = new ArrayList<>();


    public List<String> getConnectedFiles() {
        return connectedFiles;
    }

    public void setConnectedFiles(List<String> connectedFiles) {
        this.connectedFiles = connectedFiles;
    }

    public String getConnectedType() {
        return connectedType;
    }

    public void setConnectedType(String connectedType) {
        this.connectedType = connectedType;
    }

    public String getConnectedCustomerId() {
        return connectedCustomerId;
    }

    public void setConnectedCustomerId(String connectedCustomerId) {
        this.connectedCustomerId = connectedCustomerId;
    }

    public String getConnectedTaskId() {
        return connectedTaskId;
    }

    public void setConnectedTaskId(String connectedTaskId) {
        this.connectedTaskId = connectedTaskId;
    }

    public String getConnectedOpportunityId() {
        return connectedOpportunityId;
    }

    public void setConnectedOpportunityId(String connectedOpportunityId) {
        this.connectedOpportunityId = connectedOpportunityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConnectedInfo that = (ConnectedInfo) o;

        if (connectedType != null ? !connectedType.equals(that.connectedType) : that.connectedType != null) return false;
        if (connectedCustomerId != null ? !connectedCustomerId.equals(that.connectedCustomerId) : that.connectedCustomerId != null) return false;
        if (connectedTaskId != null ? !connectedTaskId.equals(that.connectedTaskId) : that.connectedTaskId != null) return false;
        if (connectedOpportunityId != null ? !connectedOpportunityId.equals(that.connectedOpportunityId) : that.connectedOpportunityId != null) return false;
        return connectedFiles != null ? connectedFiles.equals(that.connectedFiles) : that.connectedFiles == null;

    }

    @Override
    public int hashCode() {
        int result = connectedType != null ? connectedType.hashCode() : 0;
        result = 31 * result + (connectedCustomerId != null ? connectedCustomerId.hashCode() : 0);
        result = 31 * result + (connectedTaskId != null ? connectedTaskId.hashCode() : 0);
        result = 31 * result + (connectedOpportunityId != null ? connectedOpportunityId.hashCode() : 0);
        result = 31 * result + (connectedFiles != null ? connectedFiles.hashCode() : 0);
        return result;
    }
}
