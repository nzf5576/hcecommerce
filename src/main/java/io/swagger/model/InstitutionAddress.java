package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InstitutionAddress
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class InstitutionAddress   {
  @JsonProperty("address1")
  private String address1 = null;

  @JsonProperty("address2")
  private String address2 = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("zip")
  private String zip = null;

  public InstitutionAddress address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Address line 1 of the address.
   * @return address1
  **/
  @ApiModelProperty(value = "Address line 1 of the address.")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public InstitutionAddress address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Address line 2 of the address.
   * @return address2
  **/
  @ApiModelProperty(value = "Address line 2 of the address.")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public InstitutionAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City of the address.
   * @return city
  **/
  @ApiModelProperty(value = "City of the address.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public InstitutionAddress state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State of the address.
   * @return state
  **/
  @ApiModelProperty(value = "State of the address.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public InstitutionAddress zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Zip code of the address.
   * @return zip
  **/
  @ApiModelProperty(value = "Zip code of the address.")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionAddress institutionAddress = (InstitutionAddress) o;
    return Objects.equals(this.address1, institutionAddress.address1) &&
        Objects.equals(this.address2, institutionAddress.address2) &&
        Objects.equals(this.city, institutionAddress.city) &&
        Objects.equals(this.state, institutionAddress.state) &&
        Objects.equals(this.zip, institutionAddress.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, state, zip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionAddress {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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

