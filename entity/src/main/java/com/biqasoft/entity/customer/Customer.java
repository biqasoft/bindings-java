/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.customer;

import com.biqasoft.entity.analytics.AnalyticRecord;
import com.biqasoft.entity.analytics.CustomerWebAnalytics;
import com.biqasoft.entity.annotations.BiqaDontOverrideField;
import com.biqasoft.entity.core.BaseClass;
import com.biqasoft.entity.salesfunnel.AbstractSalesFunnelStatus;
import com.biqasoft.entity.salesfunnel.SalesFunnelStatus;
import com.biqasoft.entity.salesfunnel.SalesFunnelStatusWithoutDataSource;
import com.biqasoft.entity.system.ConnectedInfo;
import com.biqasoft.entity.core.useraccount.UserAccount;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.javers.core.metamodel.annotation.DiffIgnore;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@ApiModel(description = "This is customer or lead in CRM. Important object")
public class Customer extends BaseClass {

    @TextIndexed
    @ApiModelProperty(notes = "first name of client or customer")
    private String firstName;

    @TextIndexed(weight = 2)
    @ApiModelProperty(notes = "last name of client or customer")
    private String lastName;

    @TextIndexed
    @ApiModelProperty(notes = "patronymic of client or customer")
    private String patronymic;

    @TextIndexed
    @ApiModelProperty(notes = "email of client or customer")
    private String email;

    @ApiModelProperty(notes = "additional list of emails")
    private List<String> emails = new ArrayList<>();

    @ApiModelProperty(notes = "additional list of telephones")
    private List<String> telephones = new ArrayList<>();

    @TextIndexed
    @ApiModelProperty(notes = "main contact telephone of client or customer")
    private String telephone;

    @ApiModelProperty(notes = "is he/she is lead? (true/false). if this property is false, this means, that he/she didn't bought anything", required = true)
    @Indexed
    private boolean lead;

    @ApiModelProperty(notes = "is he/she is customer? (true/false). if this property is true, it means that he/she bought something", required = true)
    @Indexed
    private boolean customer;

    @ApiModelProperty(notes = "is this customer active (true, false). Used to filter not relevant customers and leads")
    @Indexed
    private boolean active;

    @ApiModelProperty(notes = "is this customer important (true, false). Used to filter not relevant customers and leads")
    @Indexed
    private boolean important;

    @ApiModelProperty(notes = "customer address")
    private String address = null;

    @ApiModelProperty(notes = "customer job position")
    private String position = null;

    @ApiModelProperty(notes = "is b2b customer", required = true)
    @Indexed
    private boolean b2b;

    @ApiModelProperty(notes = "19.09.2015 - this parameter is not used", required = false)
    private String sex;

    /**
     * {@link LeadGenMethod}
     */
    @ApiModelProperty(value = "lead gen method ID", required = true)
    @Indexed
    private String leadGenMethod = null;

    /**
     * {@link LeadGenProject}
     */
    @ApiModelProperty(value = "lead gen project ID", required = true)
    @Indexed
    private String leadGenProject = null;

    /**
     * {@link SalesFunnelStatus}
     */
    @ApiModelProperty(value = "current status of sales funnel for customer,lead", required = true)
    @Indexed
    private SalesFunnelStatusWithoutDataSource salesFunnelStatus;

    /**
     * {@link StaticSegment}
     */
    @ApiModelProperty(notes = "array of IDs of static segments")
    @Indexed
    private List<String> staticSegmentsIDs = new ArrayList<>();

    @ApiModelProperty(notes = "b2b company")
    @DBRef
    @Indexed
    private Company company;

    @DiffIgnore
    private AnalyticRecord arec;
    @DiffIgnore
    private CustomerWebAnalytics customerWebAnalytics;

    /**
     * ID of useraccount
     * {@link UserAccount}
     */
    @ApiModelProperty(notes = "ID of useraccount responsible manager")
    @Indexed
    private String responsibleManagerID;

    @ApiModelProperty("Connected Social networks of customer")
    private SocialNetworks socialNetworks;

    private ConnectedInfo connectedInfo = new ConnectedInfo();

    @DiffIgnore
    @BiqaDontOverrideField
    private CustomerOverview customerOverview = new CustomerOverview();

