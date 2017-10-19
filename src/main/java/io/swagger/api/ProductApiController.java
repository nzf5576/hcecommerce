package io.swagger.api;

import io.swagger.model.Accessories;
import io.swagger.model.AccessoryCategory;
import io.swagger.model.Errors;
import io.swagger.model.Prices;
import io.swagger.model.Product;

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
public class ProductApiController implements ProductApi {

    public ResponseEntity<AccessoryCategory> getAccentSymbolCategories(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier for the check product.",required=true ) @PathVariable("productId") String productId) {
        // do some magic!
        return new ResponseEntity<AccessoryCategory>(HttpStatus.OK);
    }

    public ResponseEntity<AccessoryCategory> getAccentSymbols(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier for the check product.",required=true ) @PathVariable("productId") String productId,
        @ApiParam(value = "The code of the category used to filter the accent symbols. Use 'all' if there is no filtering using categories.",required=true ) @PathVariable("category") String category,
        @ApiParam(value = "A filter to apply to the results. Valid are [ all | recommended | default | accentId ]",required=true ) @PathVariable("filter") String filter,
        @ApiParam(value = "The index of the first accent symbol desired in the result set.",required=true ) @PathVariable("from") Integer from,
        @ApiParam(value = "The desired index to the start of the next page (if there is one).",required=true ) @PathVariable("to") Integer to) {
        // do some magic!
        return new ResponseEntity<AccessoryCategory>(HttpStatus.OK);
    }

    public ResponseEntity<Accessories> getAccessories(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier for the check product.",required=true ) @PathVariable("productId") String productId,
        @ApiParam(value = "The index of the first accessory desired in the result set if there is an accessory available.",required=true ) @PathVariable("from") Integer from,
        @ApiParam(value = "The desired index to the start of the next page (if there is one).",required=true ) @PathVariable("to") Integer to) {
        // do some magic!
        return new ResponseEntity<Accessories>(HttpStatus.OK);
    }

    public ResponseEntity<AccessoryCategory> getBackgrounds(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier for the check product.",required=true ) @PathVariable("productId") String productId,
        @ApiParam(value = "The code of the category used to filter the accent symbols. Use 'all' if there is no filtering using categories.",required=true ) @PathVariable("category") String category,
        @ApiParam(value = "A filter to apply to the results. Valid are [ all | recommended | default | accentId ]",required=true ) @PathVariable("filter") String filter,
        @ApiParam(value = "The index of the first accent symbol desired in the result set.",required=true ) @PathVariable("from") Integer from,
        @ApiParam(value = "The desired index to the start of the next page (if there is one).",required=true ) @PathVariable("to") Integer to) {
        // do some magic!
        return new ResponseEntity<AccessoryCategory>(HttpStatus.OK);
    }

    public ResponseEntity<AccessoryCategory> getOneLinerCategories(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier for the check product.",required=true ) @PathVariable("productId") String productId) {
        // do some magic!
        return new ResponseEntity<AccessoryCategory>(HttpStatus.OK);
    }

    public ResponseEntity<AccessoryCategory> getOneLiners(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier for the check product.",required=true ) @PathVariable("productId") String productId,
        @ApiParam(value = "The code of the category used to filter the OneLiners. Use 'all' if there is no filtering using categories.",required=true ) @PathVariable("category") String category,
        @ApiParam(value = "A filter to apply to the results. Valid are [ all | recommended | default ]",required=true ) @PathVariable("filter") String filter,
        @ApiParam(value = "The index of the first expression desired in the result set.",required=true ) @PathVariable("from") Integer from,
        @ApiParam(value = "The desired index to the start of the next page (if there is one).",required=true ) @PathVariable("to") Integer to) {
        // do some magic!
        return new ResponseEntity<AccessoryCategory>(HttpStatus.OK);
    }

    public ResponseEntity<Prices> getPrices(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier for the product.",required=true ) @PathVariable("productId") String productId,
        @ApiParam(value = "The quantity to be priced.") @RequestParam(value = "quantity", required = false) Integer quantity,
        @ApiParam(value = "The unit of the quantity to be priced e.g. boxes.") @RequestParam(value = "unit", required = false) String unit) {
        // do some magic!
        return new ResponseEntity<Prices>(HttpStatus.OK);
    }

    public ResponseEntity<Product> getProduct(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier for the check product.",required=true ) @PathVariable("productId") String productId) {
        // do some magic!
        return new ResponseEntity<Product>(HttpStatus.OK);
    }

}
