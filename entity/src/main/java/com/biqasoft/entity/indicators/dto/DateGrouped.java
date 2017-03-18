/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.indicators.dto;

import java.io.Serializable;

public class DateGrouped implements Serializable {

    private int minute;
    private int hour;
    private int day;
    private int week;
    private int month;
    private int year;
    private int dayOfYear;


    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDayOfYear() {
        return dayOfYear;
    }

    public void setDayOfYear(int dayOfYear) {
        this.dayOfYear = dayOfYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DateGrouped that = (DateGrouped) o;

        if (day != that.day) return false;
        if (dayOfYear != that.dayOfYear) return false;
        if (hour != that.hour) return false;
        if (minute != that.minute) return false;
        if (month != that.month) return false;
        if (week != that.week) return false;
        if (year != that.year) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = minute;
        result = 31 * result + hour;
        result = 31 * result + day;
        result = 31 * result + week;
        result = 31 * result + month;
        result = 31 * result + year;
        result = 31 * result + dayOfYear;
        return result;
    }
}
