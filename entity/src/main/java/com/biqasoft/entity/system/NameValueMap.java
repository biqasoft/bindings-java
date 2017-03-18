/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.system;

import org.javers.core.metamodel.annotation.Value;

import java.io.Serializable;

@Value
public class NameValueMap implements Serializable {

    private String name;
    private String value;
    private String type;


    public NameValueMap(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public NameValueMap(String name, String value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public NameValueMap() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NameValueMap that = (NameValueMap) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        return !(type != null ? !type.equals(that.type) : that.type != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
