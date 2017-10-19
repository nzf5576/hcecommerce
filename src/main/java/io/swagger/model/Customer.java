package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomerId;
import io.swagger.model.Name;
import io.swagger.model.Telephone;

/**
 * The customer
 */
@ApiModel(description = "The customer")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class Customer   {
  @JsonProperty("customerId")
  private CustomerId customerId = null;

  @JsonProperty("name")
  private Name name = null;

  @JsonProperty("telephone")
  private Telephone telephone = null;

  @JsonProperty("emailAddress")
  private String emailAddress = null;

  public Customer customerId(CustomerId customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")
  public CustomerId getCustomerId() {
    return customerId;
  }

  public void setCustomerId(CustomerId customerId) {
    this.customerId = customerId;
  }

  public Customer name(Name name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Customer telephone(Telephone telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * Get telephone
   * @return telephone
  **/
  @ApiModelProperty(value = "")
  public Telephone getTelephone() {
    return telephone;
  }

  public void setTelephone(Telephone telephone) {
    this.telephone = telephone;
  }

  public Customer emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The customer's email address.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The customer's email address.")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.customerId, customer.customerId) &&
        Objects.equals(this.name, customer.name) &&
        Objects.equals(this.telephone, customer.telephone) &&
        Objects.equals(this.emailAddress, customer.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, name, telephone, emailAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
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

