package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PricingOption;
import io.swagger.model.PricingOptions;

/**
 * The pricing options available for a product.
 */
@ApiModel(description = "The pricing options available for a product.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class Prices   {
  @JsonProperty("product")
  private PricingOptions product = null;

  @JsonProperty("accents")
  private PricingOption accents = null;

  @JsonProperty("oneLiners")
  private PricingOption oneLiners = null;

  @JsonProperty("signatureLines")
  private PricingOption signatureLines = null;

  public Prices product(PricingOptions product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(required = true, value = "")
  public PricingOptions getProduct() {
    return product;
  }

  public void setProduct(PricingOptions product) {
    this.product = product;
  }

  public Prices accents(PricingOption accents) {
    this.accents = accents;
    return this;
  }

   /**
   * Get accents
   * @return accents
  **/
  @ApiModelProperty(required = true, value = "")
  public PricingOption getAccents() {
    return accents;
  }

  public void setAccents(PricingOption accents) {
    this.accents = accents;
  }

  public Prices oneLiners(PricingOption oneLiners) {
    this.oneLiners = oneLiners;
    return this;
  }

   /**
   * Get oneLiners
   * @return oneLiners
  **/
  @ApiModelProperty(required = true, value = "")
  public PricingOption getOneLiners() {
    return oneLiners;
  }

  public void setOneLiners(PricingOption oneLiners) {
    this.oneLiners = oneLiners;
  }

  public Prices signatureLines(PricingOption signatureLines) {
    this.signatureLines = signatureLines;
    return this;
  }

   /**
   * Get signatureLines
   * @return signatureLines
  **/
  @ApiModelProperty(required = true, value = "")
  public PricingOption getSignatureLines() {
    return signatureLines;
  }

  public void setSignatureLines(PricingOption signatureLines) {
    this.signatureLines = signatureLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Prices prices = (Prices) o;
    return Objects.equals(this.product, prices.product) &&
        Objects.equals(this.accents, prices.accents) &&
        Objects.equals(this.oneLiners, prices.oneLiners) &&
        Objects.equals(this.signatureLines, prices.signatureLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, accents, oneLiners, signatureLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prices {\n");
    
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    accents: ").append(toIndentedString(accents)).append("\n");
    sb.append("    oneLiners: ").append(toIndentedString(oneLiners)).append("\n");
    sb.append("    signatureLines: ").append(toIndentedString(signatureLines)).append("\n");
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

