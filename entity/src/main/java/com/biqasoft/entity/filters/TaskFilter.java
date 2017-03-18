/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.filters;

import com.biqasoft.entity.core.BaseClassFilter;
import io.swagger.annotations.ApiModelProperty;
import com.biqasoft.entity.core.useraccount.UserAccountPredicate;

public class TaskFilter extends BaseClassFilter {

    private String name;
    private boolean onlyDone;
    private boolean onlyActive;

    private UserAccountPredicate responsibles;

    //////////////////////////////////////////
    private boolean useCompletedDateFrom;
    private boolean useCompletedDateTo;

    private String completedDateFrom;
    private String completedDateTo;
//////////////////////////////////////////

    private boolean useConnectedCustomerId;
    private String connectedCustomerId;

    @ApiModelProperty("show only when current user is responsible for task")
    private boolean showOnlyWhenIamResponsible;

    @ApiModelProperty("show only when priority MORE or equals some integer [0-6] ")
    private boolean usePriorityMoreThan = false;
    private int priorityMoreThan;

    /////////////////////////////////////////////
    @ApiModelProperty("show only when priority LESS or equals some integer [0-6] ")
    private boolean usePriorityLessThan = false;
    private int priorityLessThan;
    /////////////////////////////////////////////

    @ApiModelProperty("show only Favourite tasks ")
    private boolean onlyFavourite = false;


    public boolean isOnlyFavourite() {
        return onlyFavourite;
    }

    public void setOnlyFavourite(boolean onlyFavourite) {
        this.onlyFavourite = onlyFavourite;
    }

    public boolean isUsePriorityMoreThan() {
        return usePriorityMoreThan;
    }

    public void setUsePriorityMoreThan(boolean usePriorityMoreThan) {
        this.usePriorityMoreThan = usePriorityMoreThan;
    }

    public int getPriorityMoreThan() {
        return priorityMoreThan;
    }

    public void setPriorityMoreThan(int priorityMoreThan) {
        this.priorityMoreThan = priorityMoreThan;
    }

    public boolean isUsePriorityLessThan() {
        return usePriorityLessThan;
    }

    public void setUsePriorityLessThan(boolean usePriorityLessThan) {
        this.usePriorityLessThan = usePriorityLessThan;
    }

    public int getPriorityLessThan() {
        return priorityLessThan;
    }

    public void setPriorityLessThan(int priorityLessThan) {
        this.priorityLessThan = priorityLessThan;
    }

    public boolean isShowOnlyWhenIamResponsible() {
        return showOnlyWhenIamResponsible;
    }

    public void setShowOnlyWhenIamResponsible(boolean showOnlyWhenIamResponsible) {
        this.showOnlyWhenIamResponsible = showOnlyWhenIamResponsible;
    }

    public boolean isUseConnectedCustomerId() {
        return useConnectedCustomerId;
    }

    public void setUseConnectedCustomerId(boolean useConnectedCustomerId) {
        this.useConnectedCustomerId = useConnectedCustomerId;
    }

    public String getConnectedCustomerId() {
        return connectedCustomerId;
    }

    public void setConnectedCustomerId(String connectedCustomerId) {
        this.connectedCustomerId = connectedCustomerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnlyDone() {
        return onlyDone;
    }

    public void setOnlyDone(boolean onlyDone) {
        this.onlyDone = onlyDone;
    }

    public boolean isOnlyActive() {
        return onlyActive;
    }

    public void setOnlyActive(boolean onlyActive) {
        this.onlyActive = onlyActive;
    }

    public UserAccountPredicate getResponsibles() {
        return responsibles;
    }

    public void setResponsibles(UserAccountPredicate responsibles) {
        this.responsibles = responsibles;
    }

    public boolean isUseCompletedDateFrom() {
        return useCompletedDateFrom;
    }

    public void setUseCompletedDateFrom(boolean useCompletedDateFrom) {
        this.useCompletedDateFrom = useCompletedDateFrom;
    }

    public boolean isUseCompletedDateTo() {
        return useCompletedDateTo;
    }

    public void setUseCompletedDateTo(boolean useCompletedDateTo) {
        this.useCompletedDateTo = useCompletedDateTo;
    }

    public String getCompletedDateFrom() {
        return completedDateFrom;
    }

    public void setCompletedDateFrom(String completedDateFrom) {
        this.completedDateFrom = completedDateFrom;
    }

    public String getCompletedDateTo() {
        return completedDateTo;
    }

    public void setCompletedDateTo(String completedDateTo) {
        this.completedDateTo = completedDateTo;
    }
}
