/*
 * Copyright 2016 the original author or authors.
 */

package com.biqasoft.entity.dto.export.excel;

import com.biqasoft.entity.customer.LeadGenMethod;
import com.biqasoft.entity.customer.LeadGenProject;

import java.util.List;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 *         Date: 7/11/2016
 *         All Rights Reserved
 */

public class ExportLeadGenMethodWithProjects extends ExportV1Base {

    private LeadGenMethod leadGenMethod;
    private List<LeadGenProject> leadGenProjects;

    public LeadGenMethod getLeadGenMethod() {
        return leadGenMethod;
    }

    public void setLeadGenMethod(LeadGenMethod leadGenMethod) {
        this.leadGenMethod = leadGenMethod;
    }

    public List<LeadGenProject> getLeadGenProjects() {
        return leadGenProjects;
    }

    public void setLeadGenProjects(List<LeadGenProject> leadGenProjects) {
        this.leadGenProjects = leadGenProjects;
    }
}
