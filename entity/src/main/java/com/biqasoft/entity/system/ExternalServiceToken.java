/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.system;

import com.biqasoft.entity.core.GlobalStoredBaseClass;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.javers.core.metamodel.annotation.DiffIgnore;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@ApiModel(value = "This is object containing info about another common, such as dropbox, yandex direct etc.",
        description = "note, that this ID - is internal system ID. Users will not be able to see real external API common tokens to make API calls")
public class ExternalServiceToken extends GlobalStoredBaseClass {

    @ApiModelProperty("Token tha we sent to another service")
    @JsonIgnore
    @DiffIgnore
    @Indexed
    private String token;

    @ApiModelProperty("Service provider: dropbox... see TOKEN_TYPES class ")
    @Indexed
    private String type;

    @ApiModelProperty("Optional")
    @DiffIgnore
    private Date expired;

    @ApiModelProperty("Login or id, email that provide ANOTHER service")
    @Indexed
    private String login;

    @JsonIgnore
    @DiffIgnore
    private String refreshToken;

    private String server;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    @JsonIgnore
    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @JsonIgnore
    public String getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExternalServiceToken that = (ExternalServiceToken) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (expired != null ? !expired.equals(that.expired) : that.expired != null) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        return server != null ? server.equals(that.server) : that.server == null;

    }

    @Override
    public int hashCode() {
        int result = expired != null ? expired.hashCode() : 0;
        result = 31 * result + (server != null ? server.hashCode() : 0);
        return result;
    }
}
