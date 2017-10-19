package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Errors;
import io.swagger.model.Order;

/**
 * An Order with updated prices and error information if some prices were not supplied.
 */
@ApiModel(description = "An Order with updated prices and error information if some prices were not supplied.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class PriceConfirmation   {
  @JsonProperty("order")
  private Order order = null;

  @JsonProperty("errors")
  private Errors errors = null;

  public PriceConfirmation order(Order order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public PriceConfirmation errors(Errors errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public Errors getErrors() {
    return errors;
  }

  public void setErrors(Errors errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceConfirmation priceConfirmation = (PriceConfirmation) o;
    return Objects.equals(this.order, priceConfirmation.order) &&
        Objects.equals(this.errors, priceConfirmation.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceConfirmation {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

