/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.datasources.light;

import com.biqasoft.entity.core.objects.field.DataSourcesTypes;

import java.io.Serializable;

/**
 * Created by Nikita Bakaev, ya@nbakaev.ru on 2/3/2016.
 * All Rights Reserved
 */
public class LightNode implements Serializable {

    private String color;
    private DataSourcesTypes value = new DataSourcesTypes();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public DataSourcesTypes getValue() {
        return value;
    }

    public void setValue(DataSourcesTypes value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LightNode lightNode = (LightNode) o;

        if (color != null ? !color.equals(lightNode.color) : lightNode.color != null) return false;
        return value != null ? value.equals(lightNode.value) : lightNode.value == null;

    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
