package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Accessory;
import io.swagger.model.Money;
import io.swagger.model.Personalization;
import io.swagger.model.Quantity;
import io.swagger.model.ShippingOption;

/**
 * A check product including the personalization etc.
 */
@ApiModel(description = "A check product including the personalization etc.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class Check   {
  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("startAt")
  private Integer startAt = null;

  @JsonProperty("overSignature")
  private String overSignature = null;

  @JsonProperty("personalization")
  private Personalization personalization = null;

  @JsonProperty("accent")
  private Accessory accent = null;

  @JsonProperty("font")
  private Accessory font = null;

  @JsonProperty("oneLiner")
  private Accessory oneLiner = null;

  @JsonProperty("background")
  private Accessory background = null;

  @JsonProperty("apron")
  private Accessory apron = null;

  @JsonProperty("fraudArmor")
  private Accessory fraudArmor = null;

  @JsonProperty("quantity")
  private Quantity quantity = null;

  @JsonProperty("price")
  private Money price = null;

  @JsonProperty("shippingOption")
  private ShippingOption shippingOption = null;

  public Check productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * The identifier of the check product in the product catalog.
   * @return productId
  **/
  @ApiModelProperty(required = true, value = "The identifier of the check product in the product catalog.")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public Check startAt(Integer startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * The starting number i.e. check number of the 1st check.
   * minimum: 100.0
   * maximum: 9999
   * @return startAt
  **/
  @ApiModelProperty(value = "The starting number i.e. check number of the 1st check.")
  public Integer getStartAt() {
    return startAt;
  }

  public void setStartAt(Integer startAt) {
    this.startAt = startAt;
  }

  public Check overSignature(String overSignature) {
    this.overSignature = overSignature;
    return this;
  }

   /**
   * Text placed over the signature line on checks.
   * @return overSignature
  **/
  @ApiModelProperty(value = "Text placed over the signature line on checks.")
  public String getOverSignature() {
    return overSignature;
  }

  public void setOverSignature(String overSignature) {
    this.overSignature = overSignature;
  }

  public Check personalization(Personalization personalization) {
    this.personalization = personalization;
    return this;
  }

   /**
   * Get personalization
   * @return personalization
  **/
  @ApiModelProperty(required = true, value = "")
  public Personalization getPersonalization() {
    return personalization;
  }

  public void setPersonalization(Personalization personalization) {
    this.personalization = personalization;
  }

  public Check accent(Accessory accent) {
    this.accent = accent;
    return this;
  }

   /**
   * Get accent
   * @return accent
  **/
  @ApiModelProperty(value = "")
  public Accessory getAccent() {
    return accent;
  }

  public void setAccent(Accessory accent) {
    this.accent = accent;
  }

  public Check font(Accessory font) {
    this.font = font;
    return this;
  }

   /**
   * Get font
   * @return font
  **/
  @ApiModelProperty(value = "")
  public Accessory getFont() {
    return font;
  }

  public void setFont(Accessory font) {
    this.font = font;
  }

  public Check oneLiner(Accessory oneLiner) {
    this.oneLiner = oneLiner;
    return this;
  }

   /**
   * Get oneLiner
   * @return oneLiner
  **/
  @ApiModelProperty(value = "")
  public Accessory getOneLiner() {
    return oneLiner;
  }

  public void setOneLiner(Accessory oneLiner) {
    this.oneLiner = oneLiner;
  }

  public Check background(Accessory background) {
    this.background = background;
    return this;
  }

   /**
   * Get background
   * @return background
  **/
  @ApiModelProperty(value = "")
  public Accessory getBackground() {
    return background;
  }

  public void setBackground(Accessory background) {
    this.background = background;
  }

  public Check apron(Accessory apron) {
    this.apron = apron;
    return this;
  }

   /**
   * Get apron
   * @return apron
  **/
  @ApiModelProperty(value = "")
  public Accessory getApron() {
    return apron;
  }

  public void setApron(Accessory apron) {
    this.apron = apron;
  }

  public Check fraudArmor(Accessory fraudArmor) {
    this.fraudArmor = fraudArmor;
    return this;
  }

   /**
   * Get fraudArmor
   * @return fraudArmor
  **/
  @ApiModelProperty(value = "")
  public Accessory getFraudArmor() {
    return fraudArmor;
  }

  public void setFraudArmor(Accessory fraudArmor) {
    this.fraudArmor = fraudArmor;
  }

  public Check quantity(Quantity quantity) {
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

  public Check price(Money price) {
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

  public Check shippingOption(ShippingOption shippingOption) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Check check = (Check) o;
    return Objects.equals(this.productId, check.productId) &&
        Objects.equals(this.startAt, check.startAt) &&
        Objects.equals(this.overSignature, check.overSignature) &&
        Objects.equals(this.personalization, check.personalization) &&
        Objects.equals(this.accent, check.accent) &&
        Objects.equals(this.font, check.font) &&
        Objects.equals(this.oneLiner, check.oneLiner) &&
        Objects.equals(this.background, check.background) &&
        Objects.equals(this.apron, check.apron) &&
        Objects.equals(this.fraudArmor, check.fraudArmor) &&
        Objects.equals(this.quantity, check.quantity) &&
        Objects.equals(this.price, check.price) &&
        Objects.equals(this.shippingOption, check.shippingOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, startAt, overSignature, personalization, accent, font, oneLiner, background, apron, fraudArmor, quantity, price, shippingOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Check {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    overSignature: ").append(toIndentedString(overSignature)).append("\n");
    sb.append("    personalization: ").append(toIndentedString(personalization)).append("\n");
    sb.append("    accent: ").append(toIndentedString(accent)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    oneLiner: ").append(toIndentedString(oneLiner)).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    apron: ").append(toIndentedString(apron)).append("\n");
    sb.append("    fraudArmor: ").append(toIndentedString(fraudArmor)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    shippingOption: ").append(toIndentedString(shippingOption)).append("\n");
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

