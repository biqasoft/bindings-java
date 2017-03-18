/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.indicators.dto;

import com.biqasoft.entity.customer.Customer;
import com.biqasoft.entity.core.useraccount.UserAccount;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import com.biqasoft.entity.payments.CustomerDeal;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagerPaymentEntity implements Serializable {

    @Id
    private String id = new ObjectId().toString();

    private List<Customer> customers = new ArrayList<>();
    private List<CustomerDeal> customerDeals = new ArrayList<>();
    private BigDecimal allDealsAmount = new BigDecimal("0");
    private int allDealsCount = 0;

    private Date latestDealDate;
    private CustomerDeal latestDeal;

    private UserAccount userAccount;


    public CustomerDeal getLatestDeal() {
        return latestDeal;
    }

    public void setLatestDeal(CustomerDeal latestDeal) {
        this.latestDeal = latestDeal;
    }

    public Date getLatestDealDate() {
        return latestDealDate;
    }

    public void setLatestDealDate(Date latestDealDate) {
        this.latestDealDate = latestDealDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<CustomerDeal> getCustomerDeals() {
        return customerDeals;
    }

    public void setCustomerDeals(List<CustomerDeal> customerDeals) {
        this.customerDeals = customerDeals;
    }

    public BigDecimal getAllDealsAmount() {
        return allDealsAmount;
    }

    public void setAllDealsAmount(BigDecimal allDealsAmount) {
        this.allDealsAmount = allDealsAmount;
    }

    public int getAllDealsCount() {
        return allDealsCount;
    }

    public void setAllDealsCount(int allDealsCount) {
        this.allDealsCount = allDealsCount;
    }
}
