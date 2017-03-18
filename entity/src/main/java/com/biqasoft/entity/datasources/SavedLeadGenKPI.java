/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.datasources;

import com.biqasoft.entity.core.CreatedInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import com.biqasoft.entity.indicators.dto.IndicatorsDTO;

import java.io.Serializable;

@Document
@ApiModel("This is saved KPIs for leadGenMethod and leadGenProject")
public class SavedLeadGenKPI implements Serializable {

    @Id
    @ApiModelProperty("Global object ID")
    protected String id = new ObjectId().toString();

    private IndicatorsDTO cachedKPIsData = new IndicatorsDTO();
    private CreatedInfo createdInfo = new CreatedInfo();

    @Indexed
    private String leadGenMethodId = null;
    @Indexed
    private String leadGenProjectId = null;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SavedLeadGenKPI that = (SavedLeadGenKPI) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (cachedKPIsData != null ? !cachedKPIsData.equals(that.cachedKPIsData) : that.cachedKPIsData != null)
            return false;
        if (createdInfo != null ? !createdInfo.equals(that.createdInfo) : that.createdInfo != null) return false;
        if (leadGenMethodId != null ? !leadGenMethodId.equals(that.leadGenMethodId) : that.leadGenMethodId != null)
            return false;
        return leadGenProjectId != null ? leadGenProjectId.equals(that.leadGenProjectId) : that.leadGenProjectId == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cachedKPIsData != null ? cachedKPIsData.hashCode() : 0);
        result = 31 * result + (createdInfo != null ? createdInfo.hashCode() : 0);
        result = 31 * result + (leadGenMethodId != null ? leadGenMethodId.hashCode() : 0);
        result = 31 * result + (leadGenProjectId != null ? leadGenProjectId.hashCode() : 0);
        return result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IndicatorsDTO getCachedKPIsData() {
        return cachedKPIsData;
    }

    public void setCachedKPIsData(IndicatorsDTO cachedKPIsData) {
        this.cachedKPIsData = cachedKPIsData;
    }

    public CreatedInfo getCreatedInfo() {
        return createdInfo;
    }

    public void setCreatedInfo(CreatedInfo createdInfo) {
        this.createdInfo = createdInfo;
    }

    public String getLeadGenMethodId() {
        return leadGenMethodId;
    }

    public void setLeadGenMethodId(String leadGenMethodId) {
        this.leadGenMethodId = leadGenMethodId;
    }

    public String getLeadGenProjectId() {
        return leadGenProjectId;
    }

    public void setLeadGenProjectId(String leadGenProjectId) {
        this.leadGenProjectId = leadGenProjectId;
    }
}
