package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccessoryCategory;
import io.swagger.model.AccessoryDetails;
import java.util.ArrayList;
import java.util.List;

/**
 * AccessoryCategory
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class AccessoryCategory   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("groups")
  private List<AccessoryCategory> groups = new ArrayList<AccessoryCategory>();

  @JsonProperty("items")
  private List<AccessoryDetails> items = new ArrayList<AccessoryDetails>();

  public AccessoryCategory name(String name) {
    this.name = name;
    return this;
  }

   /**
   * This is the name of the category.
   * @return name
  **/
  @ApiModelProperty(value = "This is the name of the category.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccessoryCategory code(String code) {
    this.code = code;
    return this;
  }

   /**
   * This is the code of the category.
   * @return code
  **/
  @ApiModelProperty(value = "This is the code of the category.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AccessoryCategory groups(List<AccessoryCategory> groups) {
    this.groups = groups;
    return this;
  }

  public AccessoryCategory addGroupsItem(AccessoryCategory groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * A set of AccessoryCategory, if this category has sub-categories.
   * @return groups
  **/
  @ApiModelProperty(value = "A set of AccessoryCategory, if this category has sub-categories.")
  public List<AccessoryCategory> getGroups() {
    return groups;
  }

  public void setGroups(List<AccessoryCategory> groups) {
    this.groups = groups;
  }

  public AccessoryCategory items(List<AccessoryDetails> items) {
    this.items = items;
    return this;
  }

  public AccessoryCategory addItemsItem(AccessoryDetails itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A set of AccessoryDetails, if this category has accessories (accents or oneliners)
   * @return items
  **/
  @ApiModelProperty(value = "A set of AccessoryDetails, if this category has accessories (accents or oneliners)")
  public List<AccessoryDetails> getItems() {
    return items;
  }

  public void setItems(List<AccessoryDetails> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessoryCategory accessoryCategory = (AccessoryCategory) o;
    return Objects.equals(this.name, accessoryCategory.name) &&
        Objects.equals(this.code, accessoryCategory.code) &&
        Objects.equals(this.groups, accessoryCategory.groups) &&
        Objects.equals(this.items, accessoryCategory.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, groups, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessoryCategory {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

