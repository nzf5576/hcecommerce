package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Variables for front-end validation.
 */
@ApiModel(description = "Variables for front-end validation.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class ProductValidation   {
  @JsonProperty("personalizationLinesMaxLength")
  private Integer personalizationLinesMaxLength = null;

  public ProductValidation personalizationLinesMaxLength(Integer personalizationLinesMaxLength) {
    this.personalizationLinesMaxLength = personalizationLinesMaxLength;
    return this;
  }

   /**
   * The max length for the personalization lines in a given product.
   * @return personalizationLinesMaxLength
  **/
  @ApiModelProperty(value = "The max length for the personalization lines in a given product.")
  public Integer getPersonalizationLinesMaxLength() {
    return personalizationLinesMaxLength;
  }

  public void setPersonalizationLinesMaxLength(Integer personalizationLinesMaxLength) {
    this.personalizationLinesMaxLength = personalizationLinesMaxLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductValidation productValidation = (ProductValidation) o;
    return Objects.equals(this.personalizationLinesMaxLength, productValidation.personalizationLinesMaxLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalizationLinesMaxLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductValidation {\n");
    
    sb.append("    personalizationLinesMaxLength: ").append(toIndentedString(personalizationLinesMaxLength)).append("\n");
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

