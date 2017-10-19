package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Defaults that a Financial Institution supplies to override historical information that Harland Clarke would otherwise use to prepare a default order. 
 */
@ApiModel(description = "Defaults that a Financial Institution supplies to override historical information that Harland Clarke would otherwise use to prepare a default order. ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class IntegratedMessage   {
  @JsonProperty("payload")
  private String payload = null;

  @JsonProperty("isBusiness")
  private String isBusiness = null;

  public IntegratedMessage payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The integrated message that the client sent to HarlandClarke
   * @return payload
  **/
  @ApiModelProperty(required = true, value = "The integrated message that the client sent to HarlandClarke")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public IntegratedMessage isBusiness(String isBusiness) {
    this.isBusiness = isBusiness;
    return this;
  }

   /**
   * Is true if the account is requesting business.
   * @return isBusiness
  **/
  @ApiModelProperty(value = "Is true if the account is requesting business.")
  public String getIsBusiness() {
    return isBusiness;
  }

  public void setIsBusiness(String isBusiness) {
    this.isBusiness = isBusiness;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegratedMessage integratedMessage = (IntegratedMessage) o;
    return Objects.equals(this.payload, integratedMessage.payload) &&
        Objects.equals(this.isBusiness, integratedMessage.isBusiness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, isBusiness);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegratedMessage {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    isBusiness: ").append(toIndentedString(isBusiness)).append("\n");
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

