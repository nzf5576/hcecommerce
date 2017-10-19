package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Errors;
import io.swagger.model.ShippingOptions;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-18T23:57:51.740Z")

@Controller
public class ShippingoptionsApiController implements ShippingoptionsApi {

    public ResponseEntity<ShippingOptions> getShippingOptions(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
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
        @ApiParam(value = "This is true is the address is foreign. False otherwise.", required = true) @RequestParam(value = "foreign", required = true) Boolean foreign) {
        // do some magic!
        return new ResponseEntity<ShippingOptions>(HttpStatus.OK);
    }

}
