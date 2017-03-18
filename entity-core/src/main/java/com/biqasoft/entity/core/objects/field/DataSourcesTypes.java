/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.core.objects.field;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.javers.core.metamodel.annotation.Value;
import org.springframework.data.mongodb.core.index.TextIndexed;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Value
@ApiModel("This object is used in different places, where user create own data-structures, " +
        "such as dataSource, or customFields. This object contains different types of data")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class DataSourcesTypes implements Serializable {

    @TextIndexed
    private String stringVal = null;

    @ApiModelProperty("Please note about integer range(max integer value)")
    private Integer intVal = null;
    private Object objVal = null;
    private Double doubleVal = null;
    private Date dateVal = null;
    private CustomDictionary dictVal = null;
    private Boolean boolVal = null;
    private List<String> stringList = null;
    private Long longVal = null;

    public DataSourcesTypes() {
    }

    public DataSourcesTypes(String stringVal) {
        this.stringVal = stringVal;
    }

    public DataSourcesTypes(Integer intVal) {
        this.intVal = intVal;
    }

    public DataSourcesTypes(Object objVal) {
        this.objVal = objVal;
    }

    public DataSourcesTypes(Double doubleVal) {
        this.doubleVal = doubleVal;
    }

    public DataSourcesTypes(Date dateVal) {
        this.dateVal = dateVal;
    }

    public DataSourcesTypes(CustomDictionary dictVal) {
        this.dictVal = dictVal;
    }

    public DataSourcesTypes(Boolean boolVal) {
        this.boolVal = boolVal;
    }

    public DataSourcesTypes(List<String> stringList) {
        this.stringList = stringList;
    }

    public DataSourcesTypes(Long longVal) {
        this.longVal = longVal;
    }

    public Long getLongVal() {
        return longVal;
    }

    public void setLongVal(Long longVal) {
        this.longVal = longVal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataSourcesTypes that = (DataSourcesTypes) o;

        if (stringVal != null ? !stringVal.equals(that.stringVal) : that.stringVal != null) return false;
        if (intVal != null ? !intVal.equals(that.intVal) : that.intVal != null) return false;
        if (objVal != null ? !objVal.equals(that.objVal) : that.objVal != null) return false;
        if (doubleVal != null ? !doubleVal.equals(that.doubleVal) : that.doubleVal != null) return false;
        if (dateVal != null ? !dateVal.equals(that.dateVal) : that.dateVal != null) return false;
        if (dictVal != null ? !dictVal.equals(that.dictVal) : that.dictVal != null) return false;
        if (boolVal != null ? !boolVal.equals(that.boolVal) : that.boolVal != null) return false;
        if (stringList != null ? !stringList.equals(that.stringList) : that.stringList != null) return false;
        return longVal != null ? longVal.equals(that.longVal) : that.longVal == null;

    }

    @Override
    public int hashCode() {
        int result = stringVal != null ? stringVal.hashCode() : 0;
        result = 31 * result + (intVal != null ? intVal.hashCode() : 0);
        result = 31 * result + (objVal != null ? objVal.hashCode() : 0);
        result = 31 * result + (doubleVal != null ? doubleVal.hashCode() : 0);
        result = 31 * result + (dateVal != null ? dateVal.hashCode() : 0);
        result = 31 * result + (dictVal != null ? dictVal.hashCode() : 0);
        result = 31 * result + (boolVal != null ? boolVal.hashCode() : 0);
        result = 31 * result + (stringList != null ? stringList.hashCode() : 0);
        result = 31 * result + (longVal != null ? longVal.hashCode() : 0);
        return result;
    }

    public Boolean getBoolVal() {

        return boolVal;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setBoolVal(Boolean boolVal) {
        this.boolVal = boolVal;
    }

    public String getStringVal() {
        return stringVal;
    }

    public void setStringVal(String stringVal) {
        this.stringVal = stringVal;
    }

    public Integer getIntVal() {
        return intVal;
    }

    public void setIntVal(Integer intVal) {
        this.intVal = intVal;
    }

    public Object getObjVal() {
        return objVal;
    }

    public void setObjVal(Object objVal) {
        this.objVal = objVal;
    }

    public Double getDoubleVal() {
        return doubleVal;
    }

    public void setDoubleVal(Double doubleVal) {
        this.doubleVal = doubleVal;
    }

    public Date getDateVal() {
        return dateVal;
    }

    public void setDateVal(Date dateVal) {
        this.dateVal = dateVal;
    }

    public CustomDictionary getDictVal() {
        return dictVal;
    }

    public void setDictVal(CustomDictionary dictVal) {
        this.dictVal = dictVal;
    }
}
