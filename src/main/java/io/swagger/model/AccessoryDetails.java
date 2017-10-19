package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PricingOption;
import java.util.ArrayList;
import java.util.List;

/**
 * Details about an accessory that a customer may order either to enhance checks, or as a cross sell item. It includes available quantities.
 */
@ApiModel(description = "Details about an accessory that a customer may order either to enhance checks, or as a cross sell item. It includes available quantities.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class AccessoryDetails   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("pricing")
  private List<PricingOption> pricing = new ArrayList<PricingOption>();

  @JsonProperty("type")
  private String type = null;

  public AccessoryDetails name(String name) {
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

  public AccessoryDetails code(String code) {
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

  public AccessoryDetails url(String url) {
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

  public AccessoryDetails pricing(List<PricingOption> pricing) {
    this.pricing = pricing;
    return this;
  }

  public AccessoryDetails addPricingItem(PricingOption pricingItem) {
    this.pricing.add(pricingItem);
    return this;
  }

   /**
   * Get pricing
   * @return pricing
  **/
  @ApiModelProperty(required = true, value = "")
  public List<PricingOption> getPricing() {
    return pricing;
  }

  public void setPricing(List<PricingOption> pricing) {
    this.pricing = pricing;
  }

  public AccessoryDetails type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the accessory. Only applies to AccentSymbols.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the accessory. Only applies to AccentSymbols.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessoryDetails accessoryDetails = (AccessoryDetails) o;
    return Objects.equals(this.name, accessoryDetails.name) &&
        Objects.equals(this.code, accessoryDetails.code) &&
        Objects.equals(this.url, accessoryDetails.url) &&
        Objects.equals(this.pricing, accessoryDetails.pricing) &&
        Objects.equals(this.type, accessoryDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, url, pricing, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessoryDetails {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

