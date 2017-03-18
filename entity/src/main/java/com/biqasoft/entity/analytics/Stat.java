/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.analytics;

import com.biqasoft.entity.core.CreatedInfo;
import org.javers.core.metamodel.annotation.Value;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Value
public class Stat implements Serializable {

    @Id
    private String id;

    private String statId;
    private String dataValue;


    private String username;
    private CreatedInfo createdInfo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public CreatedInfo getCreatedInfo() {
        return createdInfo;
    }

    public void setCreatedInfo(CreatedInfo createdInfo) {
        this.createdInfo = createdInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatId() {
        return statId;
    }

    public void setStatId(String statId) {
        this.statId = statId;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stat stat = (Stat) o;

        if (id != null ? !id.equals(stat.id) : stat.id != null) return false;
        if (statId != null ? !statId.equals(stat.statId) : stat.statId != null) return false;
        if (dataValue != null ? !dataValue.equals(stat.dataValue) : stat.dataValue != null) return false;
        if (username != null ? !username.equals(stat.username) : stat.username != null) return false;
        return createdInfo != null ? createdInfo.equals(stat.createdInfo) : stat.createdInfo == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (statId != null ? statId.hashCode() : 0);
        result = 31 * result + (dataValue != null ? dataValue.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (createdInfo != null ? createdInfo.hashCode() : 0);
        return result;
    }
}
