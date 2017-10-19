package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;

/**
 * &#39;An identifier used to identify a product e.g. checks, accessory. It identifies the product including its binding, etc. Synonyms are stockkeeping unit (SKU), and product code.&#39; 
 */
@ApiModel(description = "'An identifier used to identify a product e.g. checks, accessory. It identifies the product including its binding, etc. Synonyms are stockkeeping unit (SKU), and product code.' ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class ProductId   {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductId {\n");
    
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

