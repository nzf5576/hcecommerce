package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Money;
import io.swagger.model.Quantity;
import io.swagger.model.ShippingOption;

/**
 * An accessory that a customer orders either to enhance checks, or as a cross sell item. The price of the accessory is for example 20.00 USD, for a quantity of 120 Checks. 
 */
@ApiModel(description = "An accessory that a customer orders either to enhance checks, or as a cross sell item. The price of the accessory is for example 20.00 USD, for a quantity of 120 Checks. ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class Accessory   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("price")
  private Money price = null;

  @JsonProperty("quantity")
  private Quantity quantity = null;

  @JsonProperty("monogram")
  private String monogram = null;

  @JsonProperty("preselected")
  private Boolean preselected = null;

  @JsonProperty("shippingOption")
  private ShippingOption shippingOption = null;

  @JsonProperty("removable")
  private Boolean removable = null;

  public Accessory name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the accessory.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the accessory.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Accessory code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The product code of the accessory.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The product code of the accessory.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Accessory url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A URL to an image representing the accessory.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "A URL to an image representing the accessory.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Accessory type(String type) {
    this.type = type;
    return this;
  }

   /**
   * A code that describes the type of the product.
   * @return type
  **/
  @ApiModelProperty(value = "A code that describes the type of the product.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Accessory price(Money price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(required = true, value = "")
  public Money getPrice() {
    return price;
  }

  public void setPrice(Money price) {
    this.price = price;
  }

  public Accessory quantity(Quantity quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "")
  public Quantity getQuantity() {
    return quantity;
  }

  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  public Accessory monogram(String monogram) {
    this.monogram = monogram;
    return this;
  }

   /**
   * Get monogram
   * @return monogram
  **/
  @ApiModelProperty(value = "")
  public String getMonogram() {
    return monogram;
  }

  public void setMonogram(String monogram) {
    this.monogram = monogram;
  }

  public Accessory preselected(Boolean preselected) {
    this.preselected = preselected;
    return this;
  }

   /**
   * Is true if the accessory (fraudArmor) should be preselected.
   * @return preselected
  **/
  @ApiModelProperty(value = "Is true if the accessory (fraudArmor) should be preselected.")
  public Boolean getPreselected() {
    return preselected;
  }

  public void setPreselected(Boolean preselected) {
    this.preselected = preselected;
  }

  public Accessory shippingOption(ShippingOption shippingOption) {
    this.shippingOption = shippingOption;
    return this;
  }

   /**
   * Get shippingOption
   * @return shippingOption
  **/
  @ApiModelProperty(value = "")
  public ShippingOption getShippingOption() {
    return shippingOption;
  }

  public void setShippingOption(ShippingOption shippingOption) {
    this.shippingOption = shippingOption;
  }

  public Accessory removable(Boolean removable) {
    this.removable = removable;
    return this;
  }

   /**
   * Boolean that determines whether this accessory may be removed.
   * @return removable
  **/
  @ApiModelProperty(value = "Boolean that determines whether this accessory may be removed.")
  public Boolean getRemovable() {
    return removable;
  }

  public void setRemovable(Boolean removable) {
    this.removable = removable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Accessory accessory = (Accessory) o;
    return Objects.equals(this.name, accessory.name) &&
        Objects.equals(this.code, accessory.code) &&
        Objects.equals(this.url, accessory.url) &&
        Objects.equals(this.type, accessory.type) &&
        Objects.equals(this.price, accessory.price) &&
        Objects.equals(this.quantity, accessory.quantity) &&
        Objects.equals(this.monogram, accessory.monogram) &&
        Objects.equals(this.preselected, accessory.preselected) &&
        Objects.equals(this.shippingOption, accessory.shippingOption) &&
        Objects.equals(this.removable, accessory.removable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, url, type, price, quantity, monogram, preselected, shippingOption, removable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Accessory {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    monogram: ").append(toIndentedString(monogram)).append("\n");
    sb.append("    preselected: ").append(toIndentedString(preselected)).append("\n");
    sb.append("    shippingOption: ").append(toIndentedString(shippingOption)).append("\n");
    sb.append("    removable: ").append(toIndentedString(removable)).append("\n");
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

