package com.biqasoft.microservice.common;

import com.biqasoft.entity.core.DomainSettings;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.MicroMapping;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.MicroPathVar;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.Microservice;

import org.springframework.http.HttpMethod;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 7/18/2016
 *         All Rights Reserved
 */
@Microservice(value = "users", basePath = "/v1/domain_settings")
public interface MicroserviceDomainSettings {

    @MicroMapping(path = "", method = HttpMethod.POST)
    DomainSettings create(DomainSettings domainSettings);

    @MicroMapping(path = "/id/{id}/unsafe", method = HttpMethod.DELETE)
    void unsafeDelete(@MicroPathVar("id") String domainSettings);

    @MicroMapping("/my")
    DomainSettings findDomainSetting();

    @MicroMapping(path = "", method = HttpMethod.PUT)
    DomainSettings unsafeUpdateDomainSettings(DomainSettings domainSettings);

    @MicroMapping(path = "/domain", method = HttpMethod.PUT)
    DomainSettings updateDomainSettings(DomainSettings domainSettings);

    @MicroMapping("/id/{id}/unsafe")
    DomainSettings unsafeFindDomainSettingsById(@MicroPathVar("id") String domainSettings);

}
