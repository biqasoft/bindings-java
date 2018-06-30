package com.biqasoft.microservice.common;

import com.biqasoft.microservice.common.dto.oauth2.OAuth2Application;
import com.biqasoft.microservice.common.dto.SampleDataResponseDto;
import com.biqasoft.microservice.common.dto.oauth2.UserAccountOAuth2;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.MicroMapping;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.MicroPathVar;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.Microservice;
import org.springframework.http.HttpMethod;

import java.util.List;

/**
 * {@link OAuth2Application} operations
 *
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 7/18/2016
 *         All Rights Reserved
 */
@Microservice(value = "users", basePath = "/v1/oauth2/application")
public interface MicroserviceOAuth2Applications {

    @MicroMapping("/{id}/secret_code")
    SampleDataResponseDto getSecretCodeForOAuthApplication(@MicroPathVar("id") String id);

    @MicroMapping(path = "", method = HttpMethod.POST)
    OAuth2Application create(OAuth2Application application);

    @MicroMapping(path = "", method = HttpMethod.PUT)
    OAuth2Application updateApplication(OAuth2Application application);

    @MicroMapping("/id/{id}")
    OAuth2Application findOAuth2ApplicationById(@MicroPathVar("id") String id);

    @MicroMapping(path = "/id/{id}", method = HttpMethod.DELETE)
    void deleteOAuth2ApplicationById(@MicroPathVar("id") String id);

    @MicroMapping("/list/domain")
    List<OAuth2Application> findOAuth2ApplicationInDomain();

    @MicroMapping("/list/public")
    List<OAuth2Application> findOAuth2ApplicationInPublic();

    @MicroMapping(path = "/obtain_access_code", method = HttpMethod.POST)
    UserAccountOAuth2 obtainAccessCode(@MicroPathVar("applicationId") String applicationId,
                                       @MicroPathVar("code") String code,
                                       @MicroPathVar("secretCode") String secretCode);

}
