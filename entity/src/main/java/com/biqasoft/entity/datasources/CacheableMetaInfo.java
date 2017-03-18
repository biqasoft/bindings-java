/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.datasources;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.javers.core.metamodel.annotation.Value;

import java.io.Serializable;
import java.util.Date;

@Value
@ApiModel("This is embeddable object to other object, which contains some statistics that is cached and updated in some period")
public class CacheableMetaInfo implements Serializable {

    @ApiModelProperty("last update server time")
    private Date lastUpdate = null;

    @ApiModelProperty("next date after which, object should be updated")
    private Date updateDate = null;

    @ApiModelProperty("Update time in second")
    private int updateInterval = 30;

    public CacheableMetaInfo(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public CacheableMetaInfo() {
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getUpdateInterval() {
        return updateInterval;
    }

    public void setUpdateInterval(int updateInterval) {
        this.updateInterval = updateInterval;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CacheableMetaInfo that = (CacheableMetaInfo) o;

        if (updateInterval != that.updateInterval) return false;
        if (lastUpdate != null ? !lastUpdate.equals(that.lastUpdate) : that.lastUpdate != null) return false;
        return updateDate != null ? updateDate.equals(that.updateDate) : that.updateDate == null;

    }

    @Override
    public int hashCode() {
        int result = lastUpdate != null ? lastUpdate.hashCode() : 0;
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        result = 31 * result + updateInterval;
        return result;
    }
}
