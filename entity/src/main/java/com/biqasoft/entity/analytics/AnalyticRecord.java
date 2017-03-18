/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.analytics;

import com.biqasoft.entity.core.GlobalStoredBaseClass;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class AnalyticRecord extends GlobalStoredBaseClass {

    private UTMAllMetricInfo utm;
    private Hit hit = null;

    private String counterId; //WebAnalyticsCounter .getId()
    private String action; // "pageView"

    private String userCookieId;
    private String pathname;
    private String fullUrl;
    private String sessionId;
    private Date createdDate;

    //    private YandexDirectClick yandexDirectClick = null;


    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Hit getHit() {
        return hit;
    }

    public void setHit(Hit hit) {
        this.hit = hit;
    }


    public UTMAllMetricInfo getUtm() {
        return utm;
    }

    public void setUtm(UTMAllMetricInfo utm) {
        this.utm = utm;
    }

//    public YandexDirectClick getYandexDirectClick() {
//        return yandexDirectClick;
//    }
//
//    public void setYandexDirectClick(YandexDirectClick yandexDirectClick) {
//        this.yandexDirectClick = yandexDirectClick;
//    }

    public String getCounterId() {
        return counterId;
    }

    public void setCounterId(String counterId) {
        this.counterId = counterId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUserCookieId() {
        return userCookieId;
    }

    public void setUserCookieId(String userCookieId) {
        this.userCookieId = userCookieId;
    }

    public String getPathname() {
        return pathname;
    }

    public void setPathname(String pathname) {
        this.pathname = pathname;
    }

    public String getFullUrl() {
        return fullUrl;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }
}
