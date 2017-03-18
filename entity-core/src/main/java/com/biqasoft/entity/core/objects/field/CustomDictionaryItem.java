/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.core.objects.field;

import org.bson.types.ObjectId;
import org.javers.core.metamodel.annotation.Value;

import java.io.Serializable;

@Value
public class CustomDictionaryItem implements Serializable {

    private String id = new ObjectId().toString();

    private String name;
    private String value;


    public CustomDictionaryItem(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public CustomDictionaryItem(String name) {
        this.name = name;
    }

    public CustomDictionaryItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomDictionaryItem that = (CustomDictionaryItem) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return value != null ? value.equals(that.value) : that.value == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
