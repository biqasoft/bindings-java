/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.events;

import com.biqasoft.entity.core.CreatedInfo;
import org.javers.core.metamodel.annotation.Value;

import java.io.Serializable;

@Value
public class EventMessage implements Serializable {

    private String header;
    private String shortText;
    private String fullText;
    private CreatedInfo createdInfo;

    public EventMessage(String header, String shortText) {
        this.header = header;
        this.shortText = shortText;
    }

    public EventMessage(String header, String shortText, String fullText) {
        this.header = header;
        this.shortText = shortText;
        this.fullText = fullText;
    }

    public EventMessage() {
    }


    public CreatedInfo getCreatedInfo() {
        return createdInfo;
    }

    public void setCreatedInfo(CreatedInfo createdInfo) {
        this.createdInfo = createdInfo;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventMessage that = (EventMessage) o;

        if (header != null ? !header.equals(that.header) : that.header != null) return false;
        if (shortText != null ? !shortText.equals(that.shortText) : that.shortText != null) return false;
        if (fullText != null ? !fullText.equals(that.fullText) : that.fullText != null) return false;
        return createdInfo != null ? createdInfo.equals(that.createdInfo) : that.createdInfo == null;

    }

    @Override
    public int hashCode() {
        int result = header != null ? header.hashCode() : 0;
        result = 31 * result + (shortText != null ? shortText.hashCode() : 0);
        result = 31 * result + (fullText != null ? fullText.hashCode() : 0);
        result = 31 * result + (createdInfo != null ? createdInfo.hashCode() : 0);
        return result;
    }
}
