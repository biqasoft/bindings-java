/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.microservice.common.dto;


import com.biqasoft.microservice.common.dto.core.BaseClassDto;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nikita Bakaev, ya@nbakaev.ru on 5/6/2016.
 * All Rights Reserved
 */
@Data
public class UserAccountGroupDto extends BaseClassDto {

    private List<String> grantedRoles = new ArrayList<>();

    private List<String> userAccountsIDs = new ArrayList<>();

    private boolean enabled = true;

}
