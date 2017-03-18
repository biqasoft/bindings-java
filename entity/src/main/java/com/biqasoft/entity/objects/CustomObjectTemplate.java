/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.objects;

import com.biqasoft.entity.core.objects.CustomObject;
import io.swagger.annotations.ApiModel;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nikita Bakaev, ya@nbakaev.ru
 * Date: 12/4/2015
 * All Rights Reserved
 */
@ApiModel("Object representing template for construct new custom objects")
@Document
public class CustomObjectTemplate extends CustomObject {

    private List<CustomObjectPrintableTemplate> printableTemplates = new ArrayList<>();


    public List<CustomObjectPrintableTemplate> getPrintableTemplates() {
        return printableTemplates;
    }

    public void setPrintableTemplates(List<CustomObjectPrintableTemplate> printableTemplates) {
        this.printableTemplates = printableTemplates;
    }
}
