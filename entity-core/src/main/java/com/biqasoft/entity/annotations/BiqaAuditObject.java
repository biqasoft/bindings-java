/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Add no method, that have {@link BaseClass} in param to get change in history with Javers
 *
 * @author Nikita Bakaev, ya@nbakaev.ru
 * Date: 4/12/2015
 * All Rights Reserved
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BiqaAuditObject {

}
