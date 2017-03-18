/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.objects;

import com.biqasoft.entity.constants.CUSTOM_OBJECTS_PRINTABLE_TYPES;
import org.bson.types.ObjectId;
import org.javers.core.metamodel.annotation.Value;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Created by Nikita Bakaev, ya@nbakaev.ru on 2/19/2016.
 * All Rights Reserved
 */
@Value
public class CustomObjectPrintableTemplate implements Serializable {

    @Id
    private String id = new ObjectId().toString();

    private String name;

    private String description;

    private String data;

    private String mimeType;

    private String extension;

    /**
     * {@link CUSTOM_OBJECTS_PRINTABLE_TYPES}
     */
    private String type;


    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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

        CustomObjectPrintableTemplate that = (CustomObjectPrintableTemplate) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (mimeType != null ? !mimeType.equals(that.mimeType) : that.mimeType != null) return false;
        if (extension != null ? !extension.equals(that.extension) : that.extension != null) return false;
        return type != null ? type.equals(that.type) : that.type == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (mimeType != null ? mimeType.hashCode() : 0);
        result = 31 * result + (extension != null ? extension.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
