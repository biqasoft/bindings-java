/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.indicators.dto;

import java.io.Serializable;

public class DateGroupedStatisticsListEntity implements Serializable {

    private DateGrouped dateGrouped = new DateGrouped();
    private DateGroupedStatistics dateGroupedStatistics = new DateGroupedStatistics();


    public DateGrouped getDateGrouped() {
        return dateGrouped;
    }

    public void setDateGrouped(DateGrouped dateGrouped) {
        this.dateGrouped = dateGrouped;
    }

    public DateGroupedStatistics getDateGroupedStatistics() {
        return dateGroupedStatistics;
    }

    public void setDateGroupedStatistics(DateGroupedStatistics dateGroupedStatistics) {
        this.dateGroupedStatistics = dateGroupedStatistics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DateGroupedStatisticsListEntity that = (DateGroupedStatisticsListEntity) o;

        if (dateGrouped != null ? !dateGrouped.equals(that.dateGrouped) : that.dateGrouped != null) return false;
        if (dateGroupedStatistics != null ? !dateGroupedStatistics.equals(that.dateGroupedStatistics) : that.dateGroupedStatistics != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dateGrouped != null ? dateGrouped.hashCode() : 0;
        result = 31 * result + (dateGroupedStatistics != null ? dateGroupedStatistics.hashCode() : 0);
        return result;
    }
}
