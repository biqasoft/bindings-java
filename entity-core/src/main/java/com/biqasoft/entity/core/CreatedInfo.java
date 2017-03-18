/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.core;

import io.swagger.annotations.ApiModel;
import org.javers.core.metamodel.annotation.Value;
import org.springframework.data.mongodb.core.index.Indexed;

import java.io.Serializable;
import java.util.Date;

@Value
@ApiModel(description = "Information about creating this object. Who and when created it")
public class CreatedInfo implements Serializable {

    @Indexed
    private Date createdDate;
    @Indexed
    private String createdById;

    public CreatedInfo() {
    }


    public CreatedInfo(Date createdDate, String createdById) {
        this.createdDate = createdDate;
        this.createdById = createdById;
    }

    public CreatedInfo(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreatedInfo that = (CreatedInfo) o;

        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        return createdById != null ? createdById.equals(that.createdById) : that.createdById == null;

    }

    @Override
    public int hashCode() {
        int result = createdDate != null ? createdDate.hashCode() : 0;
        result = 31 * result + (createdById != null ? createdById.hashCode() : 0);
        return result;
    }
}
