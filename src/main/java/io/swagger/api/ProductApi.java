package io.swagger.api;

import io.swagger.model.Accessories;
import io.swagger.model.AccessoryCategory;
import io.swagger.model.Errors;
import io.swagger.model.Prices;
import io.swagger.model.Product;

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

@Api(value = "product", description = "the product API")
public interface ProductApi {

    @ApiOperation(value = "Get the categories used to group accent symbols (pridemarks) for the indicated product, offered to the customer.", notes = "Given a customerId and productId, get the available accent symbol categories. ", response = AccessoryCategory.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "checks", description = "Grants access to order review order history, browse catalog, and order checks.")
            }),
        @Authorization(value = "key")
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = AccessoryCategory.class),
        @ApiResponse(code = 401, message = "Authorization failed. Use the getToken service to obtain a valid token.", response = AccessoryCategory.class),
        @ApiResponse(code = 403, message = "The application has understood the request but refuses to fulfill it because of business validation error.", response = AccessoryCategory.class),
        @ApiResponse(code = 404, message = "Invalid customerId or Invalid productId.", response = AccessoryCategory.class),
        @ApiResponse(code = 500, message = "A technical issue prevents fulfilling the request (application error).", response = AccessoryCategory.class),
        @ApiResponse(code = 503, message = "The application is not available.", response = AccessoryCategory.class),
        @ApiResponse(code = 504, message = "There is a break in the service chain that prevents fulfilling the request.", response = AccessoryCategory.class),
        @ApiResponse(code = 200, message = "Unexpected Error", response = AccessoryCategory.class) })
    @RequestMapping(value = "/product/accentsymbol/categories/{customerId}/{productId}",
        produces = { "application/json", "text/xml" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.GET)
    ResponseEntity<AccessoryCategory> getAccentSymbolCategories(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier for the check product.",required=true ) @PathVariable("productId") String productId);


    @ApiOperation(value = "Get accent symbols for the indicated product, offered to the customer.", notes = "Given a customerId and productId, get the corresponding accent symbols on offer. This service implements paging. 0 &lt;= Number of accent symbols &lt; to - from. Given 10 possible accent symbols and (from, to) = (0, 5), there are 5 items in the result set. The caller may filter by category or for selected accent symbols using 'filter'. The 'filter' parameter allows the caller to request the default, recommended, or all accent symbols. ", response = AccessoryCategory.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "checks", description = "Grants access to order review order history, browse catalog, and order checks.")
            }),
        @Authorization(value = "key")
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = AccessoryCategory.class),
        @ApiResponse(code = 401, message = "Authorization failed. Use the getToken service to obtain a valid token.", response = AccessoryCategory.class),
        @ApiResponse(code = 403, message = "The application has understood the request but refuses to fulfill it because of business validation error.", response = AccessoryCategory.class),
        @ApiResponse(code = 404, message = "Invalid customerId or Invalid productId, No accent symbols found.", response = AccessoryCategory.class),
        @ApiResponse(code = 500, message = "A technical issue prevents fulfilling the request (application error).", response = AccessoryCategory.class),
        @ApiResponse(code = 503, message = "The application is not available.", response = AccessoryCategory.class),
        @ApiResponse(code = 504, message = "There is a break in the service chain that prevents fulfilling the request.", response = AccessoryCategory.class),
        @ApiResponse(code = 200, message = "Unexpected Error", response = AccessoryCategory.class) })
    @RequestMapping(value = "/product/accentsymbols/{customerId}/{productId}/{category}/{filter}/{from}/{to}",
        produces = { "application/json", "text/xml" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.GET)
    ResponseEntity<AccessoryCategory> getAccentSymbols(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier for the check product.",required=true ) @PathVariable("productId") String productId,
        @ApiParam(value = "The code of the category used to filter the accent symbols. Use 'all' if there is no filtering using categories.",required=true ) @PathVariable("category") String category,
        @ApiParam(value = "A filter to apply to the results. Valid are [ all | recommended | default | accentId ]",required=true ) @PathVariable("filter") String filter,
        @ApiParam(value = "The index of the first accent symbol desired in the result set.",required=true ) @PathVariable("from") Integer from,
        @ApiParam(value = "The desired index to the start of the next page (if there is one).",required=true ) @PathVariable("to") Integer to);


    @ApiOperation(value = "Get accessories for the indicated product, offered to the customer.", notes = "Given a customerId and productId, get the corresponding accessories on offer. This service implements paging. 0 &lt;= Number of Accessories &lt; to - from. Given 10 possible accessories and (from, to) = (0, 5), there are 5 items in the result set. ", response = Accessories.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "checks", description = "Grants access to order review order history, browse catalog, and order checks.")
            }),
        @Authorization(value = "key")
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Accessories.class),
        @ApiResponse(code = 401, message = "Authorization failed. Use the getToken service to obtain a valid token.", response = Accessories.class),
        @ApiResponse(code = 403, message = "The application has understood the request but refuses to fulfill it because of business validation error.", response = Accessories.class),
        @ApiResponse(code = 404, message = "Invalid customerId or Invalid productId, No accessories found.", response = Accessories.class),
        @ApiResponse(code = 500, message = "A technical issue prevents fulfilling the request (application error).", response = Accessories.class),
        @ApiResponse(code = 503, message = "The application is not available.", response = Accessories.class),
        @ApiResponse(code = 504, message = "There is a break in the service chain that prevents fulfilling the request.", response = Accessories.class),
        @ApiResponse(code = 200, message = "Unexpected Error", response = Accessories.class) })
    @RequestMapping(value = "/product/accessories/{customerId}/{productId}/{from}/{to}",
        produces = { "application/json", "text/xml" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.GET)
    ResponseEntity<Accessories> getAccessories(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier for the check product.",required=true ) @PathVariable("productId") String productId,
        @ApiParam(value = "The index of the first accessory desired in the result set if there is an accessory available.",required=true ) @PathVariable("from") Integer from,
        @ApiParam(value = "The desired index to the start of the next page (if there is one).",required=true ) @PathVariable("to") Integer to);


    @ApiOperation(value = "Get accent symbols for the indicated product, offered to the customer.", notes = "Given a customerId and productId, get the corresponding accent symbols on offer. This service implements paging. 0 &lt;= Number of accent symbols &lt; to - from. Given 10 possible accent symbols and (from, to) = (0, 5), there are 5 items in the result set. The caller may filter by category or for selected accent symbols using 'filter'. The 'filter' parameter allows the caller to request the default, recommended, or all accent symbols. ", response = AccessoryCategory.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "checks", description = "Grants access to order review order history, browse catalog, and order checks.")
            }),
        @Authorization(value = "key")
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = AccessoryCategory.class),
        @ApiResponse(code = 401, message = "Authorization failed. Use the getToken service to obtain a valid token.", response = AccessoryCategory.class),
        @ApiResponse(code = 403, message = "The application has understood the request but refuses to fulfill it because of business validation error.", response = AccessoryCategory.class),
        @ApiResponse(code = 404, message = "Invalid customerId or Invalid productId, No accent symbols found.", response = AccessoryCategory.class),
        @ApiResponse(code = 500, message = "A technical issue prevents fulfilling the request (application error).", response = AccessoryCategory.class),
        @ApiResponse(code = 503, message = "The application is not available.", response = AccessoryCategory.class),
        @ApiResponse(code = 504, message = "There is a break in the service chain that prevents fulfilling the request.", response = AccessoryCategory.class),
        @ApiResponse(code = 200, message = "Unexpected Error", response = AccessoryCategory.class) })
    @RequestMapping(value = "/product/backgrounds/{customerId}/{productId}/{category}/{filter}/{from}/{to}",
        produces = { "application/json", "text/xml" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.GET)
    ResponseEntity<AccessoryCategory> getBackgrounds(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier for the check product.",required=true ) @PathVariable("productId") String productId,
        @ApiParam(value = "The code of the category used to filter the accent symbols. Use 'all' if there is no filtering using categories.",required=true ) @PathVariable("category") String category,
        @ApiParam(value = "A filter to apply to the results. Valid are [ all | recommended | default | accentId ]",required=true ) @PathVariable("filter") String filter,
        @ApiParam(value = "The index of the first accent symbol desired in the result set.",required=true ) @PathVariable("from") Integer from,
        @ApiParam(value = "The desired index to the start of the next page (if there is one).",required=true ) @PathVariable("to") Integer to);


    @ApiOperation(value = "Get the categories used to group OneLiners (expressions) for the indicated product, offered to the customer.", notes = "Given a customerId and productId, get the corresponding OneLiners on categories. ", response = AccessoryCategory.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "checks", description = "Grants access to order review order history, browse catalog, and order checks.")
            }),
        @Authorization(value = "key")
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = AccessoryCategory.class),
        @ApiResponse(code = 401, message = "Authorization failed. Use the getToken service to obtain a valid token.", response = AccessoryCategory.class),
        @ApiResponse(code = 403, message = "The application has understood the request but refuses to fulfill it because of business validation error.", response = AccessoryCategory.class),
        @ApiResponse(code = 404, message = "Invalid customerId or Invalid productId.", response = AccessoryCategory.class),
        @ApiResponse(code = 500, message = "A technical issue prevents fulfilling the request (application error).", response = AccessoryCategory.class),
        @ApiResponse(code = 503, message = "The application is not available.", response = AccessoryCategory.class),
        @ApiResponse(code = 504, message = "There is a break in the service chain that prevents fulfilling the request.", response = AccessoryCategory.class),
        @ApiResponse(code = 200, message = "Unexpected Error", response = AccessoryCategory.class) })
    @RequestMapping(value = "/product/oneliner/categories/{customerId}/{productId}",
        produces = { "application/json", "text/xml" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.GET)
    ResponseEntity<AccessoryCategory> getOneLinerCategories(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier for the check product.",required=true ) @PathVariable("productId") String productId);


    @ApiOperation(value = "Get OneLiners (expressions) for the indicated product, offered to the customer.", notes = "Given a customerId and productId, get the corresponding one-liners on offer. This service implements paging. 0 &lt;= Number of one-liners &lt; to - from. Given 10 possible one-liners and (from, to) = (0, 5), there are 5 items in the result set. The caller may filter by category or for selected oneLiners using 'filter'. The 'filter' parameter allows the caller to request the default, recommended, or all one-liners. ", response = AccessoryCategory.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "checks", description = "Grants access to order review order history, browse catalog, and order checks.")
            }),
        @Authorization(value = "key")
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = AccessoryCategory.class),
        @ApiResponse(code = 401, message = "Authorization failed. Use the getToken service to obtain a valid token.", response = AccessoryCategory.class),
        @ApiResponse(code = 403, message = "The application has understood the request but refuses to fulfill it because of business validation error.", response = AccessoryCategory.class),
        @ApiResponse(code = 404, message = "Invalid customerId or Invalid productId, No one-liners found.", response = AccessoryCategory.class),
        @ApiResponse(code = 500, message = "A technical issue prevents fulfilling the request (application error).", response = AccessoryCategory.class),
        @ApiResponse(code = 503, message = "The application is not available.", response = AccessoryCategory.class),
        @ApiResponse(code = 504, message = "There is a break in the service chain that prevents fulfilling the request.", response = AccessoryCategory.class),
        @ApiResponse(code = 200, message = "Unexpected Error", response = AccessoryCategory.class) })
    @RequestMapping(value = "/product/oneliners/{customerId}/{productId}/{category}/{filter}/{from}/{to}",
        produces = { "application/json", "text/xml" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.GET)
    ResponseEntity<AccessoryCategory> getOneLiners(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier for the check product.",required=true ) @PathVariable("productId") String productId,
        @ApiParam(value = "The code of the category used to filter the OneLiners. Use 'all' if there is no filtering using categories.",required=true ) @PathVariable("category") String category,
        @ApiParam(value = "A filter to apply to the results. Valid are [ all | recommended | default ]",required=true ) @PathVariable("filter") String filter,
        @ApiParam(value = "The index of the first expression desired in the result set.",required=true ) @PathVariable("from") Integer from,
        @ApiParam(value = "The desired index to the start of the next page (if there is one).",required=true ) @PathVariable("to") Integer to);


    @ApiOperation(value = "Get price(s) of a product.", notes = "Given a customerId and productId, get the price for the quantity of product. If there is no quantity and unit specified, this returns the prices e.g. tiers for the product. ", response = Prices.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "checks", description = "Grants access to order review order history, browse catalog, and order checks.")
            }),
        @Authorization(value = "key")
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Prices.class),
        @ApiResponse(code = 401, message = "Authorization failed. Use the getToken service to obtain a valid token.", response = Prices.class),
        @ApiResponse(code = 403, message = "The application has understood the request but refuses to fulfill it because of business validation error.", response = Prices.class),
        @ApiResponse(code = 404, message = "Invalid customerId or Invalid productId, no prices found for product", response = Prices.class),
        @ApiResponse(code = 500, message = "A technical issue prevents fulfilling the request (application error).", response = Prices.class),
        @ApiResponse(code = 503, message = "The application is not available.", response = Prices.class),
        @ApiResponse(code = 504, message = "There is a break in the service chain that prevents fulfilling the request.", response = Prices.class),
        @ApiResponse(code = 200, message = "Unexpected Error", response = Prices.class) })
    @RequestMapping(value = "/product/prices/{customerId}/{productId}",
        produces = { "application/json", "text/xml" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.GET)
    ResponseEntity<Prices> getPrices(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier for the product.",required=true ) @PathVariable("productId") String productId,
        @ApiParam(value = "The quantity to be priced.") @RequestParam(value = "quantity", required = false) Integer quantity,
        @ApiParam(value = "The unit of the quantity to be priced e.g. boxes.") @RequestParam(value = "unit", required = false) String unit);


    @ApiOperation(value = "Get Product", notes = "Given a productId, get the full details of the product identified by the productId.", response = Product.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "checks", description = "Grants access to order review order history, browse catalog, and order checks.")
            }),
        @Authorization(value = "key")
    }, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Product.class),
        @ApiResponse(code = 401, message = "Authorization failed. Use the getToken service to obtain a valid token.", response = Product.class),
        @ApiResponse(code = 403, message = "The application has understood the request but refuses to fulfill it because of business validation error.", response = Product.class),
        @ApiResponse(code = 404, message = "Invalid productId.", response = Product.class),
        @ApiResponse(code = 500, message = "A technical issue prevents fulfilling the request (application error).", response = Product.class),
        @ApiResponse(code = 503, message = "The application is not available.", response = Product.class),
        @ApiResponse(code = 504, message = "There is a break in the service chain that prevents fulfilling the request.", response = Product.class),
        @ApiResponse(code = 200, message = "Unexpected Error", response = Product.class) })
    @RequestMapping(value = "/product/{customerId}/{productId}",
        produces = { "application/json", "text/xml" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.GET)
    ResponseEntity<Product> getProduct(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "The product identifier for the check product.",required=true ) @PathVariable("productId") String productId);

}
