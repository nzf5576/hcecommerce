package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InstitutionLink
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class InstitutionLink   {
  @JsonProperty("link")
  private String link = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("url")
  private String url = null;

  public InstitutionLink link(String link) {
    this.link = link;
    return this;
  }

   /**
   * The hardcoded link name. e.g. 'logout', 'onlinebanking' and 'survey'
   * @return link
  **/
  @ApiModelProperty(value = "The hardcoded link name. e.g. 'logout', 'onlinebanking' and 'survey'")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public InstitutionLink label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label to display on the UI. If none is given then the UI will use the default.
   * @return label
  **/
  @ApiModelProperty(value = "The label to display on the UI. If none is given then the UI will use the default.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public InstitutionLink url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL to use with this link. If none is given then the UI will use the default.
   * @return url
  **/
  @ApiModelProperty(value = "The URL to use with this link. If none is given then the UI will use the default.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionLink institutionLink = (InstitutionLink) o;
    return Objects.equals(this.link, institutionLink.link) &&
        Objects.equals(this.label, institutionLink.label) &&
        Objects.equals(this.url, institutionLink.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, label, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionLink {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

