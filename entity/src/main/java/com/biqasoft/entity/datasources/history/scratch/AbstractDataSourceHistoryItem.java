/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.datasources.history.scratch;

import io.swagger.annotations.ApiModel;
import org.bson.types.ObjectId;
import org.javers.core.metamodel.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document
@Value
@ApiModel("This is item ")
public abstract class AbstractDataSourceHistoryItem implements Serializable {

    @Id
    private String id = new ObjectId().toString();

    private Date createdDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractDataSourceHistoryItem that = (AbstractDataSourceHistoryItem) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return createdDate != null ? createdDate.equals(that.createdDate) : that.createdDate == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }
}
