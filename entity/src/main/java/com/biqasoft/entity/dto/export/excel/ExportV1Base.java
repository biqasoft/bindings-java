package com.biqasoft.entity.dto.export.excel;

/**
 * Created by Nikita on 9/28/2016.
 */
public abstract class ExportV1Base {

    protected long entityNumber = 0;
    protected String dateFormat = null;


    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public long getEntityNumber() {
        return entityNumber;
    }

    public void setEntityNumber(long entityNumber) {
        this.entityNumber = entityNumber;
    }
}
