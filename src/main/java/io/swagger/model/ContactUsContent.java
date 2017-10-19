package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Content for contact us link.
 */
@ApiModel(description = "Content for contact us link.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class ContactUsContent   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("modal")
  private String modal = null;

  public ContactUsContent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The text of the modal.
   * @return description
  **/
  @ApiModelProperty(value = "The text of the modal.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ContactUsContent title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the modal.
   * @return title
  **/
  @ApiModelProperty(value = "The title of the modal.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ContactUsContent modal(String modal) {
    this.modal = modal;
    return this;
  }

   /**
   * The modal to be shown.
   * @return modal
  **/
  @ApiModelProperty(value = "The modal to be shown.")
  public String getModal() {
    return modal;
  }

  public void setModal(String modal) {
    this.modal = modal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactUsContent contactUsContent = (ContactUsContent) o;
    return Objects.equals(this.description, contactUsContent.description) &&
        Objects.equals(this.title, contactUsContent.title) &&
        Objects.equals(this.modal, contactUsContent.modal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, title, modal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactUsContent {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    modal: ").append(toIndentedString(modal)).append("\n");
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

