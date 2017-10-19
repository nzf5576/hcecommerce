package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The authorization token and expiration.
 */
@ApiModel(description = "The authorization token and expiration.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class Authorization   {
  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("token_type")
  private String tokenType = null;

  @JsonProperty("expires_in")
  private Integer expiresIn = null;

  @JsonProperty("scope")
  private String scope = null;

  public Authorization accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The access token.
   * @return accessToken
  **/
  @ApiModelProperty(required = true, value = "The access token.")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public Authorization tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * The type of token. 'bearer'
   * @return tokenType
  **/
  @ApiModelProperty(required = true, value = "The type of token. 'bearer'")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public Authorization expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * The expiration of the token i.e. length of validity in secs.
   * @return expiresIn
  **/
  @ApiModelProperty(required = true, value = "The expiration of the token i.e. length of validity in secs.")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public Authorization scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope for which the token is valid e.g. 'checks'
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "The scope for which the token is valid e.g. 'checks'")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authorization authorization = (Authorization) o;
    return Objects.equals(this.accessToken, authorization.accessToken) &&
        Objects.equals(this.tokenType, authorization.tokenType) &&
        Objects.equals(this.expiresIn, authorization.expiresIn) &&
        Objects.equals(this.scope, authorization.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType, expiresIn, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authorization {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

