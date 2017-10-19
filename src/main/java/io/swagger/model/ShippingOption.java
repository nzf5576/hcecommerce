package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Money;
import org.joda.time.LocalDate;

/**
 * A delivery option.
 */
@ApiModel(description = "A delivery option.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class ShippingOption   {
  @JsonProperty("bundled")
  private Boolean bundled = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("estimatedDelivery")
  private LocalDate estimatedDelivery = null;

  @JsonProperty("fee")
  private Money fee = null;

  public ShippingOption bundled(Boolean bundled) {
    this.bundled = bundled;
    return this;
  }

   /**
   * Is true if this item is bundled for shipping.
   * @return bundled
  **/
  @ApiModelProperty(value = "Is true if this item is bundled for shipping.")
  public Boolean getBundled() {
    return bundled;
  }

  public void setBundled(Boolean bundled) {
    this.bundled = bundled;
  }

  public ShippingOption code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The shipping code e.g. 'G'
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The shipping code e.g. 'G'")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ShippingOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the shipping option e.g. \"UPS Next Day Air\"
   * @return name
  **/
  @ApiModelProperty(value = "Name of the shipping option e.g. \"UPS Next Day Air\"")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShippingOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the shipping option e.g. \"1 Business Day\"
   * @return description
  **/
  @ApiModelProperty(value = "Description of the shipping option e.g. \"1 Business Day\"")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ShippingOption note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Additional descriptive text (for emphasis) e.g. \"Recommended\"
   * @return note
  **/
  @ApiModelProperty(value = "Additional descriptive text (for emphasis) e.g. \"Recommended\"")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public ShippingOption estimatedDelivery(LocalDate estimatedDelivery) {
    this.estimatedDelivery = estimatedDelivery;
    return this;
  }

   /**
   * The estimated date of delivery. ISO 8601 date e.g. '11-21-2016'.
   * @return estimatedDelivery
  **/
  @ApiModelProperty(value = "The estimated date of delivery. ISO 8601 date e.g. '11-21-2016'.")
  public LocalDate getEstimatedDelivery() {
    return estimatedDelivery;
  }

  public void setEstimatedDelivery(LocalDate estimatedDelivery) {
    this.estimatedDelivery = estimatedDelivery;
  }

  public ShippingOption fee(Money fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(value = "")
  public Money getFee() {
    return fee;
  }

  public void setFee(Money fee) {
    this.fee = fee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingOption shippingOption = (ShippingOption) o;
    return Objects.equals(this.bundled, shippingOption.bundled) &&
        Objects.equals(this.code, shippingOption.code) &&
        Objects.equals(this.name, shippingOption.name) &&
        Objects.equals(this.description, shippingOption.description) &&
        Objects.equals(this.note, shippingOption.note) &&
        Objects.equals(this.estimatedDelivery, shippingOption.estimatedDelivery) &&
        Objects.equals(this.fee, shippingOption.fee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundled, code, name, description, note, estimatedDelivery, fee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingOption {\n");
    
    sb.append("    bundled: ").append(toIndentedString(bundled)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    estimatedDelivery: ").append(toIndentedString(estimatedDelivery)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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

