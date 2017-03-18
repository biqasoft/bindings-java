/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.tasks;

import com.biqasoft.entity.core.BaseClass;

import java.util.ArrayList;
import java.util.List;

public class TaskProject extends BaseClass {

    private List<Task> tasks = new ArrayList<>();


    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskProject that = (TaskProject) o;

        return tasks != null ? tasks.equals(that.tasks) : that.tasks == null;

    }

    @Override
    public int hashCode() {
        return tasks != null ? tasks.hashCode() : 0;
    }
}
