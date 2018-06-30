package com.biqasoft.microservice.common;

import com.biqasoft.microservice.common.dto.*;
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
    UserAccountDto addUser(UserRegisterRequestDto user);

    @MicroMapping(path = "/register", method = HttpMethod.POST)
    CreatedUserDto registerUser(UserRegisterRequestDto user);

    @MicroMapping(value = "/domain/fulltext_search", method = HttpMethod.POST)
    List<UserAccountDto> fullTextSearch(@MicroPayloadVar("text") String text);

    @MicroMapping("/domain/id/{userId}")
    UserAccountDto findByUserId(@MicroPathVar("userId") String userId);

    @MicroMapping("/search/domain/id/{userId}")
    DomainDto findDomainForUserAccountId(@MicroPathVar("userId") String userId);

    @MicroMapping("/id/{userId}")
    UserAccountDto unsafeFindUserById(@MicroPathVar("userId") String userId);

    // do not do this as HttpMethod.GET to avoid encode string problems
    @MicroMapping(path = "/find/username_or_oauth2_token", method = HttpMethod.POST)
    UserAccountDto unsafeFindByUsernameOrOAuthToken(@MicroPayloadVar("username") String userAccountGet);

    // update without checking permission
    @MicroMapping(path = "", method = HttpMethod.PUT)
    UserAccountDto unsafeUpdateUserAccount(UserAccountDto user);

    @MicroMapping(path = "/domain", method = HttpMethod.PUT)
    UserAccountDto updateUserAccount(UserAccountDto user);

    @MicroMapping(path = "/domain/current_user/set_online")
    void setCurrentUserOnline();

    @MicroMapping(path = "/domain/current_user/personal_settings", method = HttpMethod.PUT)
    void setCurrentUserPersonalSettings(PersonalSettingsDto personalSettingsDto);

    @MicroMapping(path = "/domain")
    List<UserAccountDto> findAllUsers();

    @MicroMapping(path = "/id/{id}", method = HttpMethod.DELETE)
    void unsafeDeleteUserById(@MicroPathVar(param = "id") String id);

    @MicroMapping(path = "/domain/id/{id}", method = HttpMethod.DELETE)
    void deleteUserById(@MicroPathVar(param = "id") String id);

    @MicroMapping(path = "/domain/2step", method = HttpMethod.POST)
    SecondFactorResponseDto tryToAdd2StepAuth(@MicroPayloadVar("id") String id);

    @MicroMapping("")
    List<UserAccountDto> unsafeFindAllUsers();

    @MicroMapping(path = "/domain/2step/modify", method = HttpMethod.POST)
    void modifyTwoStepAuth(@MicroPayloadVar("enabled") boolean enableTwoStep, @MicroPayloadVar("code") String code);

}
