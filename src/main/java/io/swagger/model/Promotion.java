package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A promotion that results in a discounted price.
 */
@ApiModel(description = "A promotion that results in a discounted price.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class Promotion   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("text")
  private String text = null;

  public Promotion code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The promotion code.
   * @return code
  **/
  @ApiModelProperty(value = "The promotion code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Promotion text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The description corressponding to a promotion code
   * @return text
  **/
  @ApiModelProperty(value = "The description corressponding to a promotion code")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Promotion promotion = (Promotion) o;
    return Objects.equals(this.code, promotion.code) &&
        Objects.equals(this.text, promotion.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Promotion {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

