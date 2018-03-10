/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.constants;

import io.swagger.annotations.ApiModel;

@ApiModel
public final class SystemRoles {

    // This is special role, granted when authenticated in special password
    // not used by normal users
    public static final String ROOT_USER = "ROLE_ROOT_USER";

    // when authenticated with oauth2 app
    // and allow to use all user account roles
    // gived to oauth app, not user account
    public static final String OAUTH_ALL_USER = "ROLE_OAUTH_ALL_USER";

    // authenticated not with user and password but with token
    public static final String OAUTH_AUTHENTICATED = "OAUTH_AUTHENTICATED";

    // domain administrator - allow partly all
    public static final String ROLE_ADMIN = "ROLE_ADMIN";
    public static final String ALLOW_ALL_DOMAIN_BASED = "ROLE_ALLOW_ALL_DOMAIN_BASED";

    public static final String ANALYTIC_PRIVATE_ROOT = "ROLE_ANALYTIC_PRIVATE_ROOT";
    public static final String ANALYTIC_ADD_COUNTER = "ROLE_ANALYTIC_ADD_COUNTER";
    public static final String ANALYTIC_GET_COUNTERS = "ROLE_ANALYTIC_GET_COUNTERS";
    public static final String ANALYTIC_RECORDS_MAP_REDUCE_FILTERS = "ROLE_ANALYTIC_RECORDS_MAP_REDUCE_FILTERS";

    public static final String HISTORY_ROOT = "ROLE_HISTORY_ROOT";

    public static final String COMPANY_ROOT = "ROLE_COMPANY_ROOT";
    public static final String COMPANY_GET_ALL = "ROLE_COMPANY_GET_ALL";
    public static final String COMPANY_ADD = "ROLE_COMPANY_ADD";
    public static final String COMPANY_EDIT = "ROLE_COMPANY_EDIT";
    public static final String COMPANY_DELETE = "ROLE_COMPANY_DELETE";


    public static final String CUSTOMER_ROOT = "ROLE_CUSTOMER_ROOT";
    public static final String CUSTOMER_GET_ALL = "ROLE_CUSTOMER_GET_ALL";
    public static final String CUSTOMER_EDIT = "ROLE_CUSTOMER_EDIT";
    public static final String CUSTOMER_ADD = "ROLE_CUSTOMER_ADD";
    public static final String CUSTOMER_DOWNLOAD_EXCEL = "ROLE_CUSTOMER_DOWNLOAD_EXCEL";

    public static final String LEAD_GEN_METHOD_ROOT = "ROLE_LEAD_GEN_METHOD_ROOT";
    public static final String LEAD_GEN_METHOD_GET_ALL = "ROLE_LEAD_GEN_METHOD_GET_ALL";
    public static final String LEAD_GEN_METHOD_ADD = "ROLE_LEAD_GEN_METHOD_ADD";
    public static final String LEAD_GEN_METHOD_EDIT = "ROLE_LEAD_GEN_METHOD_EDIT";
    public static final String LEAD_GEN_METHOD_EXCEL = "ROLE_LEAD_GEN_METHOD_EXCEL";

    public static final String DATA_SOURCES_ROOT = "ROLE_DATA_SOURCES_ROOT";
    public static final String DATA_SOURCES_GET = "ROLE_DATA_SOURCES_GET";
    public static final String DATA_SOURCES_DELETE = "ROLE_DATA_SOURCES_DELETE";
    public static final String DATA_SOURCES_EDIT = "ROLE_DATA_SOURCES_EDIT";
    public static final String DATA_SOURCES_ADD = "ROLE_DATA_SOURCES_ADD";
    public static final String DATA_SOURCES_ADD_METRIC_MANUALLY = "ROLE_DATA_SOURCES_ADD_METRIC_MANUALLY";
    public static final String DATA_SOURCES_EXCEL = "ROLE_DATA_SOURCES_EXCEL";

    public static final String CUSTOM_OBJECT_ROOT = "ROLE_CUSTOM_OBJECT_ROOT";
    public static final String CUSTOM_OBJECT_GET = "ROLE_CUSTOM_OBJECT_GET";
    public static final String CUSTOM_OBJECT_DELETE = "ROLE_CUSTOM_OBJECT_DELETE";
    public static final String CUSTOM_OBJECT_EDIT = "ROLE_CUSTOM_OBJECT_EDIT";
    public static final String CUSTOM_OBJECT_ADD = "ROLE_CUSTOM_OBJECT_ADD";

