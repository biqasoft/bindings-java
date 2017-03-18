/*
* Copyright (c) 2016 biqasoft.com




 */

package com.biqasoft.entity.core;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ApiModel("Base filter & criteria for all BaseClass. All others filters implements it")
public abstract class BaseClassFilter implements Serializable {

    protected boolean useRelativeCreatedDateFrom;
    protected boolean useRelativeCreatedDateTo;

    protected String relativeCreatedDateFrom;
    protected String relativeCreatedDateTo;

    @ApiModelProperty("use objects created with some user account ID ")
    protected boolean useCreatedByUserId;
    @ApiModelProperty("useAccount id if `useCreatedByUserId=true` ")
    protected String createdByUserId;

    @ApiModelProperty(" show only some part of data ")
    protected boolean usePagination;
    @ApiModelProperty("Pagination record from")
    protected int recordFrom;
    @ApiModelProperty("Pagination record to")
    protected int recordTo;

    @ApiModelProperty(" true , if you WANT to receive ONLY some fields in response. Response can be quicker ")
    protected boolean useFieldsPartly = false;
    protected List<String> partlyFields = new ArrayList<>();

    @ApiModelProperty(" true , if you DON'T WANT to receive some fields in response. Response can be quicker ")
    protected boolean useExcludeFieldsPartly = false;
    protected List<String> partlyExcludeFields = new ArrayList<>();

    @ApiModelProperty(" is sort result by some custom field name ")
    protected boolean useCustomSort = false;
    @ApiModelProperty("  sort result by field name such as `firstName` for customer ")
    protected String customSortField;
    @ApiModelProperty(" Reverse sorting results ")
    protected boolean reverseSortDirectionByCustomField;

    @ApiModelProperty("latest created objects to the top ")
    protected boolean sortDESCbyCreatedDate;

    @ApiModelProperty(" if we want to only count resulted diffs - we do it and return result without objects. That's faster than get objects ")
    protected boolean onlyCount = false;

    @ApiModelProperty(" is use search by name (for example first name for customer ) etc ")
    protected boolean useFullTextSearch = false;
    @ApiModelProperty("  text to search in resource data ")
    protected String fullTextSearchRequest;

    @ApiModelProperty("show archived objects. By default - false")
    protected boolean showArchived = false;

    @ApiModelProperty("Use regex `regexBuilderNodes` field ")
    protected boolean useRegex = false;
    @ApiModelProperty("Regex list of patterns")
    protected List<RegexBuilderNode> regexBuilderNodes = new ArrayList<>();

    @ApiModelProperty("include object with some Ids only")
    protected boolean useObjectIds = false;

    @ApiModelProperty("object Ids ")
    protected List<String> objectIds = new ArrayList<>();

    @ApiModelProperty("list of object alias. No get objects with some alias - this should not be empty or null")
    protected List<String> aliases = null;


    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public boolean isUseObjectIds() {
        return useObjectIds;
    }

    public void setUseObjectIds(boolean useObjectIds) {
        this.useObjectIds = useObjectIds;
    }

    public List<String> getObjectIds() {
        return objectIds;
    }

    public void setObjectIds(List<String> objectIds) {
        this.objectIds = objectIds;
    }

    public boolean isUseRegex() {
        return useRegex;
    }

    public void setUseRegex(boolean useRegex) {
        this.useRegex = useRegex;
    }

    public List<RegexBuilderNode> getRegexBuilderNodes() {
        return regexBuilderNodes;
    }

    public void setRegexBuilderNodes(List<RegexBuilderNode> regexBuilderNodes) {
        this.regexBuilderNodes = regexBuilderNodes;
    }

    public boolean isShowArchived() {
        return showArchived;
    }

    public void setShowArchived(boolean showArchived) {
        this.showArchived = showArchived;
    }

    public String getFullTextSearchRequest() {
        return fullTextSearchRequest;
    }

    public void setFullTextSearchRequest(String fullTextSearchRequest) {
        this.fullTextSearchRequest = fullTextSearchRequest;
    }

    public boolean isUseFullTextSearch() {
        return useFullTextSearch;
    }

