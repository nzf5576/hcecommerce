package io.swagger.api;

import io.swagger.model.Confirmations;
import io.swagger.model.Errors;
import io.swagger.model.IntegratedMessage;
import io.swagger.model.Order;
import io.swagger.model.OrderSummaries;
import io.swagger.model.PriceConfirmation;

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

@Api(value = "order", description = "the order API")
public interface OrderApi {

    @ApiOperation(value = "Get Last Order Repriced", notes = "Fetch the customer's last order, repriced, and with suitable substitutes for any unavailable products. Note that the order includes line items for the check product and accessories ordered on the same day This service fetches the full details the last order, repriced, with any unavailable products substituted with suitable replacements.", response = Order.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "checks", description = "Grants access to order review order history, browse catalog, and order checks.")
            }),
        @Authorization(value = "key")
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Last order was found and repriced", response = Order.class),
        @ApiResponse(code = 401, message = "Authorization failed. Use the getToken service to obtain a valid token.", response = Order.class),
        @ApiResponse(code = 403, message = "The application has understood the request but refuses to fulfill it because of business validation error.", response = Order.class),
        @ApiResponse(code = 404, message = "Invalid customerId or there is no historical order.", response = Order.class),
        @ApiResponse(code = 500, message = "A technical issue prevents fulfilling the request (application error).", response = Order.class),
        @ApiResponse(code = 503, message = "The application is not available.", response = Order.class),
        @ApiResponse(code = 504, message = "There is a break in the service chain that prevents fulfilling the request.", response = Order.class),
        @ApiResponse(code = 200, message = "Unexpected Error", response = Order.class) })
    @RequestMapping(value = "/order/lastrepriced/{customerId}",
        produces = { "application/json", "text/xml" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Order> getLastOrderRepriced(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "Defaults that should be applied to the last order before repricing it. "  ) @RequestBody IntegratedMessage body);


    @ApiOperation(value = "Get Historical Orders", notes = "Given a customerId, get their (historical) orders. This service returns a collection of links to orders and summaries.", response = OrderSummaries.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "checks", description = "Grants access to order review order history, browse catalog, and order checks.")
            }),
        @Authorization(value = "key")
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = OrderSummaries.class),
        @ApiResponse(code = 401, message = "Authorization failed. Use the getToken service to obtain a valid token.", response = OrderSummaries.class),
        @ApiResponse(code = 403, message = "The application has understood the request but refuses to fulfill it because of business validation error.", response = OrderSummaries.class),
        @ApiResponse(code = 404, message = "No historical orders found.", response = OrderSummaries.class),
        @ApiResponse(code = 500, message = "A technical issue prevents fulfilling the request (application error).", response = OrderSummaries.class),
        @ApiResponse(code = 503, message = "The application is not available.", response = OrderSummaries.class),
        @ApiResponse(code = 504, message = "There is a break in the service chain that prevents fulfilling the request.", response = OrderSummaries.class),
        @ApiResponse(code = 200, message = "Unexpected Error", response = OrderSummaries.class) })
    @RequestMapping(value = "/order/orders/{customerId}",
        produces = { "application/json", "text/xml" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.GET)
    ResponseEntity<OrderSummaries> getOrders(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId);


    @ApiOperation(value = "(Re)calculate the price.", notes = "(Re)calculate the prices of the various line items, shipping options, taxes etc. of the order.", response = PriceConfirmation.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "checks", description = "Grants access to order review order history, browse catalog, and order checks.")
            }),
        @Authorization(value = "key")
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The order was successfully priced. The service recalculates all prices, taxes etc.", response = PriceConfirmation.class),
        @ApiResponse(code = 202, message = "The order was only partially priced. The error structure indicates the reason for the partial price update. This is a platform specific response that may occur when the platform treats line items as orders in their own right. ", response = PriceConfirmation.class),
        @ApiResponse(code = 400, message = "The system has refused to price the order because the body is invalid (format errors).", response = PriceConfirmation.class),
        @ApiResponse(code = 401, message = "Authorization failed. Use the getToken service to obtain a valid token.", response = PriceConfirmation.class),
        @ApiResponse(code = 403, message = "The application has understood the request but refuses to fulfill it because of business validation error.", response = PriceConfirmation.class),
        @ApiResponse(code = 500, message = "A technical issue prevents fulfilling the request (application error).", response = PriceConfirmation.class),
        @ApiResponse(code = 503, message = "The application is not available.", response = PriceConfirmation.class),
        @ApiResponse(code = 504, message = "There is a break in the service chain that prevents fulfilling the request.", response = PriceConfirmation.class),
        @ApiResponse(code = 200, message = "Unexpected Error", response = PriceConfirmation.class) })
    @RequestMapping(value = "/order/price",
        produces = { "application/json", "text/xml" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.POST)
    ResponseEntity<PriceConfirmation> priceOrder(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The order to be priced" ,required=true ) @RequestBody Order body);


    @ApiOperation(value = "Submit the order for fulfillment.", notes = "Fetch the customers last order, repriced, and with suitable substitutes for any unavailable products. This service fetches the full details the last order, repriced, with any unavailable products substituted with suitable replacements.", response = Confirmations.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "checks", description = "Grants access to order review order history, browse catalog, and order checks.")
            }),
        @Authorization(value = "key")
    }, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "The order was successfully validated and accepted.", response = Confirmations.class),
        @ApiResponse(code = 202, message = "The order was successfully validated but only partially executed. This is a platform specific response that may occur when the platform treats line items as orders in their own right.", response = Confirmations.class),
        @ApiResponse(code = 400, message = "The system has rejected the order because the body is not valid (format errors).", response = Confirmations.class),
        @ApiResponse(code = 401, message = "Authorization failed. Use the getToken service to obtain a valid token.", response = Confirmations.class),
        @ApiResponse(code = 403, message = "The application has understood the request but refuses to fulfill it because of business validation error.", response = Confirmations.class),
        @ApiResponse(code = 500, message = "A technical issue prevents fulfilling the request (application error).", response = Confirmations.class),
        @ApiResponse(code = 503, message = "The application is not available.", response = Confirmations.class),
        @ApiResponse(code = 504, message = "There is a break in the service chain that prevents fulfilling the request.", response = Confirmations.class),
        @ApiResponse(code = 200, message = "Unexpected Error", response = Confirmations.class) })
    @RequestMapping(value = "/order",
        produces = { "application/json", "text/xml" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.PUT)
    ResponseEntity<Confirmations> submitOrder(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The order to be submitted" ,required=true ) @RequestBody Order body);

}
