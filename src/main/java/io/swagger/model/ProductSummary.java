package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Money;
import io.swagger.model.ProductId;
import io.swagger.model.Quantity;

/**
 * Summary of a product that was ordered.
 */
@ApiModel(description = "Summary of a product that was ordered.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class ProductSummary   {
  @JsonProperty("id")
  private ProductId id = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("amount")
  private Quantity amount = null;

  @JsonProperty("price")
  private Money price = null;

  public ProductSummary id(ProductId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public ProductId getId() {
    return id;
  }

  public void setId(ProductId id) {
    this.id = id;
  }

  public ProductSummary description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the product.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the product.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductSummary amount(Quantity amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public Quantity getAmount() {
    return amount;
  }

  public void setAmount(Quantity amount) {
    this.amount = amount;
  }

  public ProductSummary price(Money price) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSummary productSummary = (ProductSummary) o;
    return Objects.equals(this.id, productSummary.id) &&
        Objects.equals(this.description, productSummary.description) &&
        Objects.equals(this.amount, productSummary.amount) &&
        Objects.equals(this.price, productSummary.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, amount, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

