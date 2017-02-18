/*
 * Copyright 2016 the original author or authors.
 */

package com.biqasoft.auth;

import com.biqasoft.entity.core.CurrentUser;
import com.biqasoft.microservice.communicator.http.MicroserviceRestTemplate;
import com.biqasoft.microservice.communicator.interfaceimpl.MicroserviceRequestInterceptor;
import com.biqasoft.microservice.configs.LoggerConfigHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import static com.biqasoft.microservice.configs.LoggerConfigHelper.REQUEST_ID_LOGGER;

/**
 * 1) Add user auth (password or oauth2 token) from gateway to other microservices (and other microservices add too)
 * 2) Add request id across all requests chain
 *
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 7/27/2016
 *         All Rights Reserved
 */
@Component
public class CurrentUserMicroserviceRequestInterceptor implements MicroserviceRequestInterceptor {

    private final static String MICROSERVICE_USER_ACCOUNT_ID_HEADER = "X-Biqa-Request-User-Id";
    public final static String MICROSERVICE_REQUEST_ID_HEADER = "X-Biqa-Request-Id";
    private final static Logger logger = LoggerFactory.getLogger(CurrentUserMicroserviceRequestInterceptor.class);

    private final CurrentUser currentUser;

    @Autowired
    public CurrentUserMicroserviceRequestInterceptor(CurrentUser currentUser) {
        this.currentUser = currentUser;
    }

    @Override
    public void beforeProcessRequest(MicroserviceRestTemplate restTemplate, HttpHeaders httpHeaders) {
        String locale = null;

        // forward user auth header to microservice
        String userAuthHeader = MDC.get("Authorization");
        if (!StringUtils.isEmpty(userAuthHeader)){
            httpHeaders.add("Authorization", userAuthHeader);
        }

        // not not add if request will be to auth microservice
        if (currentUser != null && !"users".equals(restTemplate.getMicroserviceName())) {
            try {
                httpHeaders.add(MICROSERVICE_USER_ACCOUNT_ID_HEADER, currentUser.getCurrentUser().getId());
                locale = currentUser.getLanguage();
            } catch (Exception e) {
                logger.warn("Error get current user to microservice", e);
            }
        }else{
            locale = MDC.get("Accept-Language");
        }

        if (!StringUtils.isEmpty(locale)){
            httpHeaders.add("Accept-Language", locale);
        }

        // trace request across all microservice request. May be use zipkin ?
        String requestId = MDC.get(REQUEST_ID_LOGGER);
        if (requestId == null) {
            requestId = LoggerConfigHelper.generateRequestId();
        }
        httpHeaders.add(MICROSERVICE_REQUEST_ID_HEADER, requestId);
    }

}
