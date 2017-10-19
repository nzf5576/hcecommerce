package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Accessory;
import io.swagger.model.Check;
import io.swagger.model.OrderId;

/**
 * A single line item in an order. Some platforms may treat it as an order in its own right. An OrderItem is one of check, accessory e.g. register, or upsell e.g. FraudArmor. Only one of the three structures should contain data. The others should be null. 
 */
@ApiModel(description = "A single line item in an order. Some platforms may treat it as an order in its own right. An OrderItem is one of check, accessory e.g. register, or upsell e.g. FraudArmor. Only one of the three structures should contain data. The others should be null. ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class OrderItem   {
  @JsonProperty("id")
  private OrderId id = null;

  @JsonProperty("check")
  private Check check = null;

  @JsonProperty("accessory")
  private Accessory accessory = null;

  @JsonProperty("upsell")
  private Accessory upsell = null;

  public OrderItem id(OrderId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public OrderId getId() {
    return id;
  }

  public void setId(OrderId id) {
    this.id = id;
  }

  public OrderItem check(Check check) {
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

  public OrderItem accessory(Accessory accessory) {
    this.accessory = accessory;
    return this;
  }

   /**
   * Get accessory
   * @return accessory
  **/
  @ApiModelProperty(value = "")
  public Accessory getAccessory() {
    return accessory;
  }

  public void setAccessory(Accessory accessory) {
    this.accessory = accessory;
  }

  public OrderItem upsell(Accessory upsell) {
    this.upsell = upsell;
    return this;
  }

   /**
   * Get upsell
   * @return upsell
  **/
  @ApiModelProperty(value = "")
  public Accessory getUpsell() {
    return upsell;
  }

  public void setUpsell(Accessory upsell) {
    this.upsell = upsell;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.id, orderItem.id) &&
        Objects.equals(this.check, orderItem.check) &&
        Objects.equals(this.accessory, orderItem.accessory) &&
        Objects.equals(this.upsell, orderItem.upsell);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, check, accessory, upsell);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    check: ").append(toIndentedString(check)).append("\n");
    sb.append("    accessory: ").append(toIndentedString(accessory)).append("\n");
    sb.append("    upsell: ").append(toIndentedString(upsell)).append("\n");
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

