/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.core.objects.field;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bson.types.ObjectId;
import org.javers.core.metamodel.annotation.Value;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Value
@ApiModel("Dictionary type for custom fields - list of predefined values")
public class CustomDictionary implements Serializable {

    private String id = new ObjectId().toString();

    @ApiModelProperty("List of values which can be selected")
    private List<CustomDictionaryItem> values = new ArrayList<>();

    @ApiModelProperty("Current selected value")
    private CustomDictionaryItem value = new CustomDictionaryItem();


    public CustomDictionaryItem getValue() {
        return value;
    }

    public void setValue(CustomDictionaryItem value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<CustomDictionaryItem> getValues() {
        return values;
    }

    public void setValues(List<CustomDictionaryItem> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomDictionary that = (CustomDictionary) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (values != null ? !values.equals(that.values) : that.values != null) return false;
        return value != null ? value.equals(that.value) : that.value == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (values != null ? values.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
