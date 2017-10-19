package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OrderId;
import io.swagger.model.ProductSummary;

/**
 * Summary of a single order or line item converted into an order.
 */
@ApiModel(description = "Summary of a single order or line item converted into an order.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class OrderSummary   {
  @JsonProperty("url")
  private String url = null;

  @JsonProperty("orderId")
  private OrderId orderId = null;

  @JsonProperty("products")
  private ProductSummary products = null;

  public OrderSummary url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url to the order.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The url to the order.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public OrderSummary orderId(OrderId orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(required = true, value = "")
  public OrderId getOrderId() {
    return orderId;
  }

  public void setOrderId(OrderId orderId) {
    this.orderId = orderId;
  }

  public OrderSummary products(ProductSummary products) {
    this.products = products;
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @ApiModelProperty(value = "")
  public ProductSummary getProducts() {
    return products;
  }

  public void setProducts(ProductSummary products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSummary orderSummary = (OrderSummary) o;
    return Objects.equals(this.url, orderSummary.url) &&
        Objects.equals(this.orderId, orderSummary.orderId) &&
        Objects.equals(this.products, orderSummary.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, orderId, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSummary {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

