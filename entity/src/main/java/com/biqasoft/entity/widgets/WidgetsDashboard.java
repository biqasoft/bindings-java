/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.widgets;

import com.biqasoft.entity.core.BaseClass;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.List;

public class WidgetsDashboard extends BaseClass {

    @DBRef
    private List<Widget> widgets = new ArrayList<>();

    @Indexed
    private String ownerId;


    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public List<Widget> getWidgets() {
        return widgets;
    }

    public void setWidgets(List<Widget> widgets) {
        this.widgets = widgets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WidgetsDashboard that = (WidgetsDashboard) o;

        if (widgets != null ? !widgets.equals(that.widgets) : that.widgets != null) return false;
        return ownerId != null ? ownerId.equals(that.ownerId) : that.ownerId == null;

    }

    @Override
    public int hashCode() {
        int result = widgets != null ? widgets.hashCode() : 0;
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        return result;
    }
}
