/*
 * Copyright (c) 2016. com.biqasoft
 */

package com.biqasoft.auth.exception.auth;

import com.biqasoft.common.watchablevalue.WatchableValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 6/9/2016
 *         All Rights Reserved
 */
@Component
public class ThrowAuthExceptionHelper {

    private final static Logger logger = LoggerFactory.getLogger(ThrowAuthExceptionHelper.class);
    private static Settings printExceptionStrategy = Settings.DO_NOT_PRINT;

    /**
     * Catched by {@link com.biqasoft.gateway.configs.exceptionhandler.MyExceptionHandler}
     *
     * @param messageId id of i18n property in resource folder
     */
    public static void throwExceptionBiqaAuthenticationLocalizedException(String messageId) throws BiqaAuthenticationLocalizedException {
        throw new BiqaAuthenticationLocalizedException(messageId);
    }

    @Autowired
    public void setSettings(@Value("${biqa.internal.exception.strategy:DO_NOT_PRINT}") String param) {
        switch (param) {
            case "DO_NOT_PRINT":
                printExceptionStrategy = Settings.DO_NOT_PRINT;
                break;
//            case "PRINT_WITH_LOCAL_VARS":
//                printExceptionStrategy = Settings.PRINT_WITH_LOCAL_VARS;
//                break;
            case "PRINT_STACKTRACE":
                printExceptionStrategy = Settings.PRINT_STACKTRACE;
                break;
        }
    }

    @WatchableValue("biqa.internal.exception.strategy")
    public void onApplicationEvent(String newValue) {
        setSettings(newValue);
    }
}

enum Settings {
    //    PRINT_WITH_LOCAL_VARS, //java 9
    DO_NOT_PRINT,
    PRINT_STACKTRACE,
}