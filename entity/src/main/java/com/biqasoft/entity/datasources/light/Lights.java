/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.datasources.light;

import com.biqasoft.entity.constants.DATA_SOURCES_MORE;

import java.io.Serializable;

/**
 * Created by Nikita Bakaev, ya@nbakaev.ru on 2/3/2016.
 * All Rights Reserved
 */
public class Lights implements Serializable {

    private LightNode success = new LightNode();
    private LightNode warning = new LightNode();
    private LightNode error = new LightNode();

    /**
     * {@link DATA_SOURCES_MORE}
     */
    private String currentLight;


    public String getCurrentLight() {
        return currentLight;
    }

    public void setCurrentLight(String currentLight) {
        this.currentLight = currentLight;
    }

    public LightNode getSuccess() {
        return success;
    }

    public void setSuccess(LightNode success) {
        this.success = success;
    }

    public LightNode getWarning() {
        return warning;
    }

    public void setWarning(LightNode warning) {
        this.warning = warning;
    }

    public LightNode getError() {
        return error;
    }

    public void setError(LightNode error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lights lights = (Lights) o;

        if (success != null ? !success.equals(lights.success) : lights.success != null) return false;
        if (warning != null ? !warning.equals(lights.warning) : lights.warning != null) return false;
        if (error != null ? !error.equals(lights.error) : lights.error != null) return false;
        return currentLight != null ? currentLight.equals(lights.currentLight) : lights.currentLight == null;

    }

    @Override
    public int hashCode() {
        int result = success != null ? success.hashCode() : 0;
        result = 31 * result + (warning != null ? warning.hashCode() : 0);
        result = 31 * result + (error != null ? error.hashCode() : 0);
        result = 31 * result + (currentLight != null ? currentLight.hashCode() : 0);
        return result;
    }
}
