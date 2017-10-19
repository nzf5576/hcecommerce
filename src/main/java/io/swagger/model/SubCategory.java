package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SubCategory;
import java.util.ArrayList;
import java.util.List;

/**
 * A sub-category used to group accent symbols and OneLiners.
 */
@ApiModel(description = "A sub-category used to group accent symbols and OneLiners.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class SubCategory   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("subCategories")
  private List<SubCategory> subCategories = new ArrayList<SubCategory>();

  public SubCategory code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The code associated with the category.
   * @return code
  **/
  @ApiModelProperty(value = "The code associated with the category.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SubCategory name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the category.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the category.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubCategory subCategories(List<SubCategory> subCategories) {
    this.subCategories = subCategories;
    return this;
  }

  public SubCategory addSubCategoriesItem(SubCategory subCategoriesItem) {
    this.subCategories.add(subCategoriesItem);
    return this;
  }

   /**
   * This will be a SubCategory Object.
   * @return subCategories
  **/
  @ApiModelProperty(value = "This will be a SubCategory Object.")
  public List<SubCategory> getSubCategories() {
    return subCategories;
  }

  public void setSubCategories(List<SubCategory> subCategories) {
    this.subCategories = subCategories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubCategory subCategory = (SubCategory) o;
    return Objects.equals(this.code, subCategory.code) &&
        Objects.equals(this.name, subCategory.name) &&
        Objects.equals(this.subCategories, subCategory.subCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, subCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubCategory {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subCategories: ").append(toIndentedString(subCategories)).append("\n");
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

