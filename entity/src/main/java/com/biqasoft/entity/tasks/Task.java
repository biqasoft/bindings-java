/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.tasks;

import com.biqasoft.entity.core.BaseClass;
import com.biqasoft.entity.system.ConnectedInfo;
import com.biqasoft.entity.core.useraccount.UserAccountPredicate;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bson.types.ObjectId;
import org.javers.core.metamodel.annotation.Value;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@ApiModel(value = "This is TASK object", discriminator = "One of the most frequent used class")
public class Task extends BaseClass {

    @ApiModelProperty("Date when task was completed")
    private Date completedDate;

    @ApiModelProperty("Array of checklists")
    private List<CheckListItem> checkListItems = new ArrayList<>();

    @Indexed
    private boolean completed;

    @Indexed
    private boolean systemIssued;

    @Indexed
    private boolean favourite;

    @Indexed
    private int priority;

    @Indexed
    private String taskProjectID;

    @Indexed
    private Date startDate;
    @Indexed
    private Date finalDate;

    @Indexed
    private UserAccountPredicate responsibles;

    @TextIndexed
    private ConnectedInfo connectedInfo = new ConnectedInfo();


    public String getTaskProjectID() {
        return taskProjectID;
    }

    public void setTaskProjectID(String taskProjectID) {
        this.taskProjectID = taskProjectID;
    }

    public ConnectedInfo getConnectedInfo() {
        return connectedInfo;
    }

    public void setConnectedInfo(ConnectedInfo connectedInfo) {
        this.connectedInfo = connectedInfo;
    }


    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    public List<CheckListItem> getCheckListItems() {
        return checkListItems;
    }

    public void setCheckListItems(List<CheckListItem> checkListItems) {
        this.checkListItems = checkListItems;
    }

//

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


    public boolean isSystemIssued() {
        return systemIssued;
    }

    public void setSystemIssued(boolean systemIssued) {
        this.systemIssued = systemIssued;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }


    public UserAccountPredicate getResponsibles() {
        return responsibles;
    }

    public void setResponsibles(UserAccountPredicate responsibles) {
        this.responsibles = responsibles;
    }


    @Value
    @ApiModel("Check list for task")
    public static class CheckListItem implements Serializable {

        private String id = new ObjectId().toString();

        @ApiModelProperty("Name for check list")
        @TextIndexed
        private String name;

        @ApiModelProperty("Does check list item done")
        private boolean done;


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

        public boolean isDone() {
            return done;
        }

        public void setDone(boolean done) {
            this.done = done;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CheckListItem that = (CheckListItem) o;

            if (done != that.done) return false;
            if (id != null ? !id.equals(that.id) : that.id != null) return false;
            if (name != null ? !name.equals(that.name) : that.name != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = id != null ? id.hashCode() : 0;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            result = 31 * result + (done ? 1 : 0);
            return result;
        }
    }
}
