/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.payments;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CompanyCost extends Payment {

    @ApiModelProperty("This is yandex direct campaign ID; 0 - not connected with yandex campaign ")
    private int yandexDirectCampaignId = 0;

    public int getYandexDirectCampaignId() {
        return yandexDirectCampaignId;
    }

    public void setYandexDirectCampaignId(int yandexDirectCampaignId) {
        this.yandexDirectCampaignId = yandexDirectCampaignId;
    }
}
