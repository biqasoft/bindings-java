/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.customer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.javers.core.metamodel.annotation.Value;

import java.io.Serializable;

@Value
@ApiModel("Social network info for customer")
public class SocialNetworks implements Serializable {

    @ApiModelProperty("Facebook user id")
    private String fb = null;

    @ApiModelProperty("VKontakte user id")
    private String vk = null;

    @ApiModelProperty("Twitter user id")
    private String twitter = null;

    @ApiModelProperty("Odnoklassniki user id")
    private String ok = null;

    @ApiModelProperty("instagram user id")
    private String instagram = null;

    @ApiModelProperty("linkedin user id")
    private String linkedin = null;

    @ApiModelProperty("youtube user id")
    private String youtube = null;


    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public String getFb() {
        return fb;
    }

    public void setFb(String fb) {
        this.fb = fb;
    }

    public String getVk() {
        return vk;
    }

    public void setVk(String vk) {
        this.vk = vk;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SocialNetworks that = (SocialNetworks) o;

        if (fb != null ? !fb.equals(that.fb) : that.fb != null) return false;
        if (vk != null ? !vk.equals(that.vk) : that.vk != null) return false;
        if (twitter != null ? !twitter.equals(that.twitter) : that.twitter != null) return false;
        if (ok != null ? !ok.equals(that.ok) : that.ok != null) return false;
        if (instagram != null ? !instagram.equals(that.instagram) : that.instagram != null) return false;
        if (linkedin != null ? !linkedin.equals(that.linkedin) : that.linkedin != null) return false;
        if (youtube != null ? !youtube.equals(that.youtube) : that.youtube != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fb != null ? fb.hashCode() : 0;
        result = 31 * result + (vk != null ? vk.hashCode() : 0);
        result = 31 * result + (twitter != null ? twitter.hashCode() : 0);
        result = 31 * result + (ok != null ? ok.hashCode() : 0);
        result = 31 * result + (instagram != null ? instagram.hashCode() : 0);
        result = 31 * result + (linkedin != null ? linkedin.hashCode() : 0);
        result = 31 * result + (youtube != null ? youtube.hashCode() : 0);
        return result;
    }
}
