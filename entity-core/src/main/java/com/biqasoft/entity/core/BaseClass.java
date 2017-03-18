
package com.biqasoft.entity.core;

import com.biqasoft.entity.annotations.BiqaDontOverrideField;
import com.biqasoft.entity.core.objects.CustomField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bson.types.ObjectId;
import org.javers.core.metamodel.annotation.DiffIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "This is the base class for ALL biqa objects", discriminator = "so, all base objects extends this class and have properties of this class")
@Document
public abstract class BaseClass implements Serializable {

    @Id
    @ApiModelProperty("Global object ID")
    protected String id = null;

    @ApiModelProperty("User-friendly name")
    @TextIndexed(weight = 5)
    protected String name;

    @ApiModelProperty("System alias for this object. You can access object via id or via alias. Unique")
    @Indexed(dropDups = true, unique = true, sparse = true, name = "alias")
    protected String alias;

    /**
     * used for optimistic lock BiqaObjectFilterService#updateToDBDefaultBiqa
     */
    @DiffIgnore
    @ApiModelProperty(notes = "this is version of object. Every time you update object it will increment(+1)")
    protected int version = 0;

    @ApiModelProperty(notes = "who (user) and when created this object")
    @Indexed
    @BiqaDontOverrideField
    protected CreatedInfo createdInfo = new CreatedInfo();

    @ApiModelProperty(notes = "this image of object. It can be avatar, thumbnail or smth else; For example `http://site.com/avatar.jpg`")
    protected String avatarUrl = null;

    @ApiModelProperty(notes = "is is archived", value = "by default it is false. Archived objects are showed only with flag 'showArchived=true'")
    @Indexed
    protected boolean archived = false;


// task: https://trello.com/c/40GJ529k/263--
//    /**
//     * May be use User-friendly tags to more easily find ???
//     */
//    @ApiModelProperty("Array of IDs of tags")
//    @Indexed
//    protected List<String> tags = new ArrayList<>();

    @ApiModelProperty(notes = "just some user-friendly notes about document")
    @TextIndexed(weight = 4)
    protected String description;

    @ApiModelProperty(notes = "Custom fields")
    protected List<CustomField> customFields = new ArrayList<>();

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

    public List<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomField> customFields) {
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

    /**
     * Sometimes when we create object we want to know which id in database it will have
     * for example
     * Customer customer = new Customer();
     * Task task = new Task();
     * task.setConnectedCustomer = customer.getId()
     *
     * but we do not want to create new objectId(to save memory) when create object for deserialize
     *
     * @return object id
     */
    public String getId() {
        if (this.id !=null){
            return id;
        }

        this.id = new ObjectId().toString();
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

    public CreatedInfo getCreatedInfo() {
        return createdInfo;
    }

    public void setCreatedInfo(CreatedInfo createdInfo) {
        this.createdInfo = createdInfo;
    }

}
