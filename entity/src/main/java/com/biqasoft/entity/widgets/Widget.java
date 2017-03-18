/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.widgets;

import com.biqasoft.entity.datasources.DataSource;
import com.biqasoft.entity.core.BaseClass;
import org.springframework.data.mongodb.core.index.Indexed;
import com.biqasoft.entity.filters.DataSourceFilter;
import com.biqasoft.entity.system.NameValueMap;

import java.util.ArrayList;
import java.util.List;


public class Widget extends BaseClass {

    private String jsExec;
    private String htmlTemplate;

    @Indexed
    private String type;

    /**
     * {@link com.biqasoft.entity.constants.WIDGET_LOCATION}
     */
    @Indexed
    private String location; // место где находится

    /**
     * {@link com.biqasoft.entity.constants.WIDGET_CONTROLLERS}
     */
    @Indexed
    private String templateController;

    @Indexed
    private String ownerId;

    private boolean enabled = true;

    private int row;
    private int col;
    private int sizeX;
    private int sizeY;


    private boolean demo;

    private DataSourceFilter biqaClassBuilderAbstract;
    private List<NameValueMap> additionalData = new ArrayList<>();
    private List<DataSource> dataSources = new ArrayList<>();


    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isDemo() {
        return demo;
    }

    public void setDemo(boolean demo) {
        this.demo = demo;
    }


    public DataSourceFilter getBiqaClassBuilderAbstract() {
        return biqaClassBuilderAbstract;
    }

    public void setBiqaClassBuilderAbstract(DataSourceFilter biqaClassBuilderAbstract) {
        this.biqaClassBuilderAbstract = biqaClassBuilderAbstract;
    }

    public String getTemplateController() {
        return templateController;
    }

    public void setTemplateController(String templateController) {
        this.templateController = templateController;
    }

    public List<NameValueMap> getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(List<NameValueMap> additionalData) {
        this.additionalData = additionalData;
    }

    public List<DataSource> getDataSources() {
        return dataSources;
    }

    public void setDataSources(List<DataSource> dataSources) {
        this.dataSources = dataSources;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }


    public String getJsExec() {
        return jsExec;
    }

    public void setJsExec(String jsExec) {
        this.jsExec = jsExec;
    }

    public String getHtmlTemplate() {
        return htmlTemplate;
    }

    public void setHtmlTemplate(String htmlTemplate) {
        this.htmlTemplate = htmlTemplate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Widget widget = (Widget) o;

        if (col != widget.col) return false;
        if (row != widget.row) return false;
        if (sizeX != widget.sizeX) return false;
        if (sizeY != widget.sizeY) return false;
        if (htmlTemplate != null ? !htmlTemplate.equals(widget.htmlTemplate) : widget.htmlTemplate != null)
            return false;
        if (id != null ? !id.equals(widget.id) : widget.id != null) return false;
        if (jsExec != null ? !jsExec.equals(widget.jsExec) : widget.jsExec != null) return false;
        if (name != null ? !name.equals(widget.name) : widget.name != null) return false;
        if (ownerId != null ? !ownerId.equals(widget.ownerId) : widget.ownerId != null) return false;
        if (type != null ? !type.equals(widget.type) : widget.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (jsExec != null ? jsExec.hashCode() : 0);
        result = 31 * result + (htmlTemplate != null ? htmlTemplate.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        result = 31 * result + row;
        result = 31 * result + col;
        result = 31 * result + sizeX;
        result = 31 * result + sizeY;
        return result;
    }
}
