/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by ya_000 on 4/12/2015.
 * When we update some file through API
 * And we don't want to update some fields
 * for example, createdInfo (date, user...)
 *
 * Used primary by {@link com.biqasoft.common.system.BiqaObjectFilterService#getAllFields}
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface BiqaDontOverrideField {


}
