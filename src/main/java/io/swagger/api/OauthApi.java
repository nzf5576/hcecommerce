package io.swagger.api;

import io.swagger.model.Authorization;
import io.swagger.model.Errors;

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

@Api(value = "oauth", description = "the oauth API")
public interface OauthApi {

    @ApiOperation(value = "Acquires an authorization token given an account number and transit routing number.", notes = "", response = Authorization.class, tags={ "Authentication", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Authorization.class),
        @ApiResponse(code = 401, message = "Authorization failed. Use the getToken service to obtain a valid token.", response = Authorization.class),
        @ApiResponse(code = 500, message = "A technical issue prevents fulfilling the request (application error).", response = Authorization.class),
        @ApiResponse(code = 503, message = "The application is not available.", response = Authorization.class),
        @ApiResponse(code = 504, message = "There is a break in the service chain that prevents fulfilling the request.", response = Authorization.class),
        @ApiResponse(code = 200, message = "Unexpected Error", response = Authorization.class) })
    @RequestMapping(value = "/oauth/token",
        produces = { "application/json", "text/xml" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.GET)
    ResponseEntity<Authorization> getToken(@ApiParam(value = "The grant_type. This is always 'password'", required = true, defaultValue = "password") @RequestParam(value = "grantType", required = true, defaultValue="password") String grantType,
        @ApiParam(value = "The client Id assigned to the caller (Obtained from the API Manager and assigned to the application).", required = true) @RequestParam(value = "clientId", required = true) String clientId,
        @ApiParam(value = "The customer's account number.", required = true) @RequestParam(value = "username", required = true) String username,
        @ApiParam(value = "The customer's transit routing number.", required = true) @RequestParam(value = "password", required = true) String password,
        @ApiParam(value = "The security scope for the token e.g. 'checks'.", required = true, defaultValue = "checks") @RequestParam(value = "scope", required = true, defaultValue="checks") String scope);

}