    // NOTE: this is real files from templates
    public static final String CUSTOM_OBJECT_META_ROOT = "ROLE_CUSTOM_OBJECT_META_ROOT";
    public static final String CUSTOM_OBJECT_META_GET = "ROLE_CUSTOM_OBJECT_META_GET";
    public static final String CUSTOM_OBJECT_META_GET_EXCEL = "CUSTOM_OBJECT_META_GET_EXCEL";
    public static final String CUSTOM_OBJECT_META_DELETE = "ROLE_CUSTOM_OBJECT_META_DELETE";
    public static final String CUSTOM_OBJECT_META_EDIT = "ROLE_CUSTOM_OBJECT_META_EDIT";
    public static final String CUSTOM_OBJECT_META_ADD = "ROLE_CUSTOM_OBJECT_META_ADD";

    // Not implement in UI
    public static final String DOCUMENTS_ROOT = "ROLE_DOCUMENTS_ROOT";
    public static final String DOCUMENTS_GET = "ROLE_DOCUMENTS_GET";
    public static final String DOCUMENTS_EDIT = "ROLE_DOCUMENTS_EDIT";
    public static final String DOCUMENTS_ADD = "ROLE_DOCUMENTS_ADD";
    public static final String DOCUMENTS_DOWNLOAD = "ROLE_DOCUMENTS_DOWNLOAD";

    // Not implement in UI
    public static final String KPI_ROOT = "ROLE_KPI_ROOT";
    public static final String KPI_LEAD_GEN_METHOD = "ROLE_KPI_LEAD_GEN_METHOD";
    public static final String KPI_TASK = "ROLE_KPI_TASK";
    public static final String KPI_SALES_MANAGER = "ROLE_KPI_SALES_MANAGER";
//    public static final String KPI_CALL = "ROLE_KPI_CALL";

    public static final String PAYMENT_ROOT = "ROLE_PAYMENT_ROOT";
    public static final String PAYMENT_GET_CUSTOMER_DEALS = "ROLE_PAYMENT_GET_CUSTOMER_DEALS";
    public static final String PAYMENT_GET_COMPANY_COST = "ROLE_PAYMENT_GET_COMPANY_COST";
    public static final String PAYMENT_ADD_COMPANY_COST = "ROLE_PAYMENT_ADD_COMPANY_COST";
    public static final String PAYMENT_EDIT_COMPANY_COST = "ROLE_PAYMENT_EDIT_COMPANY_COST";
    public static final String PAYMENT_EDIT_CUSTOMER_DEALS = "ROLE_PAYMENT_EDIT_CUSTOMER_DEALS";
    public static final String PAYMENT_DELETE_CUSTOMER_DEALS = "ROLE_PAYMENT_DELETE_CUSTOMER_DEALS";
    public static final String PAYMENT_ADD_CUSTOMER_DEAL = "ROLE_PAYMENT_ADD_CUSTOMER_DEAL";

    public static final String SEARCH_ROOT = "ROLE_SEARCH_ROOT";
    public static final String SEARCH_EVERYWHERE = "ROLE_SEARCH_EVERYWHERE";

    public static final String STATS_DOMAIN_BASIC = "ROLE_STATS_DOMAIN_BASIC";
    public static final String DOMAIN_COMPANY_ROOT = "ROLE_DOMAIN_COMPANY_ROOT";
    public static final String DOMAIN_COMPANY_GET_BASIC = "ROLE_DOMAIN_COMPANY_GET_BASIC";
    public static final String DOMAIN_COMPANY_UPDATE_SETTINGS = "ROLE_DOMAIN_COMPANY_UPDATE_SETTINGS";

    public static final String EXTERNAL_SERVICES_ROOT = "ROLE_EXTERNAL_SERVICES_ROOT";
    public static final String EXTERNAL_SERVICES_GET_ALL_ACCOUNTS = "ROLE_EXTERNAL_SERVICES_GET_ALL_ACCOUNTS";
    public static final String EXTERNAL_SERVICES_ADD_ACCOUNTS = "ROLE_EXTERNAL_SERVICES_ADD_ACCOUNTS";
    public static final String EXTERNAL_SERVICES_EDIT_ACCOUNTS = "ROLE_EXTERNAL_SERVICES_EDIT_ACCOUNTS";
    public static final String EXTERNAL_SERVICES_DELETE_ACCOUNTS = "ROLE_EXTERNAL_SERVICES_DELETE_ACCOUNTS";

    public static final String OPPORTUNITY_ROOT = "ROLE_OPPORTUNITY_ROOT";
    public static final String OPPORTUNITY_GET = "ROLE_OPPORTUNITY_GET";
    public static final String OPPORTUNITY_ADD = "ROLE_OPPORTUNITY_ADD";
    public static final String OPPORTUNITY_EDIT = "ROLE_OPPORTUNITY_EDIT";
    public static final String OPPORTUNITY_DELETE = "ROLE_OPPORTUNITY_DELETE";

