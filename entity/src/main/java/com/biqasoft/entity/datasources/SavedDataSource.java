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
import com.biqasoft.entity.core.objects.field.DataSourcesTypes;

import java.io.Serializable;

@Document
@ApiModel("This object represent saved data source in history")
public class SavedDataSource implements Serializable {

    @Id
    @ApiModelProperty("Global object ID")
    protected String id = new ObjectId().toString();

    @Indexed
    private DataSourcesTypes values = new DataSourcesTypes();
    private CreatedInfo createdInfo = new CreatedInfo();

    private String dataSourceId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SavedDataSource that = (SavedDataSource) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (values != null ? !values.equals(that.values) : that.values != null) return false;
        if (createdInfo != null ? !createdInfo.equals(that.createdInfo) : that.createdInfo != null) return false;
        return dataSourceId != null ? dataSourceId.equals(that.dataSourceId) : that.dataSourceId == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (values != null ? values.hashCode() : 0);
        result = 31 * result + (createdInfo != null ? createdInfo.hashCode() : 0);
        result = 31 * result + (dataSourceId != null ? dataSourceId.hashCode() : 0);
        return result;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataSourcesTypes getValues() {
        return values;
    }

    public void setValues(DataSourcesTypes values) {
        this.values = values;
    }

    public CreatedInfo getCreatedInfo() {
        return createdInfo;
    }

    public void setCreatedInfo(CreatedInfo createdInfo) {
        this.createdInfo = createdInfo;
    }
}
