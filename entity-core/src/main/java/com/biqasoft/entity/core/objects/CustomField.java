/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.core.objects;

import com.biqasoft.entity.constants.CUSTOM_FIELD_STYLE;
import com.biqasoft.entity.constants.CUSTOM_FIELD_TYPES;
import com.biqasoft.entity.core.objects.field.DataSourcesTypes;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import org.bson.types.ObjectId;
import org.javers.core.metamodel.annotation.Value;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 * Date: 12/4/2015
 * All Rights Reserved
 */
@Value
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class CustomField {

    @ApiModelProperty("field type id. Every object with embedded customField with the same field have same this fieldId")
    @Indexed
    protected String fieldId = new ObjectId().toString();

    @ApiModelProperty("Custom field name")
    private String name;

    @ApiModelProperty("description")
    private String description = null;

    @ApiModelProperty("Regular expression validation pattern")
    private String validPattern = null;

    /**
     * see {@link CUSTOM_FIELD_TYPES}
     */
    @ApiModelProperty("Field type")
    private String type;

    /**
     * see {@link CUSTOM_FIELD_STYLE}
     */
    @ApiModelProperty("Field style. For example how show UI control elements for String")
    private String style;

    @ApiModelProperty("Is this field required")
    private boolean required;

    @ApiModelProperty("Is this field hidden in UI. Usually used to store some technical information")
    private boolean hidden;

    @ApiModelProperty("Value - main property")
    private DataSourcesTypes value = new DataSourcesTypes();

    private String alias;


    public CustomField() {
    }

    public CustomField(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public CustomField(String name, String type, String description) {
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomField that = (CustomField) o;

        if (required != that.required) return false;
        if (hidden != that.hidden) return false;
        if (fieldId != null ? !fieldId.equals(that.fieldId) : that.fieldId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (validPattern != null ? !validPattern.equals(that.validPattern) : that.validPattern != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (style != null ? !style.equals(that.style) : that.style != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        return alias != null ? alias.equals(that.alias) : that.alias == null;

    }

    @Override
    public int hashCode() {
        int result = fieldId != null ? fieldId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (validPattern != null ? validPattern.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (style != null ? style.hashCode() : 0);
        result = 31 * result + (required ? 1 : 0);
        result = 31 * result + (hidden ? 1 : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        return result;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public DataSourcesTypes getValue() {
        return value;
    }

    public void setValue(DataSourcesTypes value) {
        this.value = value;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValidPattern() {
        return validPattern;
    }

    public void setValidPattern(String validPattern) {
        this.validPattern = validPattern;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
