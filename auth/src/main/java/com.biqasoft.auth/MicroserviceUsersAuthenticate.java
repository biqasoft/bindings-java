package com.biqasoft.auth;

import com.biqasoft.auth.dto.AuthenticateRequest;
import com.biqasoft.auth.dto.AuthenticateResponse;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.MicroMapping;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.Microservice;

import org.springframework.http.HttpMethod;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 7/18/2016
 *         All Rights Reserved
 */
@Microservice("users")
public interface MicroserviceUsersAuthenticate {

    @MicroMapping(path = "/v1/users/auth", method = HttpMethod.POST)
    AuthenticateResponse authenticate(AuthenticateRequest authenticateRequest);

}
