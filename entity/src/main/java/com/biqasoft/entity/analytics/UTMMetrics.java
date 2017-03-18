/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.analytics;

import org.javers.core.metamodel.annotation.Value;

import java.io.Serializable;

@Value
public class UTMMetrics implements Serializable {

    private UTMAllMetricInfo current;

    public UTMAllMetricInfo getCurrent() {
        return current;
    }

    public void setCurrent(UTMAllMetricInfo current) {
        this.current = current;
    }
}
