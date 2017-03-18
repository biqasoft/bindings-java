/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * this annotation is used by BeforeObjectAdd.class checking in Aspects
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BiqaAddObject {

    /**
     * when we create new object that extend {@link BaseClass}
     * we can replace/add custom field {@link com.biqasoft.entity.objects.CustomField}
     * of this object with fields that we have default for this object, stored in {@link DomainSettings}
     *
     * BE CAREFULLY
     * if you want create new BeforeObjectAdd object with custom fields,
     * which is difference from default fields from this class,
     * you must set forceAddCustomField = false
     * otherwise your fields will be replaces by default automatically by aspect
     * @return true if add default custom fields or false to skip adding custom fields
     */
    boolean forceAddCustomField() default true;

}