    public void setUseFullTextSearch(boolean useFullTextSearch) {
        this.useFullTextSearch = useFullTextSearch;
    }

    public boolean isUseExcludeFieldsPartly() {
        return useExcludeFieldsPartly;
    }

    public void setUseExcludeFieldsPartly(boolean useExcludeFieldsPartly) {
        this.useExcludeFieldsPartly = useExcludeFieldsPartly;
    }

    public List<String> getPartlyExcludeFields() {
        return partlyExcludeFields;
    }

    public void setPartlyExcludeFields(List<String> partlyExcludeFields) {
        this.partlyExcludeFields = partlyExcludeFields;
    }

    public boolean isUseFieldsPartly() {
        return useFieldsPartly;
    }

    public void setUseFieldsPartly(boolean useFieldsPartly) {
        this.useFieldsPartly = useFieldsPartly;
    }

    public List<String> getPartlyFields() {
        return partlyFields;
    }

    public void setPartlyFields(List<String> partlyFields) {
        this.partlyFields = partlyFields;
    }

    public boolean isReverseSortDirectionByCustomField() {
        return reverseSortDirectionByCustomField;
    }

    public void setReverseSortDirectionByCustomField(boolean reverseSortDirectionByCustomField) {
        this.reverseSortDirectionByCustomField = reverseSortDirectionByCustomField;
    }

    public boolean isUseCustomSort() {
        return useCustomSort;
    }

    public void setUseCustomSort(boolean useCustomSort) {
        this.useCustomSort = useCustomSort;
    }

    public String getCustomSortField() {
        return customSortField;
    }

    public void setCustomSortField(String customSortField) {
        this.customSortField = customSortField;
    }

    public boolean isOnlyCount() {
        return onlyCount;
    }

    public void setOnlyCount(boolean onlyCount) {
        this.onlyCount = onlyCount;
    }

    public boolean isUsePagination() {
        return usePagination;
    }

    public void setUsePagination(boolean usePagination) {
        this.usePagination = usePagination;
    }

    public int getRecordFrom() {
        return recordFrom;
    }

    public void setRecordFrom(int recordFrom) {
        this.recordFrom = recordFrom;
    }

    public int getRecordTo() {
        return recordTo;
    }

    public void setRecordTo(int recordTo) {
        this.recordTo = recordTo;
    }

    public boolean isSortDESCbyCreatedDate() {
        return sortDESCbyCreatedDate;
    }

    public void setSortDESCbyCreatedDate(boolean sortDESCbyCreatedDate) {
        this.sortDESCbyCreatedDate = sortDESCbyCreatedDate;
    }

    public boolean isUseRelativeCreatedDateFrom() {
        return useRelativeCreatedDateFrom;
    }

    public void setUseRelativeCreatedDateFrom(boolean useRelativeCreatedDateFrom) {
        this.useRelativeCreatedDateFrom = useRelativeCreatedDateFrom;
    }

    public boolean isUseRelativeCreatedDateTo() {
        return useRelativeCreatedDateTo;
    }

    public void setUseRelativeCreatedDateTo(boolean useRelativeCreatedDateTo) {
        this.useRelativeCreatedDateTo = useRelativeCreatedDateTo;
    }

    public String getRelativeCreatedDateFrom() {
        return relativeCreatedDateFrom;
    }

    public void setRelativeCreatedDateFrom(String relativeCreatedDateFrom) {
        this.relativeCreatedDateFrom = relativeCreatedDateFrom;
    }

    public String getRelativeCreatedDateTo() {
        return relativeCreatedDateTo;
    }

    public void setRelativeCreatedDateTo(String relativeCreatedDateTo) {
        this.relativeCreatedDateTo = relativeCreatedDateTo;
    }

    public boolean isUseCreatedByUserId() {
        return useCreatedByUserId;
    }

    public void setUseCreatedByUserId(boolean useCreatedByUserId) {
        this.useCreatedByUserId = useCreatedByUserId;
    }

    public String getCreatedByUserId() {
        return createdByUserId;
    }

    public void setCreatedByUserId(String createdByUserId) {
        this.createdByUserId = createdByUserId;
    }
}
