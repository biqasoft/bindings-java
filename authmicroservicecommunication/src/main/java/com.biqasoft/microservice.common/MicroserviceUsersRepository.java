package com.biqasoft.microservice.common;

import com.biqasoft.entity.core.Domain;
import com.biqasoft.entity.core.useraccount.PersonalSettings;
import com.biqasoft.entity.core.useraccount.UserAccount;
import com.biqasoft.entity.dto.useraccount.CreatedUser;
import com.biqasoft.entity.dto.useraccount.UserRegisterRequest;
import com.biqasoft.microservice.common.dto.SecondFactorResponse;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.MicroMapping;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.MicroPathVar;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.MicroPayloadVar;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.Microservice;
import org.springframework.http.HttpMethod;

import java.util.List;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 7/18/2016
 *         All Rights Reserved
 */
@Microservice(value = "users", basePath = "/v1/users")
public interface MicroserviceUsersRepository{

    @MicroMapping(path = "/domain", method = HttpMethod.POST)
    UserAccount addUser(UserRegisterRequest user);

    @MicroMapping(path = "/register", method = HttpMethod.POST)
    CreatedUser registerUser(UserRegisterRequest user);

    @MicroMapping(value = "/domain/fulltext_search", method = HttpMethod.POST)
    List<UserAccount> fullTextSearch(@MicroPayloadVar("text") String text);

    @MicroMapping("/domain/id/{userId}")
    UserAccount findByUserId(@MicroPathVar("userId") String userId);

    @MicroMapping("/search/domain/id/{userId}")
    Domain findDomainForUserAccountId(@MicroPathVar("userId") String userId);

    @MicroMapping("/id/{userId}")
    UserAccount unsafeFindUserById(@MicroPathVar("userId") String userId);

    // do not do this as HttpMethod.GET to avoid encode string problems
    @MicroMapping(path = "/find/username_or_oauth2_token", method = HttpMethod.POST)
    UserAccount unsafeFindByUsernameOrOAuthToken(@MicroPayloadVar("username") String userAccountGet);

    // update without checking permission
    @MicroMapping(path = "", method = HttpMethod.PUT)
    UserAccount unsafeUpdateUserAccount(UserAccount user);

    @MicroMapping(path = "/domain", method = HttpMethod.PUT)
    UserAccount updateUserAccount(UserAccount user);

    @MicroMapping(path = "/domain/current_user/set_online")
    void setCurrentUserOnline();

    @MicroMapping(path = "/domain/current_user/personal_settings", method = HttpMethod.PUT)
    void setCurrentUserPersonalSettings(PersonalSettings personalSettings);

    @MicroMapping(path = "/domain")
    List<UserAccount> findAllUsers();

    @MicroMapping(path = "/id/{id}", method = HttpMethod.DELETE)
    void unsafeDeleteUserById(@MicroPathVar(param = "id") String id);

    @MicroMapping(path = "/domain/id/{id}", method = HttpMethod.DELETE)
    void deleteUserById(@MicroPathVar(param = "id") String id);

    @MicroMapping(path = "/domain/2step", method = HttpMethod.POST)
    SecondFactorResponse tryToAdd2StepAuth(@MicroPayloadVar("id") String id);

    @MicroMapping("")
    List<UserAccount> unsafeFindAllUsers();

    @MicroMapping(path = "/domain/2step/modify", method = HttpMethod.POST)
    void modifyTwoStepAuth(@MicroPayloadVar("enabled") boolean enableTwoStep, @MicroPayloadVar("code") String code);

}
