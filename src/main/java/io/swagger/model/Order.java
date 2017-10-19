package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Address;
import io.swagger.model.Customer;
import io.swagger.model.Money;
import io.swagger.model.OrderItem;
import io.swagger.model.Promotion;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/**
 * An order containing line items, each of which can be shipped separately.
 */
@ApiModel(description = "An order containing line items, each of which can be shipped separately.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class Order   {
  @JsonProperty("customer")
  private Customer customer = null;

  @JsonProperty("items")
  private List<OrderItem> items = new ArrayList<OrderItem>();

  @JsonProperty("placedOn")
  private LocalDate placedOn = null;

  @JsonProperty("placedRecent")
  private Boolean placedRecent = null;

  @JsonProperty("promotion")
  private Promotion promotion = null;

  @JsonProperty("shippingAddress")
  private Address shippingAddress = null;

  @JsonProperty("subTotal")
  private Money subTotal = null;

  @JsonProperty("totalSavings")
  private Money totalSavings = null;

  @JsonProperty("tax")
  private Money tax = null;

  @JsonProperty("total")
  private Money total = null;

  public Order customer(Customer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(required = true, value = "")
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Order items(List<OrderItem> items) {
    this.items = items;
    return this;
  }

  public Order addItemsItem(OrderItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The line items of the order. Some platforms may convert these into single orders.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "The line items of the order. Some platforms may convert these into single orders.")
  public List<OrderItem> getItems() {
    return items;
  }

  public void setItems(List<OrderItem> items) {
    this.items = items;
  }

  public Order placedOn(LocalDate placedOn) {
    this.placedOn = placedOn;
    return this;
  }

   /**
   * The date the order was placed in US date format MM/DD/YYYY. e.g. 01/03/2015
   * @return placedOn
  **/
  @ApiModelProperty(value = "The date the order was placed in US date format MM/DD/YYYY. e.g. 01/03/2015")
  public LocalDate getPlacedOn() {
    return placedOn;
  }

  public void setPlacedOn(LocalDate placedOn) {
    this.placedOn = placedOn;
  }

  public Order placedRecent(Boolean placedRecent) {
    this.placedRecent = placedRecent;
    return this;
  }

   /**
   * This is true if the placedOn date is with 24 hours of the current server time.
   * @return placedRecent
  **/
  @ApiModelProperty(value = "This is true if the placedOn date is with 24 hours of the current server time.")
  public Boolean getPlacedRecent() {
    return placedRecent;
  }

  public void setPlacedRecent(Boolean placedRecent) {
    this.placedRecent = placedRecent;
  }

  public Order promotion(Promotion promotion) {
    this.promotion = promotion;
    return this;
  }

   /**
   * Get promotion
   * @return promotion
  **/
  @ApiModelProperty(value = "")
  public Promotion getPromotion() {
    return promotion;
  }

  public void setPromotion(Promotion promotion) {
    this.promotion = promotion;
  }

  public Order shippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @ApiModelProperty(required = true, value = "")
  public Address getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public Order subTotal(Money subTotal) {
    this.subTotal = subTotal;
    return this;
  }

   /**
   * Get subTotal
   * @return subTotal
  **/
  @ApiModelProperty(required = true, value = "")
  public Money getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Money subTotal) {
    this.subTotal = subTotal;
  }

  public Order totalSavings(Money totalSavings) {
    this.totalSavings = totalSavings;
    return this;
  }

   /**
   * Get totalSavings
   * @return totalSavings
  **/
  @ApiModelProperty(value = "")
  public Money getTotalSavings() {
    return totalSavings;
  }

  public void setTotalSavings(Money totalSavings) {
    this.totalSavings = totalSavings;
  }

  public Order tax(Money tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")
  public Money getTax() {
    return tax;
  }

  public void setTax(Money tax) {
    this.tax = tax;
  }

  public Order total(Money total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(required = true, value = "")
  public Money getTotal() {
    return total;
  }

  public void setTotal(Money total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.customer, order.customer) &&
        Objects.equals(this.items, order.items) &&
        Objects.equals(this.placedOn, order.placedOn) &&
        Objects.equals(this.placedRecent, order.placedRecent) &&
        Objects.equals(this.promotion, order.promotion) &&
        Objects.equals(this.shippingAddress, order.shippingAddress) &&
        Objects.equals(this.subTotal, order.subTotal) &&
        Objects.equals(this.totalSavings, order.totalSavings) &&
        Objects.equals(this.tax, order.tax) &&
        Objects.equals(this.total, order.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, items, placedOn, placedRecent, promotion, shippingAddress, subTotal, totalSavings, tax, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    placedOn: ").append(toIndentedString(placedOn)).append("\n");
    sb.append("    placedRecent: ").append(toIndentedString(placedRecent)).append("\n");
    sb.append("    promotion: ").append(toIndentedString(promotion)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    totalSavings: ").append(toIndentedString(totalSavings)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

