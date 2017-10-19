package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An address, usually the customer&#39;s delivery address.
 */
@ApiModel(description = "An address, usually the customer's delivery address.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class Address   {
  @JsonProperty("shipTo")
  private String shipTo = null;

  @JsonProperty("careOf")
  private String careOf = null;

  @JsonProperty("address3")
  private String address3 = null;

  @JsonProperty("address4")
  private String address4 = null;

  @JsonProperty("address5")
  private String address5 = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("isForeign")
  private Boolean isForeign = null;

  public Address shipTo(String shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Name for the person accepting delivery.
   * @return shipTo
  **/
  @ApiModelProperty(required = true, value = "Name for the person accepting delivery.")
  public String getShipTo() {
    return shipTo;
  }

  public void setShipTo(String shipTo) {
    this.shipTo = shipTo;
  }

  public Address careOf(String careOf) {
    this.careOf = careOf;
    return this;
  }

   /**
   * The name of the person whose address is it is.
   * @return careOf
  **/
  @ApiModelProperty(required = true, value = "The name of the person whose address is it is.")
  public String getCareOf() {
    return careOf;
  }

  public void setCareOf(String careOf) {
    this.careOf = careOf;
  }

  public Address address3(String address3) {
    this.address3 = address3;
    return this;
  }

   /**
   * A street address including the street number e.g. 22199 Pleasant Street
   * @return address3
  **/
  @ApiModelProperty(required = true, value = "A street address including the street number e.g. 22199 Pleasant Street")
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public Address address4(String address4) {
    this.address4 = address4;
    return this;
  }

   /**
   * The apartment or suite number if needed e.g. Appt. 11
   * @return address4
  **/
  @ApiModelProperty(required = true, value = "The apartment or suite number if needed e.g. Appt. 11")
  public String getAddress4() {
    return address4;
  }

  public void setAddress4(String address4) {
    this.address4 = address4;
  }

  public Address address5(String address5) {
    this.address5 = address5;
    return this;
  }

   /**
   * This line is used only when the address is known to be foreign.
   * @return address5
  **/
  @ApiModelProperty(value = "This line is used only when the address is known to be foreign.")
  public String getAddress5() {
    return address5;
  }

  public void setAddress5(String address5) {
    this.address5 = address5;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city.
   * @return city
  **/
  @ApiModelProperty(value = "The city.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The 2 digit state abbreviation or 'FPO', 'APO'.
   * @return state
  **/
  @ApiModelProperty(value = "The 2 digit state abbreviation or 'FPO', 'APO'.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * e.g. the 5 digit zip code plus 4 digit extension for US addresses.
   * @return postalCode
  **/
  @ApiModelProperty(value = "e.g. the 5 digit zip code plus 4 digit extension for US addresses.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Address isForeign(Boolean isForeign) {
    this.isForeign = isForeign;
    return this;
  }

   /**
   * Is true if the address is foreign.
   * @return isForeign
  **/
  @ApiModelProperty(value = "Is true if the address is foreign.")
  public Boolean getIsForeign() {
    return isForeign;
  }

  public void setIsForeign(Boolean isForeign) {
    this.isForeign = isForeign;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.shipTo, address.shipTo) &&
        Objects.equals(this.careOf, address.careOf) &&
        Objects.equals(this.address3, address.address3) &&
        Objects.equals(this.address4, address.address4) &&
        Objects.equals(this.address5, address.address5) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.isForeign, address.isForeign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipTo, careOf, address3, address4, address5, city, state, postalCode, isForeign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    careOf: ").append(toIndentedString(careOf)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    address4: ").append(toIndentedString(address4)).append("\n");
    sb.append("    address5: ").append(toIndentedString(address5)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    isForeign: ").append(toIndentedString(isForeign)).append("\n");
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