    public static final String TASK_ROOT = "ROLE_TASK_ROOT";
    public static final String TASK_ADD = "ROLE_TASK_ADD";
    public static final String TASK_EDIT = "ROLE_TASK_EDIT";
    public static final String TASK_DELETE = "ROLE_TASK_DELETE";
    public static final String TASK_GET = "ROLE_TASK_GET";

    public static final String TASK_TEMPLATE_ROOT = "ROLE_TASK_TEMPLATE_ROOT";
    public static final String TASK_TEMPLATE_ADD = "ROLE_TASK_TEMPLATE_ADD";
    public static final String TASK_TEMPLATE_EDIT = "ROLE_TASK_TEMPLATE_EDIT";
    public static final String TASK_TEMPLATE_DELETE = "ROLE_TASK_TEMPLATE_DELETE";
    public static final String TASK_TEMPLATE_GET = "ROLE_TASK_TEMPLATE_GET";

    public static final String TASK_PROJECT_ROOT = "ROLE_TASK_PROJECT_ROOT";
    public static final String TASK_PROJECT_ADD = "ROLE_TASK_PROJECT_ADD";
    public static final String TASK_PROJECT_EDIT = "ROLE_TASK_PROJECT_EDIT";
    public static final String TASK_PROJECT_DELETE = "ROLE_TASK_PROJECT_DELETE";
    public static final String TASK_PROJECT_GET = "ROLE_TASK_PROJECT_GET";

    public static final String USER_ACCOUNT_ROOT = "ROLE_USER_ACCOUNT_ROOT";
    public static final String USER_ACCOUNT_ADD = "ROLE_USER_ACCOUNT_ADD";
    public static final String USER_ACCOUNT_EDIT = "ROLE_USER_ACCOUNT_EDIT";
    public static final String USER_ACCOUNT_DELETE = "ROLE_USER_ACCOUNT_DELETE";
    public static final String USER_ACCOUNT_GET = "ROLE_USER_ACCOUNT_GET";

    public static final String USER_GROUP_ROOT = "ROLE_USER_GROUP_ROOT";
    public static final String USER_GROUP_ADD = "ROLE_USER_GROUP_ADD";
    public static final String USER_GROUP_EDIT = "ROLE_USER_GROUP_EDIT";
    public static final String USER_GROUP_DELETE = "ROLE_USER_GROUP_DELETE";
    public static final String USER_GROUP_GET = "ROLE_USER_GROUP_GET";

    public static final String WIDGET_ROOT = "ROLE_WIDGET_ROOT";
    public static final String WIDGET_ADD = "ROLE_WIDGET_ADD";
    public static final String WIDGET_EDIT = "ROLE_WIDGET_EDIT";
    public static final String WIDGET_DELETE = "ROLE_WIDGET_DELETE";
    public static final String WIDGET_GET = "ROLE_WIDGET_GET";

    public static final String YANDEX_DIRECT_ROOT = "ROLE_YANDEX_DIRECT_ROOT";

    // take part in motivation desk result
    public static final String ROLE_SELLER_MOTIVATION_DESK = "ROLE_SELLER_MOTIVATION_DESK";

    // allow to update account of current user
    public static final String UPDATE_MYACCOUNT = "ROLE_UPDATE_MYACCOUNT";

    public static final String SEGMENT_ROOT = "ROLE_SEGMENT_ROOT";
    public static final String SEGMENT_ADD = "ROLE_SEGMENT_ADD";
    public static final String SEGMENT_EDIT = "ROLE_SEGMENT_EDIT";
    public static final String SEGMENT_DELETE = "ROLE_SEGMENT_DELETE";
    public static final String SEGMENT_GET = "ROLE_SEGMENT_GET";

    public static final String CUSTOM_OBJECT_DATA_ROOT = "ROLE_CUSTOM_OBJECT_DATA_ROOT";
    public static final String CUSTOM_OBJECT_DATA_ADD = "ROLE_CUSTOM_OBJECT_DATA_ADD";
    public static final String CUSTOM_OBJECT_DATA_EDIT = "ROLE_CUSTOM_OBJECT_DATA_EDIT";
    public static final String CUSTOM_OBJECT_DATA_DELETE = "ROLE_CUSTOM_OBJECT_DATA_DELETE";
    public static final String CUSTOM_OBJECT_DATA_GET = "ROLE_CUSTOM_OBJECT_DATA_GET";

}