    @BiqaDontOverrideField
    @DiffIgnore
    @ApiModelProperty("Customer dynamic segments; Note: this is near to realtime data and updates in some minutes. " +
            "Segments(filters) that include `showOnlyWhenIamResponsible=true` are excluded. The last update data is `dynamicSegmentsLastDate` property of customer")
    private List<String> dynamicSegments = new ArrayList<>();

    @ApiModelProperty("Last update date of `dynamicSegments` field")
    @BiqaDontOverrideField
    @DiffIgnore
    private Date dynamicSegmentsLastDate;

    public Customer() {
    }

    public List<String> getDynamicSegments() {
        return dynamicSegments;
    }

    public void setDynamicSegments(List<String> dynamicSegments) {
        this.dynamicSegments = dynamicSegments;
    }

    public Date getDynamicSegmentsLastDate() {
        return dynamicSegmentsLastDate;
    }

    public void setDynamicSegmentsLastDate(Date dynamicSegmentsLastDate) {
        this.dynamicSegmentsLastDate = dynamicSegmentsLastDate;
    }

    public ConnectedInfo getConnectedInfo() {
        return connectedInfo;
    }

    public void setConnectedInfo(ConnectedInfo connectedInfo) {
        this.connectedInfo = connectedInfo;
    }

    public CustomerOverview getCustomerOverview() {
        return customerOverview;
    }

    public void setCustomerOverview(CustomerOverview customerOverview) {
        this.customerOverview = customerOverview;
    }

    public SocialNetworks getSocialNetworks() {
        return socialNetworks;
    }

