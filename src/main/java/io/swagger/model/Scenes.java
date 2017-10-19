package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ProductId;

/**
 * URI&#39;s to the small image, thumbnail, and large images of the product identified by productId
 */
@ApiModel(description = "URI's to the small image, thumbnail, and large images of the product identified by productId")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class Scenes   {
  @JsonProperty("product")
  private ProductId product = null;

  @JsonProperty("base")
  private String base = null;

  @JsonProperty("small")
  private String small = null;

  @JsonProperty("thumbnail")
  private String thumbnail = null;

  @JsonProperty("large")
  private String large = null;

  public Scenes product(ProductId product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")
  public ProductId getProduct() {
    return product;
  }

  public void setProduct(ProductId product) {
    this.product = product;
  }

  public Scenes base(String base) {
    this.base = base;
    return this;
  }

   /**
   * URI to the base image of a product.
   * @return base
  **/
  @ApiModelProperty(value = "URI to the base image of a product.")
  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public Scenes small(String small) {
    this.small = small;
    return this;
  }

   /**
   * URI to the small image of a product.
   * @return small
  **/
  @ApiModelProperty(value = "URI to the small image of a product.")
  public String getSmall() {
    return small;
  }

  public void setSmall(String small) {
    this.small = small;
  }

  public Scenes thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * URI to the thumbnail image of a product.
   * @return thumbnail
  **/
  @ApiModelProperty(value = "URI to the thumbnail image of a product.")
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public Scenes large(String large) {
    this.large = large;
    return this;
  }

   /**
   * URI to the large image of a product.
   * @return large
  **/
  @ApiModelProperty(value = "URI to the large image of a product.")
  public String getLarge() {
    return large;
  }

  public void setLarge(String large) {
    this.large = large;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scenes scenes = (Scenes) o;
    return Objects.equals(this.product, scenes.product) &&
        Objects.equals(this.base, scenes.base) &&
        Objects.equals(this.small, scenes.small) &&
        Objects.equals(this.thumbnail, scenes.thumbnail) &&
        Objects.equals(this.large, scenes.large);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, base, small, thumbnail, large);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scenes {\n");
    
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    large: ").append(toIndentedString(large)).append("\n");
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

