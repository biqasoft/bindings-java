/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.analytics;

import org.bson.types.ObjectId;
import org.javers.core.metamodel.annotation.Value;

import java.io.Serializable;

@Value
public class RaCookieId implements Serializable {

    private String id = new ObjectId().toString();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RaCookieId that = (RaCookieId) o;

        return id != null ? id.equals(that.id) : that.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