    public void setSocialNetworks(SocialNetworks socialNetworks) {
        this.socialNetworks = socialNetworks;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<String> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<String> telephones) {
        this.telephones = telephones;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public boolean isLead() {
        return lead;
    }

    public void setLead(boolean lead) {
        this.lead = lead;
    }

    public boolean isCustomer() {
        return customer;
    }

    public void setCustomer(boolean customer) {
        this.customer = customer;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isImportant() {
        return important;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isB2b() {
        return b2b;
    }

    public void setB2b(boolean b2b) {
        this.b2b = b2b;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLeadGenMethod() {
        return leadGenMethod;
    }

    public void setLeadGenMethod(String leadGenMethod) {
        this.leadGenMethod = leadGenMethod;
    }

    public String getLeadGenProject() {
        return leadGenProject;
    }

    public void setLeadGenProject(String leadGenProject) {
        this.leadGenProject = leadGenProject;
    }

    public SalesFunnelStatusWithoutDataSource getSalesFunnelStatus() {
        return (SalesFunnelStatusWithoutDataSource) salesFunnelStatus;
    }

    @JsonSetter
    public void setSalesFunnelStatus(SalesFunnelStatusWithoutDataSource salesFunnelStatus) {

        this.salesFunnelStatus = salesFunnelStatus;
    }

    public void setSalesFunnelStatus(SalesFunnelStatus salesFunnelStatus) {

        this.salesFunnelStatus = AbstractSalesFunnelStatus.transformSalesFunnelToWithoutDataSource(salesFunnelStatus);
    }

    public List<String> getStaticSegmentsIDs() {
        return staticSegmentsIDs;
    }

    public void setStaticSegmentsIDs(List<String> staticSegmentsIDs) {
        this.staticSegmentsIDs = staticSegmentsIDs;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public AnalyticRecord getAnalyticRecord() {
        return arec;
    }

    public void setAnalyticRecord(AnalyticRecord analyticRecord) {
        this.arec = analyticRecord;
    }

    public CustomerWebAnalytics getCustomerWebAnalytics() {
        return customerWebAnalytics;
    }

    public void setCustomerWebAnalytics(CustomerWebAnalytics customerWebAnalytics) {
        this.customerWebAnalytics = customerWebAnalytics;
    }


    public String getResponsibleManagerID() {
        return responsibleManagerID;
    }

    public void setResponsibleManagerID(String responsibleManagerID) {
        this.responsibleManagerID = responsibleManagerID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer1 = (Customer) o;

        if (lead != customer1.lead) return false;
        if (customer != customer1.customer) return false;
        if (active != customer1.active) return false;
        if (important != customer1.important) return false;
        if (b2b != customer1.b2b) return false;
        if (firstName != null ? !firstName.equals(customer1.firstName) : customer1.firstName != null) return false;
        if (lastName != null ? !lastName.equals(customer1.lastName) : customer1.lastName != null) return false;
        if (patronymic != null ? !patronymic.equals(customer1.patronymic) : customer1.patronymic != null) return false;
        if (email != null ? !email.equals(customer1.email) : customer1.email != null) return false;
        if (emails != null ? !emails.equals(customer1.emails) : customer1.emails != null) return false;
        if (telephones != null ? !telephones.equals(customer1.telephones) : customer1.telephones != null) return false;
        if (telephone != null ? !telephone.equals(customer1.telephone) : customer1.telephone != null) return false;
        if (address != null ? !address.equals(customer1.address) : customer1.address != null) return false;
        if (position != null ? !position.equals(customer1.position) : customer1.position != null) return false;
        if (sex != null ? !sex.equals(customer1.sex) : customer1.sex != null) return false;
        if (leadGenMethod != null ? !leadGenMethod.equals(customer1.leadGenMethod) : customer1.leadGenMethod != null)
            return false;
        if (leadGenProject != null ? !leadGenProject.equals(customer1.leadGenProject) : customer1.leadGenProject != null)
            return false;
        if (salesFunnelStatus != null ? !salesFunnelStatus.equals(customer1.salesFunnelStatus) : customer1.salesFunnelStatus != null)
            return false;
        if (staticSegmentsIDs != null ? !staticSegmentsIDs.equals(customer1.staticSegmentsIDs) : customer1.staticSegmentsIDs != null)
            return false;
        if (company != null ? !company.equals(customer1.company) : customer1.company != null) return false;
        if (arec != null ? !arec.equals(customer1.arec) : customer1.arec != null) return false;
        if (customerWebAnalytics != null ? !customerWebAnalytics.equals(customer1.customerWebAnalytics) : customer1.customerWebAnalytics != null)
            return false;
        if (responsibleManagerID != null ? !responsibleManagerID.equals(customer1.responsibleManagerID) : customer1.responsibleManagerID != null)
            return false;
        if (socialNetworks != null ? !socialNetworks.equals(customer1.socialNetworks) : customer1.socialNetworks != null)
            return false;
        if (connectedInfo != null ? !connectedInfo.equals(customer1.connectedInfo) : customer1.connectedInfo != null)
            return false;
        if (customerOverview != null ? !customerOverview.equals(customer1.customerOverview) : customer1.customerOverview != null)
            return false;
        if (dynamicSegments != null ? !dynamicSegments.equals(customer1.dynamicSegments) : customer1.dynamicSegments != null)
            return false;
        return dynamicSegmentsLastDate != null ? dynamicSegmentsLastDate.equals(customer1.dynamicSegmentsLastDate) : customer1.dynamicSegmentsLastDate == null;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (emails != null ? emails.hashCode() : 0);
        result = 31 * result + (telephones != null ? telephones.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (lead ? 1 : 0);
        result = 31 * result + (customer ? 1 : 0);
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (important ? 1 : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (b2b ? 1 : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (leadGenMethod != null ? leadGenMethod.hashCode() : 0);
        result = 31 * result + (leadGenProject != null ? leadGenProject.hashCode() : 0);
        result = 31 * result + (salesFunnelStatus != null ? salesFunnelStatus.hashCode() : 0);
        result = 31 * result + (staticSegmentsIDs != null ? staticSegmentsIDs.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (arec != null ? arec.hashCode() : 0);
        result = 31 * result + (customerWebAnalytics != null ? customerWebAnalytics.hashCode() : 0);
        result = 31 * result + (responsibleManagerID != null ? responsibleManagerID.hashCode() : 0);
        result = 31 * result + (socialNetworks != null ? socialNetworks.hashCode() : 0);
        result = 31 * result + (connectedInfo != null ? connectedInfo.hashCode() : 0);
        result = 31 * result + (customerOverview != null ? customerOverview.hashCode() : 0);
        result = 31 * result + (dynamicSegments != null ? dynamicSegments.hashCode() : 0);
        result = 31 * result + (dynamicSegmentsLastDate != null ? dynamicSegmentsLastDate.hashCode() : 0);
        return result;
    }
}
