package com.biqasoft.microservice.common;

import com.biqasoft.microservice.common.dto.DomainDto;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.MicroMapping;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.MicroPathVar;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.Microservice;
import org.springframework.http.HttpMethod;

import java.util.List;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 7/18/2016
 *         All Rights Reserved
 */
@Microservice(value = "users", basePath = "/v1/domain")
public interface MicroserviceDomain {

    @MicroMapping(path = "", method = HttpMethod.POST)
    DomainDto create(DomainDto domainDto);

    @MicroMapping(path = "/{id}/unsafe", method = HttpMethod.DELETE)
    void unsafeDelete(@MicroPathVar("id") String domain);

    @MicroMapping(path = "/unsafe", method = HttpMethod.PUT)
    DomainDto unsafeUpdateDomain(DomainDto domainDto);

    @MicroMapping("/{id}/unsafe")
    DomainDto unsafeFindDomainById(@MicroPathVar("id") String domain);

    @MicroMapping(path = "")
    List<DomainDto> unsafeFindAllDomains();

    @MicroMapping(path = "/my", method = HttpMethod.PUT)
    DomainDto updateDomain(DomainDto domainDto);

    @MicroMapping("/my")
    DomainDto findDomain();

}
