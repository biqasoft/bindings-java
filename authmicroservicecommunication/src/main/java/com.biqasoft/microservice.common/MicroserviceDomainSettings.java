package com.biqasoft.microservice.common;

import com.biqasoft.microservice.common.dto.DomainSettingsDto;
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
    DomainSettingsDto create(DomainSettingsDto domainSettingsDto);

    @MicroMapping(path = "/id/{id}/unsafe", method = HttpMethod.DELETE)
    void unsafeDelete(@MicroPathVar("id") String domainSettings);

    @MicroMapping("/my")
    DomainSettingsDto findDomainSetting();

    @MicroMapping(path = "", method = HttpMethod.PUT)
    DomainSettingsDto unsafeUpdateDomainSettings(DomainSettingsDto domainSettingsDto);

    @MicroMapping(path = "/domain", method = HttpMethod.PUT)
    DomainSettingsDto updateDomainSettings(DomainSettingsDto domainSettingsDto);

    @MicroMapping("/id/{id}/unsafe")
    DomainSettingsDto unsafeFindDomainSettingsById(@MicroPathVar("id") String domainSettings);

}
