package io.swagger.api;

import io.swagger.model.Errors;
import io.swagger.model.Institution;
import io.swagger.model.IntegratedMessage;

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

@Api(value = "institution", description = "the institution API")
public interface InstitutionApi {

    @ApiOperation(value = "Fetches institution specific branding information for a customer.", notes = "Given a customerId, get details of the institution. This service fetches the details of the institution identified by the given routing number", response = Institution.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "checks", description = "Grants access to order review order history, browse catalog, and order checks.")
            }),
        @Authorization(value = "key")
    }, tags={ "Institution", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Institution.class),
        @ApiResponse(code = 401, message = "Authorization failed. Use the getToken service to obtain a valid token.", response = Institution.class),
        @ApiResponse(code = 403, message = "The application has understood the request but refuses to fulfill it because of business validation error.", response = Institution.class),
        @ApiResponse(code = 404, message = "Invalid transit routing number or customerId", response = Institution.class),
        @ApiResponse(code = 500, message = "A technical issue prevents fulfilling the request (application error).", response = Institution.class),
        @ApiResponse(code = 503, message = "The application is not available.", response = Institution.class),
        @ApiResponse(code = 504, message = "There is a break in the service chain that prevents fulfilling the request.", response = Institution.class),
        @ApiResponse(code = 200, message = "Unexpected Error", response = Institution.class) })
    @RequestMapping(value = "/institution/{customerId}",
        produces = { "application/json", "text/xml" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Institution> getInstitution(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "Defaults that should be applied to the institution settings. "  ) @RequestBody IntegratedMessage body);

}
