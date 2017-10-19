package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Check;

/**
 * A check preview option.
 */
@ApiModel(description = "A check preview option.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class CheckPreviewOptions   {
  @JsonProperty("overlay")
  private Boolean overlay = null;

  @JsonProperty("check")
  private Check check = null;

  public CheckPreviewOptions overlay(Boolean overlay) {
    this.overlay = overlay;
    return this;
  }

   /**
   * A flag to return the overlay only, which includes everything but the background check image.
   * @return overlay
  **/
  @ApiModelProperty(value = "A flag to return the overlay only, which includes everything but the background check image.")
  public Boolean getOverlay() {
    return overlay;
  }

  public void setOverlay(Boolean overlay) {
    this.overlay = overlay;
  }

  public CheckPreviewOptions check(Check check) {
    this.check = check;
    return this;
  }

   /**
   * Get check
   * @return check
  **/
  @ApiModelProperty(value = "")
  public Check getCheck() {
    return check;
  }

  public void setCheck(Check check) {
    this.check = check;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckPreviewOptions checkPreviewOptions = (CheckPreviewOptions) o;
    return Objects.equals(this.overlay, checkPreviewOptions.overlay) &&
        Objects.equals(this.check, checkPreviewOptions.check);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overlay, check);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckPreviewOptions {\n");
    
    sb.append("    overlay: ").append(toIndentedString(overlay)).append("\n");
    sb.append("    check: ").append(toIndentedString(check)).append("\n");
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

