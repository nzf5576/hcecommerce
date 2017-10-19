package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A style of check product witha a binding.
 */
@ApiModel(description = "A style of check product witha a binding.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class CheckStyle   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("binding")
  private String binding = null;

  public CheckStyle title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title for the style of check.
   * @return title
  **/
  @ApiModelProperty(value = "Title for the style of check.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CheckStyle productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * The productId of that contains the style.
   * @return productId
  **/
  @ApiModelProperty(value = "The productId of that contains the style.")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public CheckStyle binding(String binding) {
    this.binding = binding;
    return this;
  }

   /**
   * The style of binding used on the checks e.g. duplicate.
   * @return binding
  **/
  @ApiModelProperty(value = "The style of binding used on the checks e.g. duplicate.")
  public String getBinding() {
    return binding;
  }

  public void setBinding(String binding) {
    this.binding = binding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckStyle checkStyle = (CheckStyle) o;
    return Objects.equals(this.title, checkStyle.title) &&
        Objects.equals(this.productId, checkStyle.productId) &&
        Objects.equals(this.binding, checkStyle.binding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, productId, binding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckStyle {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    binding: ").append(toIndentedString(binding)).append("\n");
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

