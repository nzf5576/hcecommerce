package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A set of telephone numbers.
 */
@ApiModel(description = "A set of telephone numbers.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class Telephone   {
  @JsonProperty("home")
  private String home = null;

  @JsonProperty("business")
  private String business = null;

  public Telephone home(String home) {
    this.home = home;
    return this;
  }

   /**
   * Home telephone number
   * @return home
  **/
  @ApiModelProperty(value = "Home telephone number")
  public String getHome() {
    return home;
  }

  public void setHome(String home) {
    this.home = home;
  }

  public Telephone business(String business) {
    this.business = business;
    return this;
  }

   /**
   * Business telephone number
   * @return business
  **/
  @ApiModelProperty(value = "Business telephone number")
  public String getBusiness() {
    return business;
  }

  public void setBusiness(String business) {
    this.business = business;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Telephone telephone = (Telephone) o;
    return Objects.equals(this.home, telephone.home) &&
        Objects.equals(this.business, telephone.business);
  }

  @Override
  public int hashCode() {
    return Objects.hash(home, business);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Telephone {\n");
    
    sb.append("    home: ").append(toIndentedString(home)).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
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

