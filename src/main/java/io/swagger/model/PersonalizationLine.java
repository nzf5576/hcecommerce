package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This is a line of formatted text that makes up the personalization.
 */
@ApiModel(description = "This is a line of formatted text that makes up the personalization.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class PersonalizationLine   {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("isBold")
  private Boolean isBold = null;

  public PersonalizationLine text(String text) {
    this.text = text;
    return this;
  }

   /**
   * This is plain unformatted text.
   * @return text
  **/
  @ApiModelProperty(required = true, value = "This is plain unformatted text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public PersonalizationLine isBold(Boolean isBold) {
    this.isBold = isBold;
    return this;
  }

   /**
   * Set this to true if the text is in boldface.
   * @return isBold
  **/
  @ApiModelProperty(required = true, value = "Set this to true if the text is in boldface.")
  public Boolean getIsBold() {
    return isBold;
  }

  public void setIsBold(Boolean isBold) {
    this.isBold = isBold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalizationLine personalizationLine = (PersonalizationLine) o;
    return Objects.equals(this.text, personalizationLine.text) &&
        Objects.equals(this.isBold, personalizationLine.isBold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, isBold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalizationLine {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    isBold: ").append(toIndentedString(isBold)).append("\n");
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

