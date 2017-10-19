package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * InstitutionValidation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class InstitutionValidation   {
  @JsonProperty("emailMaxLength")
  private BigDecimal emailMaxLength = null;

  @JsonProperty("promoCodeMaxLength")
  private BigDecimal promoCodeMaxLength = null;

  @JsonProperty("shippingLinesMaxLength")
  private BigDecimal shippingLinesMaxLength = null;

  @JsonProperty("startingCheckMinValue")
  private BigDecimal startingCheckMinValue = null;

  @JsonProperty("startingCheckMaxValue")
  private BigDecimal startingCheckMaxValue = null;

  public InstitutionValidation emailMaxLength(BigDecimal emailMaxLength) {
    this.emailMaxLength = emailMaxLength;
    return this;
  }

   /**
   * The max length of email characters allowed by either the FI or the Channel.
   * @return emailMaxLength
  **/
  @ApiModelProperty(value = "The max length of email characters allowed by either the FI or the Channel.")
  public BigDecimal getEmailMaxLength() {
    return emailMaxLength;
  }

  public void setEmailMaxLength(BigDecimal emailMaxLength) {
    this.emailMaxLength = emailMaxLength;
  }

  public InstitutionValidation promoCodeMaxLength(BigDecimal promoCodeMaxLength) {
    this.promoCodeMaxLength = promoCodeMaxLength;
    return this;
  }

   /**
   * The max length of promoCode characters allowed by either the FI or the Channel.
   * @return promoCodeMaxLength
  **/
  @ApiModelProperty(value = "The max length of promoCode characters allowed by either the FI or the Channel.")
  public BigDecimal getPromoCodeMaxLength() {
    return promoCodeMaxLength;
  }

  public void setPromoCodeMaxLength(BigDecimal promoCodeMaxLength) {
    this.promoCodeMaxLength = promoCodeMaxLength;
  }

  public InstitutionValidation shippingLinesMaxLength(BigDecimal shippingLinesMaxLength) {
    this.shippingLinesMaxLength = shippingLinesMaxLength;
    return this;
  }

   /**
   * The max length of characters allowed for each shipping line by either the FI or the Channel.
   * @return shippingLinesMaxLength
  **/
  @ApiModelProperty(value = "The max length of characters allowed for each shipping line by either the FI or the Channel.")
  public BigDecimal getShippingLinesMaxLength() {
    return shippingLinesMaxLength;
  }

  public void setShippingLinesMaxLength(BigDecimal shippingLinesMaxLength) {
    this.shippingLinesMaxLength = shippingLinesMaxLength;
  }

  public InstitutionValidation startingCheckMinValue(BigDecimal startingCheckMinValue) {
    this.startingCheckMinValue = startingCheckMinValue;
    return this;
  }

   /**
   * The minimum value a starting check number can be allowed to be.
   * @return startingCheckMinValue
  **/
  @ApiModelProperty(value = "The minimum value a starting check number can be allowed to be.")
  public BigDecimal getStartingCheckMinValue() {
    return startingCheckMinValue;
  }

  public void setStartingCheckMinValue(BigDecimal startingCheckMinValue) {
    this.startingCheckMinValue = startingCheckMinValue;
  }

  public InstitutionValidation startingCheckMaxValue(BigDecimal startingCheckMaxValue) {
    this.startingCheckMaxValue = startingCheckMaxValue;
    return this;
  }

   /**
   * The max value a starting check number can be allowed to be.
   * @return startingCheckMaxValue
  **/
  @ApiModelProperty(value = "The max value a starting check number can be allowed to be.")
  public BigDecimal getStartingCheckMaxValue() {
    return startingCheckMaxValue;
  }

  public void setStartingCheckMaxValue(BigDecimal startingCheckMaxValue) {
    this.startingCheckMaxValue = startingCheckMaxValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionValidation institutionValidation = (InstitutionValidation) o;
    return Objects.equals(this.emailMaxLength, institutionValidation.emailMaxLength) &&
        Objects.equals(this.promoCodeMaxLength, institutionValidation.promoCodeMaxLength) &&
        Objects.equals(this.shippingLinesMaxLength, institutionValidation.shippingLinesMaxLength) &&
        Objects.equals(this.startingCheckMinValue, institutionValidation.startingCheckMinValue) &&
        Objects.equals(this.startingCheckMaxValue, institutionValidation.startingCheckMaxValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailMaxLength, promoCodeMaxLength, shippingLinesMaxLength, startingCheckMinValue, startingCheckMaxValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionValidation {\n");
    
    sb.append("    emailMaxLength: ").append(toIndentedString(emailMaxLength)).append("\n");
    sb.append("    promoCodeMaxLength: ").append(toIndentedString(promoCodeMaxLength)).append("\n");
    sb.append("    shippingLinesMaxLength: ").append(toIndentedString(shippingLinesMaxLength)).append("\n");
    sb.append("    startingCheckMinValue: ").append(toIndentedString(startingCheckMinValue)).append("\n");
    sb.append("    startingCheckMaxValue: ").append(toIndentedString(startingCheckMaxValue)).append("\n");
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

