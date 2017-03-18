/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.indicators.dto;

import com.biqasoft.entity.tasks.Task;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DateGroupedStatistics implements Serializable {

    private int allEntities;
    private int doneTasks = 0;
    private int activeTasks = 0;
    private int createdTask = 0;
    private int overdueTasks = 0;


    private List<Task> taskList = new ArrayList<>();


    public int getDoneTasks() {
        return doneTasks;
    }

    public void setDoneTasks(int doneTasks) {
        this.doneTasks = doneTasks;
    }

    public int getActiveTasks() {
        return activeTasks;
    }

    public void setActiveTasks(int activeTasks) {
        this.activeTasks = activeTasks;
    }

    public int getCreatedTask() {
        return createdTask;
    }

    public void setCreatedTask(int createdTask) {
        this.createdTask = createdTask;
    }

    public int getOverdueTasks() {
        return overdueTasks;
    }

    public void setOverdueTasks(int overdueTasks) {
        this.overdueTasks = overdueTasks;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public int getAllEntities() {
        return allEntities;
    }

    public void setAllEntities(int allEntities) {
        this.allEntities = allEntities;
    }
}
