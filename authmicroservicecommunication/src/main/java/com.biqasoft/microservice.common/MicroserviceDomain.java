package com.biqasoft.microservice.common;

import com.biqasoft.entity.core.Domain;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.MicroPathVar;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.Microservice;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.MicroMapping;

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
    Domain create(Domain domain);

    @MicroMapping(path = "/{id}/unsafe", method = HttpMethod.DELETE)
    void unsafeDelete(@MicroPathVar("id") String domain);

    @MicroMapping(path = "/unsafe", method = HttpMethod.PUT)
    Domain unsafeUpdateDomain(Domain domain);

    @MicroMapping("/{id}/unsafe")
    Domain unsafeFindDomainById(@MicroPathVar("id") String domain);

    @MicroMapping(path = "")
    List<Domain> unsafeFindAllDomains();

    @MicroMapping(path = "/my", method = HttpMethod.PUT)
    Domain updateDomain(Domain domain);

    @MicroMapping("/my")
    Domain findDomain();

}
