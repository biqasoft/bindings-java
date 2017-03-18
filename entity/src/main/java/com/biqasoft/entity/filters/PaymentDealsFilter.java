/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.filters;

import com.biqasoft.entity.core.BaseClassFilter;

public class PaymentDealsFilter extends BaseClassFilter {

    private boolean onlyWithSellerRole = true;
    private boolean sortByDealsAmount = true;


    public boolean isSortByDealsAmount() {
        return sortByDealsAmount;
    }

    public void setSortByDealsAmount(boolean sortByDealsAmount) {
        this.sortByDealsAmount = sortByDealsAmount;
    }

    public boolean isOnlyWithSellerRole() {
        return onlyWithSellerRole;
    }

    public void setOnlyWithSellerRole(boolean onlyWithSellerRole) {
        this.onlyWithSellerRole = onlyWithSellerRole;
    }
}
