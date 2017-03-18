/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.constants;

/**
 * This constants are hidden from API
 * and cam be security sensitive
 * GET /constants
 */
public final class SYSTEM_CONSTS {
    // hd5 hash - used to compare client version and server if some object
    // all all response to some API call
    public static final String X_biqa_Version_Hash_HEADER = "X-biqa-Version-Hash";
    // is client object equal to server
    // TRUE / FALSE
    public static final String X_biqa_OBJECT_EQUALS_HASH_HEADER = "X-biqa-Object-Equals-Hash";

    // prefix for oauth2 username credentials
    public static final String AUTHENTIFICATION_OAUTH2_USERNAME_PREFIX = "OAUTH2_";

    // this is content type of excel documents
    public static final String EXCEL_MIME_TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

}
