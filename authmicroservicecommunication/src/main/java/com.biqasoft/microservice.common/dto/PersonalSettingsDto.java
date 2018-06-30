/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.microservice.common.dto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Nikita Bakaev, ya@nbakaev.ru on 5/26/2016.
 * All Rights Reserved
 */
@Data
public class PersonalSettingsDto {

    private String dateFormat;
    private SettingsColor colors = new SettingsColor();

    // TODO: move to some JSON mongodb blob to prevent additional object allocation; merge with data field
    private SettingsUI ui = new SettingsUI();

    @ApiModelProperty("Any data that browser or client want to store, such as some settings etc")
    private String data;

    /**
     * Created by Nikita Bakaev, ya@nbakaev.ru on 5/26/2016.
     * All Rights Reserved
     */
    @Data
    public static class SettingsColor {

        private boolean enable;
        private String mainColor;
    }

    /**
     * Created by Nikita Bakaev, ya@nbakaev.ru on 5/26/2016.
     * All Rights Reserved
     */
    @Data
    public static class SettingsTableUi {

        private boolean modern = true;

    }

    /**
     * Created by Nikita Bakaev, ya@nbakaev.ru on 5/26/2016.
     * All Rights Reserved
     */
    @Data
    public static class SettingsUI {

        private SettingsTableUi table = new SettingsTableUi();
        private boolean modernCustomFields = true;
    }
}
