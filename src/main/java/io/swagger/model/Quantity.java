package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A quantity that consists of an amount and a unit of measure.
 */
@ApiModel(description = "A quantity that consists of an amount and a unit of measure.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class Quantity   {
  @JsonProperty("amount")
  private Integer amount = null;

  @JsonProperty("unit")
  private String unit = null;

  public Quantity amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The unqualified amount e.g. 10
   * minimum: 0
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The unqualified amount e.g. 10")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public Quantity unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The qualifier e.g. 'checks'
   * @return unit
  **/
  @ApiModelProperty(required = true, value = "The qualifier e.g. 'checks'")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Quantity quantity = (Quantity) o;
    return Objects.equals(this.amount, quantity.amount) &&
        Objects.equals(this.unit, quantity.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quantity {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

