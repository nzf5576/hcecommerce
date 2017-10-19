package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Errors;
import io.swagger.model.ShippingOptions;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

@Api(value = "shippingoptions", description = "the shippingoptions API")
public interface ShippingoptionsApi {

    @ApiOperation(value = "Get Shipping Options for Product", notes = "Given a customerId, the product and quantity, along with the shipping address, get the possible shipping options.", response = ShippingOptions.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "checks", description = "Grants access to order review order history, browse catalog, and order checks.")
            }),
        @Authorization(value = "key")
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ShippingOptions.class),
        @ApiResponse(code = 401, message = "Authorization failed. Use the getToken service to obtain a valid token.", response = ShippingOptions.class),
        @ApiResponse(code = 403, message = "The application has understood the request but refuses to fulfill it because of business validation error.", response = ShippingOptions.class),
        @ApiResponse(code = 404, message = "Invalid parameter(s). No shipping options found for product.", response = ShippingOptions.class),
        @ApiResponse(code = 500, message = "A technical issue prevents fulfilling the request (application error).", response = ShippingOptions.class),
        @ApiResponse(code = 503, message = "The application is not available.", response = ShippingOptions.class),
        @ApiResponse(code = 504, message = "There is a break in the service chain that prevents fulfilling the request.", response = ShippingOptions.class),
        @ApiResponse(code = 200, message = "Unexpected Error", response = ShippingOptions.class) })
    @RequestMapping(value = "/shippingoptions/{customerId}/{productId}/{amount}/{unit}",
        produces = { "application/json", "text/xml" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.GET)
    ResponseEntity<ShippingOptions> getShippingOptions(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier.",required=true ) @PathVariable("productId") String productId,
        @ApiParam(value = "The quantity of product.",required=true ) @PathVariable("amount") BigDecimal amount,
        @ApiParam(value = "The unit of measure identifier.",required=true ) @PathVariable("unit") String unit,
        @ApiParam(value = "First line of a shipping address, usually a name. (URL encoded)", required = true) @RequestParam(value = "shipTo", required = true) String shipTo,
        @ApiParam(value = "Second line of a shipping address, may be a name or Apt. no etc. (URL encoded)", required = true) @RequestParam(value = "careOf", required = true) String careOf,
        @ApiParam(value = "Third line of a shipping address. (URL encoded)", required = true) @RequestParam(value = "address3", required = true) String address3,
        @ApiParam(value = "Fourth line of a shipping address. (URL encoded)", required = true) @RequestParam(value = "address4", required = true) String address4,
        @ApiParam(value = "The city. (URL encoded)", required = true) @RequestParam(value = "city", required = true) String city,
        @ApiParam(value = "The two letter abbreviation for the state.", required = true) @RequestParam(value = "state", required = true) String state,
        @ApiParam(value = "The postal (zip) code. (URL encoded)", required = true) @RequestParam(value = "postalCode", required = true) String postalCode,
        @ApiParam(value = "This is true is the address is foreign. False otherwise.", required = true) @RequestParam(value = "foreign", required = true) Boolean foreign);

}
