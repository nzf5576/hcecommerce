package io.swagger.api;

import io.swagger.model.Confirmations;
import io.swagger.model.Errors;
import io.swagger.model.IntegratedMessage;
import io.swagger.model.Order;
import io.swagger.model.OrderSummaries;
import io.swagger.model.PriceConfirmation;

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
public class OrderApiController implements OrderApi {

    public ResponseEntity<Order> getLastOrderRepriced(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "Defaults that should be applied to the last order before repricing it. "  ) @RequestBody IntegratedMessage body) {
        // do some magic!
        return new ResponseEntity<Order>(HttpStatus.OK);
    }

    public ResponseEntity<OrderSummaries> getOrders(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId) {
        // do some magic!
        return new ResponseEntity<OrderSummaries>(HttpStatus.OK);
    }

    public ResponseEntity<PriceConfirmation> priceOrder(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The order to be priced" ,required=true ) @RequestBody Order body) {
        // do some magic!
        return new ResponseEntity<PriceConfirmation>(HttpStatus.OK);
    }

    public ResponseEntity<Confirmations> submitOrder(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The order to be submitted" ,required=true ) @RequestBody Order body) {
        // do some magic!
        return new ResponseEntity<Confirmations>(HttpStatus.OK);
    }

}
