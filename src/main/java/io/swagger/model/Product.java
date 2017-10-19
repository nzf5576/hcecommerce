package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccentSymbols;
import io.swagger.model.Accessory;
import io.swagger.model.CheckStyle;
import io.swagger.model.DistinctiveLettering;
import io.swagger.model.OneLiners;
import io.swagger.model.PricingOptions;
import io.swagger.model.ProductId;
import io.swagger.model.ProductValidation;
import io.swagger.model.Scenes;
import java.util.ArrayList;
import java.util.List;

/**
 * Details of a product in the product catalog.
 */
@ApiModel(description = "Details of a product in the product catalog.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class Product   {
  @JsonProperty("id")
  private ProductId id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("shortDescription")
  private String shortDescription = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("binding")
  private String binding = null;

  @JsonProperty("color")
  private String color = null;

  @JsonProperty("part")
  private String part = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("personalizationLines")
  private Integer personalizationLines = null;

  @JsonProperty("isBusinessProduct")
  private Boolean isBusinessProduct = null;

  @JsonProperty("licenseUri")
  private String licenseUri = null;

  @JsonProperty("licenseText")
  private String licenseText = null;

  @JsonProperty("recommendedAccentSymbols")
  private AccentSymbols recommendedAccentSymbols = null;

  @JsonProperty("recommendedOneLiners")
  private OneLiners recommendedOneLiners = null;

  @JsonProperty("distinctiveLettering")
  private DistinctiveLettering distinctiveLettering = null;

  @JsonProperty("pricingOptions")
  private PricingOptions pricingOptions = null;

  @JsonProperty("scenes")
  private List<Scenes> scenes = new ArrayList<Scenes>();

  @JsonProperty("relatedProducts")
  private List<String> relatedProducts = new ArrayList<String>();

  @JsonProperty("relatedStyles")
  private List<CheckStyle> relatedStyles = new ArrayList<CheckStyle>();

  @JsonProperty("fraudArmor")
  private Accessory fraudArmor = null;

  @JsonProperty("validation")
  private ProductValidation validation = null;

  public Product id(ProductId id) {
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

  public Product name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the product.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the product.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * A short description of the product.
   * @return shortDescription
  **/
  @ApiModelProperty(value = "A short description of the product.")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public Product description(String description) {
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

  public Product binding(String binding) {
    this.binding = binding;
    return this;
  }

   /**
   * The style of binding used on the checks e.g. duplicate.
   * @return binding
  **/
  @ApiModelProperty(value = "The style of binding used on the checks e.g. duplicate.")
  public String getBinding() {
    return binding;
  }

  public void setBinding(String binding) {
    this.binding = binding;
  }

  public Product color(String color) {
    this.color = color;
    return this;
  }

   /**
   * The color style of the checks.
   * @return color
  **/
  @ApiModelProperty(value = "The color style of the checks.")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Product part(String part) {
    this.part = part;
    return this;
  }

   /**
   * The 'part' style of the checks.
   * @return part
  **/
  @ApiModelProperty(value = "The 'part' style of the checks.")
  public String getPart() {
    return part;
  }

  public void setPart(String part) {
    this.part = part;
  }

  public Product type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of product e.g. Check
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of product e.g. Check")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Product personalizationLines(Integer personalizationLines) {
    this.personalizationLines = personalizationLines;
    return this;
  }

   /**
   * The number of personalization lines available.
   * minimum: 1
   * @return personalizationLines
  **/
  @ApiModelProperty(value = "The number of personalization lines available.")
  public Integer getPersonalizationLines() {
    return personalizationLines;
  }

  public void setPersonalizationLines(Integer personalizationLines) {
    this.personalizationLines = personalizationLines;
  }

  public Product isBusinessProduct(Boolean isBusinessProduct) {
    this.isBusinessProduct = isBusinessProduct;
    return this;
  }

   /**
   * Indicates whether the check product is a business product or a personal product.
   * @return isBusinessProduct
  **/
  @ApiModelProperty(value = "Indicates whether the check product is a business product or a personal product.")
  public Boolean getIsBusinessProduct() {
    return isBusinessProduct;
  }

  public void setIsBusinessProduct(Boolean isBusinessProduct) {
    this.isBusinessProduct = isBusinessProduct;
  }

  public Product licenseUri(String licenseUri) {
    this.licenseUri = licenseUri;
    return this;
  }

   /**
   * The URI to the license image.
   * @return licenseUri
  **/
  @ApiModelProperty(value = "The URI to the license image.")
  public String getLicenseUri() {
    return licenseUri;
  }

  public void setLicenseUri(String licenseUri) {
    this.licenseUri = licenseUri;
  }

  public Product licenseText(String licenseText) {
    this.licenseText = licenseText;
    return this;
  }

   /**
   * The text for the additional license info.
   * @return licenseText
  **/
  @ApiModelProperty(value = "The text for the additional license info.")
  public String getLicenseText() {
    return licenseText;
  }

  public void setLicenseText(String licenseText) {
    this.licenseText = licenseText;
  }

  public Product recommendedAccentSymbols(AccentSymbols recommendedAccentSymbols) {
    this.recommendedAccentSymbols = recommendedAccentSymbols;
    return this;
  }

   /**
   * Get recommendedAccentSymbols
   * @return recommendedAccentSymbols
  **/
  @ApiModelProperty(value = "")
  public AccentSymbols getRecommendedAccentSymbols() {
    return recommendedAccentSymbols;
  }

  public void setRecommendedAccentSymbols(AccentSymbols recommendedAccentSymbols) {
    this.recommendedAccentSymbols = recommendedAccentSymbols;
  }

  public Product recommendedOneLiners(OneLiners recommendedOneLiners) {
    this.recommendedOneLiners = recommendedOneLiners;
    return this;
  }

   /**
   * Get recommendedOneLiners
   * @return recommendedOneLiners
  **/
  @ApiModelProperty(value = "")
  public OneLiners getRecommendedOneLiners() {
    return recommendedOneLiners;
  }

  public void setRecommendedOneLiners(OneLiners recommendedOneLiners) {
    this.recommendedOneLiners = recommendedOneLiners;
  }

  public Product distinctiveLettering(DistinctiveLettering distinctiveLettering) {
    this.distinctiveLettering = distinctiveLettering;
    return this;
  }

   /**
   * Get distinctiveLettering
   * @return distinctiveLettering
  **/
  @ApiModelProperty(value = "")
  public DistinctiveLettering getDistinctiveLettering() {
    return distinctiveLettering;
  }

  public void setDistinctiveLettering(DistinctiveLettering distinctiveLettering) {
    this.distinctiveLettering = distinctiveLettering;
  }

  public Product pricingOptions(PricingOptions pricingOptions) {
    this.pricingOptions = pricingOptions;
    return this;
  }

   /**
   * Get pricingOptions
   * @return pricingOptions
  **/
  @ApiModelProperty(value = "")
  public PricingOptions getPricingOptions() {
    return pricingOptions;
  }

  public void setPricingOptions(PricingOptions pricingOptions) {
    this.pricingOptions = pricingOptions;
  }

  public Product scenes(List<Scenes> scenes) {
    this.scenes = scenes;
    return this;
  }

  public Product addScenesItem(Scenes scenesItem) {
    this.scenes.add(scenesItem);
    return this;
  }

   /**
   * Available scenes.
   * @return scenes
  **/
  @ApiModelProperty(value = "Available scenes.")
  public List<Scenes> getScenes() {
    return scenes;
  }

  public void setScenes(List<Scenes> scenes) {
    this.scenes = scenes;
  }

  public Product relatedProducts(List<String> relatedProducts) {
    this.relatedProducts = relatedProducts;
    return this;
  }

  public Product addRelatedProductsItem(String relatedProductsItem) {
    this.relatedProducts.add(relatedProductsItem);
    return this;
  }

   /**
   * URI's to details of related products e.g. http://api.ordermychecks.com/product/1234
   * @return relatedProducts
  **/
  @ApiModelProperty(value = "URI's to details of related products e.g. http://api.ordermychecks.com/product/1234")
  public List<String> getRelatedProducts() {
    return relatedProducts;
  }

  public void setRelatedProducts(List<String> relatedProducts) {
    this.relatedProducts = relatedProducts;
  }

  public Product relatedStyles(List<CheckStyle> relatedStyles) {
    this.relatedStyles = relatedStyles;
    return this;
  }

  public Product addRelatedStylesItem(CheckStyle relatedStylesItem) {
    this.relatedStyles.add(relatedStylesItem);
    return this;
  }

   /**
   * Check product styles related to this product.
   * @return relatedStyles
  **/
  @ApiModelProperty(value = "Check product styles related to this product.")
  public List<CheckStyle> getRelatedStyles() {
    return relatedStyles;
  }

  public void setRelatedStyles(List<CheckStyle> relatedStyles) {
    this.relatedStyles = relatedStyles;
  }

  public Product fraudArmor(Accessory fraudArmor) {
    this.fraudArmor = fraudArmor;
    return this;
  }

   /**
   * Get fraudArmor
   * @return fraudArmor
  **/
  @ApiModelProperty(value = "")
  public Accessory getFraudArmor() {
    return fraudArmor;
  }

  public void setFraudArmor(Accessory fraudArmor) {
    this.fraudArmor = fraudArmor;
  }

  public Product validation(ProductValidation validation) {
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @ApiModelProperty(value = "")
  public ProductValidation getValidation() {
    return validation;
  }

  public void setValidation(ProductValidation validation) {
    this.validation = validation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.shortDescription, product.shortDescription) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.binding, product.binding) &&
        Objects.equals(this.color, product.color) &&
        Objects.equals(this.part, product.part) &&
        Objects.equals(this.type, product.type) &&
        Objects.equals(this.personalizationLines, product.personalizationLines) &&
        Objects.equals(this.isBusinessProduct, product.isBusinessProduct) &&
        Objects.equals(this.licenseUri, product.licenseUri) &&
        Objects.equals(this.licenseText, product.licenseText) &&
        Objects.equals(this.recommendedAccentSymbols, product.recommendedAccentSymbols) &&
        Objects.equals(this.recommendedOneLiners, product.recommendedOneLiners) &&
        Objects.equals(this.distinctiveLettering, product.distinctiveLettering) &&
        Objects.equals(this.pricingOptions, product.pricingOptions) &&
        Objects.equals(this.scenes, product.scenes) &&
        Objects.equals(this.relatedProducts, product.relatedProducts) &&
        Objects.equals(this.relatedStyles, product.relatedStyles) &&
        Objects.equals(this.fraudArmor, product.fraudArmor) &&
        Objects.equals(this.validation, product.validation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, shortDescription, description, binding, color, part, type, personalizationLines, isBusinessProduct, licenseUri, licenseText, recommendedAccentSymbols, recommendedOneLiners, distinctiveLettering, pricingOptions, scenes, relatedProducts, relatedStyles, fraudArmor, validation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    binding: ").append(toIndentedString(binding)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    personalizationLines: ").append(toIndentedString(personalizationLines)).append("\n");
    sb.append("    isBusinessProduct: ").append(toIndentedString(isBusinessProduct)).append("\n");
    sb.append("    licenseUri: ").append(toIndentedString(licenseUri)).append("\n");
    sb.append("    licenseText: ").append(toIndentedString(licenseText)).append("\n");
    sb.append("    recommendedAccentSymbols: ").append(toIndentedString(recommendedAccentSymbols)).append("\n");
    sb.append("    recommendedOneLiners: ").append(toIndentedString(recommendedOneLiners)).append("\n");
    sb.append("    distinctiveLettering: ").append(toIndentedString(distinctiveLettering)).append("\n");
    sb.append("    pricingOptions: ").append(toIndentedString(pricingOptions)).append("\n");
    sb.append("    scenes: ").append(toIndentedString(scenes)).append("\n");
    sb.append("    relatedProducts: ").append(toIndentedString(relatedProducts)).append("\n");
    sb.append("    relatedStyles: ").append(toIndentedString(relatedStyles)).append("\n");
    sb.append("    fraudArmor: ").append(toIndentedString(fraudArmor)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
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

