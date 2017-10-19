package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Additional information for the order object.
 */
@ApiModel(description = "Additional information for the order object.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

public class OrderAddition   {
  @JsonProperty("input")
  private String input = null;

  @JsonProperty("output")
  private String output = null;

  public OrderAddition input(String input) {
    this.input = input;
    return this;
  }

   /**
   * JSON location of input.
   * @return input
  **/
  @ApiModelProperty(value = "JSON location of input.")
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public OrderAddition output(String output) {
    this.output = output;
    return this;
  }

   /**
   * JSON location of output.
   * @return output
  **/
  @ApiModelProperty(value = "JSON location of output.")
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderAddition orderAddition = (OrderAddition) o;
    return Objects.equals(this.input, orderAddition.input) &&
        Objects.equals(this.output, orderAddition.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderAddition {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

