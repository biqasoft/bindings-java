package com.biqasoft.notifications.email;

import com.biqasoft.microservice.communicator.interfaceimpl.annotation.MicroMapping;
import com.biqasoft.microservice.communicator.interfaceimpl.annotation.Microservice;
import org.springframework.http.HttpMethod;

/**
 * Created by Nikita on 9/13/2016.
 */
@Microservice("notification-email-sender")
public interface EmailSenderMicroservice extends EmailSenderProvider {

    @Override
    @MicroMapping(value = "/v1/notification/email/prepared", method = HttpMethod.POST)
    void sendEmail(Email email);
}
