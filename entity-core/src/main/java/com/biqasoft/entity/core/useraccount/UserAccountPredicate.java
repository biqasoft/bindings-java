/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.core.useraccount;

import org.javers.core.metamodel.annotation.Value;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Value
public class UserAccountPredicate implements Serializable {

    /**
     * see {@link UserAccount}
     */
    private List<String> userAccountsIDs = new ArrayList<>();

    /**
     * see {@link UserAccountGroup}
     */
    private List<String> userGroupsIDs = new ArrayList<>();


    public List<String> getUserGroupsIDs() {
        return userGroupsIDs;
    }

    public void setUserGroupsIDs(List<String> userGroupsIDs) {
        this.userGroupsIDs = userGroupsIDs;
    }

    public List<String> getUserAccountsIDs() {
        return userAccountsIDs;
    }

    public void setUserAccountsIDs(List<String> userAccountsIDs) {
        this.userAccountsIDs = userAccountsIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserAccountPredicate that = (UserAccountPredicate) o;

        if (userAccountsIDs != null ? !userAccountsIDs.equals(that.userAccountsIDs) : that.userAccountsIDs != null) return false;
        return userGroupsIDs != null ? userGroupsIDs.equals(that.userGroupsIDs) : that.userGroupsIDs == null;

    }

    @Override
    public int hashCode() {
        int result = userAccountsIDs != null ? userAccountsIDs.hashCode() : 0;
        result = 31 * result + (userGroupsIDs != null ? userGroupsIDs.hashCode() : 0);
        return result;
    }
}
