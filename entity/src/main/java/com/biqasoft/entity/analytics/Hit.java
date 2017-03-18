/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.analytics;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.javers.core.metamodel.annotation.Value;

import java.io.Serializable;

@Value
@ApiModel
public class Hit implements Serializable {

    @ApiModelProperty("Category")
    private String category;

    @ApiModelProperty("Action")
    private String action;

    private String label;

    private String value;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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

        Hit hit = (Hit) o;

        if (category != null ? !category.equals(hit.category) : hit.category != null) return false;
        if (action != null ? !action.equals(hit.action) : hit.action != null) return false;
        if (label != null ? !label.equals(hit.label) : hit.label != null) return false;
        return value != null ? value.equals(hit.value) : hit.value == null;

    }

    @Override
    public int hashCode() {
        int result = category != null ? category.hashCode() : 0;
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
