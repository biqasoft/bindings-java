
package com.biqasoft.microservice.common.dto.core;

import com.biqasoft.microservice.common.dto.core.objects.CustomFieldDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "This is the base class for ALL biqa objects", discriminator = "so, all base objects extends this class and have properties of this class")
public abstract class BaseClassDto {

    @Id
    @ApiModelProperty("Global object ID")
    protected String id = null;

    @ApiModelProperty("User-friendly name")
    protected String name;

    @ApiModelProperty("System alias for this object. You can access object via id or via alias. Unique")
    protected String alias;

    /**
     * used for optimistic lock BiqaObjectFilterService#updateToDBDefaultBiqa
     */
    @ApiModelProperty(notes = "this is version of object. Every time you update object it will increment(+1)")
    protected int version = 0;

    @ApiModelProperty(notes = "who (user) and when created this object")
    protected CreatedInfoDto createdInfo = new CreatedInfoDto();

    @ApiModelProperty(notes = "this image of object. It can be avatar, thumbnail or smth else; For example `http://site.com/avatar.jpg`")
    protected String avatarUrl = null;

    @ApiModelProperty(notes = "is is archived", value = "by default it is false. Archived objects are showed only with flag 'showArchived=true'")
    protected boolean archived = false;


// task: https://trello.com/c/40GJ529k/263--
//    /**
//     * May be use User-friendly tags to more easily find ???
//     */
//    @ApiModelProperty("Array of IDs of tags")
//    @Indexed
//    protected List<String> tags = new ArrayList<>();

    @ApiModelProperty(notes = "just some user-friendly notes about document")
    protected String description;

    @ApiModelProperty(notes = "Custom fields")
    protected List<CustomFieldDto> customFields = new ArrayList<>();

    @ApiModelProperty(notes = "Only admin can modify or delete secured objects. Used to protect system objects")
    protected boolean secured = false;

// task: https://trello.com/c/tZJmXja5/69-document-level-access-by-userid-group
//    protected ReadEditDeleteRules readModifyDeleteRules = new ReadEditDeleteRules();

// task: https://trello.com/c/skwKtKwP/237-location
//    @ApiModelProperty(notes = "this is location under domain", value = "used to structure firms with regions etc and control access and permissions for large company")
//    @Indexed
//    protected String dlocation;

    public boolean isSecured() {
        return secured;
    }

    public void setSecured(boolean secured) {
        this.secured = secured;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public List<CustomFieldDto> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomFieldDto> customFields) {
        this.customFields = customFields;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public CreatedInfoDto getCreatedInfo() {
        return createdInfo;
    }

    public void setCreatedInfo(CreatedInfoDto createdInfo) {
        this.createdInfo = createdInfo;
    }

}
