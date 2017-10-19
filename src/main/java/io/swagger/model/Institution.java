package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ContactUsContent;
import io.swagger.model.InstitutionAddress;
import io.swagger.model.InstitutionNavigation;
import io.swagger.model.InstitutionValidation;
import io.swagger.model.OrderAdditions;

/**
 * Institution
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class Institution   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("analyticsName")
  private String analyticsName = null;

  @JsonProperty("transitRouting")
  private String transitRouting = null;

  @JsonProperty("account")
  private String account = null;

  @JsonProperty("clubCode")
  private String clubCode = null;

  @JsonProperty("clubName")
  private String clubName = null;

  @JsonProperty("branchCode")
  private String branchCode = null;

  @JsonProperty("logo")
  private String logo = null;

  @JsonProperty("clientHomePage")
  private String clientHomePage = null;

  @JsonProperty("customerServiceNumber")
  private String customerServiceNumber = null;

  @JsonProperty("isAllowedEditCheckNumber")
  private Boolean isAllowedEditCheckNumber = null;

  @JsonProperty("isAllowedEnterPromoCode")
  private Boolean isAllowedEnterPromoCode = null;

  @JsonProperty("isAllowedEditPersonalizationNames")
  private Boolean isAllowedEditPersonalizationNames = null;

  @JsonProperty("isAllowedEditPersonalizationAddress")
  private Boolean isAllowedEditPersonalizationAddress = null;

  @JsonProperty("isAllowedEditShipping")
  private Boolean isAllowedEditShipping = null;

  @JsonProperty("isAllowedEnterForeignShipping")
  private Boolean isAllowedEnterForeignShipping = null;

  @JsonProperty("isPreselectShippingOption")
  private Boolean isPreselectShippingOption = null;

  @JsonProperty("isDefaultShippingOption")
  private Boolean isDefaultShippingOption = null;

  @JsonProperty("isRequiredEmail")
  private Boolean isRequiredEmail = null;

  @JsonProperty("isBusinessAccount")
  private Boolean isBusinessAccount = null;

  @JsonProperty("forcePersonalizationVerification")
  private Boolean forcePersonalizationVerification = null;

  @JsonProperty("integrationKeepAliveURL")
  private String integrationKeepAliveURL = null;

  @JsonProperty("integrationKillClientSessionURL")
  private String integrationKillClientSessionURL = null;

  @JsonProperty("showSurvey")
  private Boolean showSurvey = null;

  @JsonProperty("showPersonalization")
  private Boolean showPersonalization = null;

  @JsonProperty("showShippingAddress")
  private Boolean showShippingAddress = null;

  @JsonProperty("showEmail")
  private Boolean showEmail = null;

  @JsonProperty("styleColor1")
  private String styleColor1 = null;

  @JsonProperty("channel")
  private String channel = null;

  @JsonProperty("poweredBy")
  private String poweredBy = null;

  @JsonProperty("backgroundImage")
  private String backgroundImage = null;

  @JsonProperty("address")
  private InstitutionAddress address = null;

  @JsonProperty("orderAdditions")
  private OrderAdditions orderAdditions = null;

  @JsonProperty("validation")
  private InstitutionValidation validation = null;

  @JsonProperty("navigation")
  private InstitutionNavigation navigation = null;

  @JsonProperty("contactUsContent")
  private ContactUsContent contactUsContent = null;

  public Institution name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the institution e.g. Navy Federal Credit Union.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the institution e.g. Navy Federal Credit Union.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Institution analyticsName(String analyticsName) {
    this.analyticsName = analyticsName;
    return this;
  }

   /**
   * The name given to the FI for analytics perposes.
   * @return analyticsName
  **/
  @ApiModelProperty(value = "The name given to the FI for analytics perposes.")
  public String getAnalyticsName() {
    return analyticsName;
  }

  public void setAnalyticsName(String analyticsName) {
    this.analyticsName = analyticsName;
  }

  public Institution transitRouting(String transitRouting) {
    this.transitRouting = transitRouting;
    return this;
  }

   /**
   * The transit routing number of the institution e.g. '256074974'
   * @return transitRouting
  **/
  @ApiModelProperty(value = "The transit routing number of the institution e.g. '256074974'")
  public String getTransitRouting() {
    return transitRouting;
  }

  public void setTransitRouting(String transitRouting) {
    this.transitRouting = transitRouting;
  }

  public Institution account(String account) {
    this.account = account;
    return this;
  }

   /**
   * The account of the customer requesting the institution information.
   * @return account
  **/
  @ApiModelProperty(value = "The account of the customer requesting the institution information.")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public Institution clubCode(String clubCode) {
    this.clubCode = clubCode;
    return this;
  }

   /**
   * The code identifying the club which in turn determines the catalog.
   * @return clubCode
  **/
  @ApiModelProperty(value = "The code identifying the club which in turn determines the catalog.")
  public String getClubCode() {
    return clubCode;
  }

  public void setClubCode(String clubCode) {
    this.clubCode = clubCode;
  }

  public Institution clubName(String clubName) {
    this.clubName = clubName;
    return this;
  }

   /**
   * The name of the club.
   * @return clubName
  **/
  @ApiModelProperty(value = "The name of the club.")
  public String getClubName() {
    return clubName;
  }

  public void setClubName(String clubName) {
    this.clubName = clubName;
  }

  public Institution branchCode(String branchCode) {
    this.branchCode = branchCode;
    return this;
  }

   /**
   * The branch code associated with this TR.
   * @return branchCode
  **/
  @ApiModelProperty(value = "The branch code associated with this TR.")
  public String getBranchCode() {
    return branchCode;
  }

  public void setBranchCode(String branchCode) {
    this.branchCode = branchCode;
  }

  public Institution logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * A URL to the institutions logo used for branding.
   * @return logo
  **/
  @ApiModelProperty(value = "A URL to the institutions logo used for branding.")
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public Institution clientHomePage(String clientHomePage) {
    this.clientHomePage = clientHomePage;
    return this;
  }

   /**
   * A URL to the institutions home page.
   * @return clientHomePage
  **/
  @ApiModelProperty(value = "A URL to the institutions home page.")
  public String getClientHomePage() {
    return clientHomePage;
  }

  public void setClientHomePage(String clientHomePage) {
    this.clientHomePage = clientHomePage;
  }

  public Institution customerServiceNumber(String customerServiceNumber) {
    this.customerServiceNumber = customerServiceNumber;
    return this;
  }

   /**
   * A customer service telephone number. This may be a Harland Clarke number or a financial institution number depending contractual arrangements.
   * @return customerServiceNumber
  **/
  @ApiModelProperty(value = "A customer service telephone number. This may be a Harland Clarke number or a financial institution number depending contractual arrangements.")
  public String getCustomerServiceNumber() {
    return customerServiceNumber;
  }

  public void setCustomerServiceNumber(String customerServiceNumber) {
    this.customerServiceNumber = customerServiceNumber;
  }

  public Institution isAllowedEditCheckNumber(Boolean isAllowedEditCheckNumber) {
    this.isAllowedEditCheckNumber = isAllowedEditCheckNumber;
    return this;
  }

   /**
   * This is true if the customer is allowed to determine their own starting check number.
   * @return isAllowedEditCheckNumber
  **/
  @ApiModelProperty(value = "This is true if the customer is allowed to determine their own starting check number.")
  public Boolean getIsAllowedEditCheckNumber() {
    return isAllowedEditCheckNumber;
  }

  public void setIsAllowedEditCheckNumber(Boolean isAllowedEditCheckNumber) {
    this.isAllowedEditCheckNumber = isAllowedEditCheckNumber;
  }

  public Institution isAllowedEnterPromoCode(Boolean isAllowedEnterPromoCode) {
    this.isAllowedEnterPromoCode = isAllowedEnterPromoCode;
    return this;
  }

   /**
   * This is true if the institution offers PromoCodes that the user can enter.
   * @return isAllowedEnterPromoCode
  **/
  @ApiModelProperty(value = "This is true if the institution offers PromoCodes that the user can enter.")
  public Boolean getIsAllowedEnterPromoCode() {
    return isAllowedEnterPromoCode;
  }

  public void setIsAllowedEnterPromoCode(Boolean isAllowedEnterPromoCode) {
    this.isAllowedEnterPromoCode = isAllowedEnterPromoCode;
  }

  public Institution isAllowedEditPersonalizationNames(Boolean isAllowedEditPersonalizationNames) {
    this.isAllowedEditPersonalizationNames = isAllowedEditPersonalizationNames;
    return this;
  }

   /**
   * This is true if the institution allowes the user to edit the personalization name lines.
   * @return isAllowedEditPersonalizationNames
  **/
  @ApiModelProperty(value = "This is true if the institution allowes the user to edit the personalization name lines.")
  public Boolean getIsAllowedEditPersonalizationNames() {
    return isAllowedEditPersonalizationNames;
  }

  public void setIsAllowedEditPersonalizationNames(Boolean isAllowedEditPersonalizationNames) {
    this.isAllowedEditPersonalizationNames = isAllowedEditPersonalizationNames;
  }

  public Institution isAllowedEditPersonalizationAddress(Boolean isAllowedEditPersonalizationAddress) {
    this.isAllowedEditPersonalizationAddress = isAllowedEditPersonalizationAddress;
    return this;
  }

   /**
   * This is true if the institution allowes the user to edit the personalization address lines.
   * @return isAllowedEditPersonalizationAddress
  **/
  @ApiModelProperty(value = "This is true if the institution allowes the user to edit the personalization address lines.")
  public Boolean getIsAllowedEditPersonalizationAddress() {
    return isAllowedEditPersonalizationAddress;
  }

  public void setIsAllowedEditPersonalizationAddress(Boolean isAllowedEditPersonalizationAddress) {
    this.isAllowedEditPersonalizationAddress = isAllowedEditPersonalizationAddress;
  }

  public Institution isAllowedEditShipping(Boolean isAllowedEditShipping) {
    this.isAllowedEditShipping = isAllowedEditShipping;
    return this;
  }

   /**
   * This is true if the institution allowes the user to edit the shipping address.
   * @return isAllowedEditShipping
  **/
  @ApiModelProperty(value = "This is true if the institution allowes the user to edit the shipping address.")
  public Boolean getIsAllowedEditShipping() {
    return isAllowedEditShipping;
  }

  public void setIsAllowedEditShipping(Boolean isAllowedEditShipping) {
    this.isAllowedEditShipping = isAllowedEditShipping;
  }

  public Institution isAllowedEnterForeignShipping(Boolean isAllowedEnterForeignShipping) {
    this.isAllowedEnterForeignShipping = isAllowedEnterForeignShipping;
    return this;
  }

   /**
   * This is true if the institution allowes the use of a foreign shipping address.
   * @return isAllowedEnterForeignShipping
  **/
  @ApiModelProperty(value = "This is true if the institution allowes the use of a foreign shipping address.")
  public Boolean getIsAllowedEnterForeignShipping() {
    return isAllowedEnterForeignShipping;
  }

  public void setIsAllowedEnterForeignShipping(Boolean isAllowedEnterForeignShipping) {
    this.isAllowedEnterForeignShipping = isAllowedEnterForeignShipping;
  }

  public Institution isPreselectShippingOption(Boolean isPreselectShippingOption) {
    this.isPreselectShippingOption = isPreselectShippingOption;
    return this;
  }

   /**
   * This is true if the institution offers a default ShippingOption but does not want it to be applied but selected.
   * @return isPreselectShippingOption
  **/
  @ApiModelProperty(value = "This is true if the institution offers a default ShippingOption but does not want it to be applied but selected.")
  public Boolean getIsPreselectShippingOption() {
    return isPreselectShippingOption;
  }

  public void setIsPreselectShippingOption(Boolean isPreselectShippingOption) {
    this.isPreselectShippingOption = isPreselectShippingOption;
  }

  public Institution isDefaultShippingOption(Boolean isDefaultShippingOption) {
    this.isDefaultShippingOption = isDefaultShippingOption;
    return this;
  }

   /**
   * This is true if the institution offers a default ShippingOption.
   * @return isDefaultShippingOption
  **/
  @ApiModelProperty(value = "This is true if the institution offers a default ShippingOption.")
  public Boolean getIsDefaultShippingOption() {
    return isDefaultShippingOption;
  }

  public void setIsDefaultShippingOption(Boolean isDefaultShippingOption) {
    this.isDefaultShippingOption = isDefaultShippingOption;
  }

  public Institution isRequiredEmail(Boolean isRequiredEmail) {
    this.isRequiredEmail = isRequiredEmail;
    return this;
  }

   /**
   * This is true if the institution requires an email to be entered.
   * @return isRequiredEmail
  **/
  @ApiModelProperty(value = "This is true if the institution requires an email to be entered.")
  public Boolean getIsRequiredEmail() {
    return isRequiredEmail;
  }

  public void setIsRequiredEmail(Boolean isRequiredEmail) {
    this.isRequiredEmail = isRequiredEmail;
  }

  public Institution isBusinessAccount(Boolean isBusinessAccount) {
    this.isBusinessAccount = isBusinessAccount;
    return this;
  }

   /**
   * This is true if the account is a business account.
   * @return isBusinessAccount
  **/
  @ApiModelProperty(value = "This is true if the account is a business account.")
  public Boolean getIsBusinessAccount() {
    return isBusinessAccount;
  }

  public void setIsBusinessAccount(Boolean isBusinessAccount) {
    this.isBusinessAccount = isBusinessAccount;
  }

  public Institution forcePersonalizationVerification(Boolean forcePersonalizationVerification) {
    this.forcePersonalizationVerification = forcePersonalizationVerification;
    return this;
  }

   /**
   * This is true if the user interface must force the user to verify the personalization before continuing.
   * @return forcePersonalizationVerification
  **/
  @ApiModelProperty(value = "This is true if the user interface must force the user to verify the personalization before continuing.")
  public Boolean getForcePersonalizationVerification() {
    return forcePersonalizationVerification;
  }

  public void setForcePersonalizationVerification(Boolean forcePersonalizationVerification) {
    this.forcePersonalizationVerification = forcePersonalizationVerification;
  }

  public Institution integrationKeepAliveURL(String integrationKeepAliveURL) {
    this.integrationKeepAliveURL = integrationKeepAliveURL;
    return this;
  }

   /**
   * This is the URL given to use to keep the client side application session alive, only used for integration purposes.
   * @return integrationKeepAliveURL
  **/
  @ApiModelProperty(value = "This is the URL given to use to keep the client side application session alive, only used for integration purposes.")
  public String getIntegrationKeepAliveURL() {
    return integrationKeepAliveURL;
  }

  public void setIntegrationKeepAliveURL(String integrationKeepAliveURL) {
    this.integrationKeepAliveURL = integrationKeepAliveURL;
  }

  public Institution integrationKillClientSessionURL(String integrationKillClientSessionURL) {
    this.integrationKillClientSessionURL = integrationKillClientSessionURL;
    return this;
  }

   /**
   * This is the URL given to use to kill the client side application session, only used for integration purposes.
   * @return integrationKillClientSessionURL
  **/
  @ApiModelProperty(value = "This is the URL given to use to kill the client side application session, only used for integration purposes.")
  public String getIntegrationKillClientSessionURL() {
    return integrationKillClientSessionURL;
  }

  public void setIntegrationKillClientSessionURL(String integrationKillClientSessionURL) {
    this.integrationKillClientSessionURL = integrationKillClientSessionURL;
  }

  public Institution showSurvey(Boolean showSurvey) {
    this.showSurvey = showSurvey;
    return this;
  }

   /**
   * This is true if the user interface should offer the user the opportunity to fill out a survey.
   * @return showSurvey
  **/
  @ApiModelProperty(value = "This is true if the user interface should offer the user the opportunity to fill out a survey.")
  public Boolean getShowSurvey() {
    return showSurvey;
  }

  public void setShowSurvey(Boolean showSurvey) {
    this.showSurvey = showSurvey;
  }

  public Institution showPersonalization(Boolean showPersonalization) {
    this.showPersonalization = showPersonalization;
    return this;
  }

   /**
   * This is true if the FI allowes the user to see the personalization.
   * @return showPersonalization
  **/
  @ApiModelProperty(value = "This is true if the FI allowes the user to see the personalization.")
  public Boolean getShowPersonalization() {
    return showPersonalization;
  }

  public void setShowPersonalization(Boolean showPersonalization) {
    this.showPersonalization = showPersonalization;
  }

  public Institution showShippingAddress(Boolean showShippingAddress) {
    this.showShippingAddress = showShippingAddress;
    return this;
  }

   /**
   * This is true if the FI allowes the user to see the shipping address.
   * @return showShippingAddress
  **/
  @ApiModelProperty(value = "This is true if the FI allowes the user to see the shipping address.")
  public Boolean getShowShippingAddress() {
    return showShippingAddress;
  }

  public void setShowShippingAddress(Boolean showShippingAddress) {
    this.showShippingAddress = showShippingAddress;
  }

  public Institution showEmail(Boolean showEmail) {
    this.showEmail = showEmail;
    return this;
  }

   /**
   * This is true if the FI allowes to show the email.
   * @return showEmail
  **/
  @ApiModelProperty(value = "This is true if the FI allowes to show the email.")
  public Boolean getShowEmail() {
    return showEmail;
  }

  public void setShowEmail(Boolean showEmail) {
    this.showEmail = showEmail;
  }

  public Institution styleColor1(String styleColor1) {
    this.styleColor1 = styleColor1;
    return this;
  }

   /**
   * This is a specific color to be used as to personalize the UI for the FI.
   * @return styleColor1
  **/
  @ApiModelProperty(value = "This is a specific color to be used as to personalize the UI for the FI.")
  public String getStyleColor1() {
    return styleColor1;
  }

  public void setStyleColor1(String styleColor1) {
    this.styleColor1 = styleColor1;
  }

  public Institution channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * This will return the appropriate channel associated with the trasitRouting number sent. e.g. 'CCP' || 'CHOICE'
   * @return channel
  **/
  @ApiModelProperty(value = "This will return the appropriate channel associated with the trasitRouting number sent. e.g. 'CCP' || 'CHOICE'")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public Institution poweredBy(String poweredBy) {
    this.poweredBy = poweredBy;
    return this;
  }

   /**
   * Returns 'DEFAULT' if 'powered by Harland Clarke' is to be shown, '' if nothing is to be shown.
   * @return poweredBy
  **/
  @ApiModelProperty(value = "Returns 'DEFAULT' if 'powered by Harland Clarke' is to be shown, '' if nothing is to be shown.")
  public String getPoweredBy() {
    return poweredBy;
  }

  public void setPoweredBy(String poweredBy) {
    this.poweredBy = poweredBy;
  }

  public Institution backgroundImage(String backgroundImage) {
    this.backgroundImage = backgroundImage;
    return this;
  }

   /**
   * This is URL of the background image to be used for the UI.
   * @return backgroundImage
  **/
  @ApiModelProperty(value = "This is URL of the background image to be used for the UI.")
  public String getBackgroundImage() {
    return backgroundImage;
  }

  public void setBackgroundImage(String backgroundImage) {
    this.backgroundImage = backgroundImage;
  }

  public Institution address(InstitutionAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public InstitutionAddress getAddress() {
    return address;
  }

  public void setAddress(InstitutionAddress address) {
    this.address = address;
  }

  public Institution orderAdditions(OrderAdditions orderAdditions) {
    this.orderAdditions = orderAdditions;
    return this;
  }

   /**
   * Get orderAdditions
   * @return orderAdditions
  **/
  @ApiModelProperty(value = "")
  public OrderAdditions getOrderAdditions() {
    return orderAdditions;
  }

  public void setOrderAdditions(OrderAdditions orderAdditions) {
    this.orderAdditions = orderAdditions;
  }

  public Institution validation(InstitutionValidation validation) {
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @ApiModelProperty(value = "")
  public InstitutionValidation getValidation() {
    return validation;
  }

  public void setValidation(InstitutionValidation validation) {
    this.validation = validation;
  }

  public Institution navigation(InstitutionNavigation navigation) {
    this.navigation = navigation;
    return this;
  }

   /**
   * Get navigation
   * @return navigation
  **/
  @ApiModelProperty(value = "")
  public InstitutionNavigation getNavigation() {
    return navigation;
  }

  public void setNavigation(InstitutionNavigation navigation) {
    this.navigation = navigation;
  }

  public Institution contactUsContent(ContactUsContent contactUsContent) {
    this.contactUsContent = contactUsContent;
    return this;
  }

   /**
   * Get contactUsContent
   * @return contactUsContent
  **/
  @ApiModelProperty(value = "")
  public ContactUsContent getContactUsContent() {
    return contactUsContent;
  }

  public void setContactUsContent(ContactUsContent contactUsContent) {
    this.contactUsContent = contactUsContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Institution institution = (Institution) o;
    return Objects.equals(this.name, institution.name) &&
        Objects.equals(this.analyticsName, institution.analyticsName) &&
        Objects.equals(this.transitRouting, institution.transitRouting) &&
        Objects.equals(this.account, institution.account) &&
        Objects.equals(this.clubCode, institution.clubCode) &&
        Objects.equals(this.clubName, institution.clubName) &&
        Objects.equals(this.branchCode, institution.branchCode) &&
        Objects.equals(this.logo, institution.logo) &&
        Objects.equals(this.clientHomePage, institution.clientHomePage) &&
        Objects.equals(this.customerServiceNumber, institution.customerServiceNumber) &&
        Objects.equals(this.isAllowedEditCheckNumber, institution.isAllowedEditCheckNumber) &&
        Objects.equals(this.isAllowedEnterPromoCode, institution.isAllowedEnterPromoCode) &&
        Objects.equals(this.isAllowedEditPersonalizationNames, institution.isAllowedEditPersonalizationNames) &&
        Objects.equals(this.isAllowedEditPersonalizationAddress, institution.isAllowedEditPersonalizationAddress) &&
        Objects.equals(this.isAllowedEditShipping, institution.isAllowedEditShipping) &&
        Objects.equals(this.isAllowedEnterForeignShipping, institution.isAllowedEnterForeignShipping) &&
        Objects.equals(this.isPreselectShippingOption, institution.isPreselectShippingOption) &&
        Objects.equals(this.isDefaultShippingOption, institution.isDefaultShippingOption) &&
        Objects.equals(this.isRequiredEmail, institution.isRequiredEmail) &&
        Objects.equals(this.isBusinessAccount, institution.isBusinessAccount) &&
        Objects.equals(this.forcePersonalizationVerification, institution.forcePersonalizationVerification) &&
        Objects.equals(this.integrationKeepAliveURL, institution.integrationKeepAliveURL) &&
        Objects.equals(this.integrationKillClientSessionURL, institution.integrationKillClientSessionURL) &&
        Objects.equals(this.showSurvey, institution.showSurvey) &&
        Objects.equals(this.showPersonalization, institution.showPersonalization) &&
        Objects.equals(this.showShippingAddress, institution.showShippingAddress) &&
        Objects.equals(this.showEmail, institution.showEmail) &&
        Objects.equals(this.styleColor1, institution.styleColor1) &&
        Objects.equals(this.channel, institution.channel) &&
        Objects.equals(this.poweredBy, institution.poweredBy) &&
        Objects.equals(this.backgroundImage, institution.backgroundImage) &&
        Objects.equals(this.address, institution.address) &&
        Objects.equals(this.orderAdditions, institution.orderAdditions) &&
        Objects.equals(this.validation, institution.validation) &&
        Objects.equals(this.navigation, institution.navigation) &&
        Objects.equals(this.contactUsContent, institution.contactUsContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, analyticsName, transitRouting, account, clubCode, clubName, branchCode, logo, clientHomePage, customerServiceNumber, isAllowedEditCheckNumber, isAllowedEnterPromoCode, isAllowedEditPersonalizationNames, isAllowedEditPersonalizationAddress, isAllowedEditShipping, isAllowedEnterForeignShipping, isPreselectShippingOption, isDefaultShippingOption, isRequiredEmail, isBusinessAccount, forcePersonalizationVerification, integrationKeepAliveURL, integrationKillClientSessionURL, showSurvey, showPersonalization, showShippingAddress, showEmail, styleColor1, channel, poweredBy, backgroundImage, address, orderAdditions, validation, navigation, contactUsContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Institution {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    analyticsName: ").append(toIndentedString(analyticsName)).append("\n");
    sb.append("    transitRouting: ").append(toIndentedString(transitRouting)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    clubCode: ").append(toIndentedString(clubCode)).append("\n");
    sb.append("    clubName: ").append(toIndentedString(clubName)).append("\n");
    sb.append("    branchCode: ").append(toIndentedString(branchCode)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    clientHomePage: ").append(toIndentedString(clientHomePage)).append("\n");
    sb.append("    customerServiceNumber: ").append(toIndentedString(customerServiceNumber)).append("\n");
    sb.append("    isAllowedEditCheckNumber: ").append(toIndentedString(isAllowedEditCheckNumber)).append("\n");
    sb.append("    isAllowedEnterPromoCode: ").append(toIndentedString(isAllowedEnterPromoCode)).append("\n");
    sb.append("    isAllowedEditPersonalizationNames: ").append(toIndentedString(isAllowedEditPersonalizationNames)).append("\n");
    sb.append("    isAllowedEditPersonalizationAddress: ").append(toIndentedString(isAllowedEditPersonalizationAddress)).append("\n");
    sb.append("    isAllowedEditShipping: ").append(toIndentedString(isAllowedEditShipping)).append("\n");
    sb.append("    isAllowedEnterForeignShipping: ").append(toIndentedString(isAllowedEnterForeignShipping)).append("\n");
    sb.append("    isPreselectShippingOption: ").append(toIndentedString(isPreselectShippingOption)).append("\n");
    sb.append("    isDefaultShippingOption: ").append(toIndentedString(isDefaultShippingOption)).append("\n");
    sb.append("    isRequiredEmail: ").append(toIndentedString(isRequiredEmail)).append("\n");
    sb.append("    isBusinessAccount: ").append(toIndentedString(isBusinessAccount)).append("\n");
    sb.append("    forcePersonalizationVerification: ").append(toIndentedString(forcePersonalizationVerification)).append("\n");
    sb.append("    integrationKeepAliveURL: ").append(toIndentedString(integrationKeepAliveURL)).append("\n");
    sb.append("    integrationKillClientSessionURL: ").append(toIndentedString(integrationKillClientSessionURL)).append("\n");
    sb.append("    showSurvey: ").append(toIndentedString(showSurvey)).append("\n");
    sb.append("    showPersonalization: ").append(toIndentedString(showPersonalization)).append("\n");
    sb.append("    showShippingAddress: ").append(toIndentedString(showShippingAddress)).append("\n");
    sb.append("    showEmail: ").append(toIndentedString(showEmail)).append("\n");
    sb.append("    styleColor1: ").append(toIndentedString(styleColor1)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    poweredBy: ").append(toIndentedString(poweredBy)).append("\n");
    sb.append("    backgroundImage: ").append(toIndentedString(backgroundImage)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    orderAdditions: ").append(toIndentedString(orderAdditions)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    navigation: ").append(toIndentedString(navigation)).append("\n");
    sb.append("    contactUsContent: ").append(toIndentedString(contactUsContent)).append("\n");
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

