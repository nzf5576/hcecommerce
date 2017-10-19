package io.swagger.api;

import io.swagger.model.CheckPreview;
import io.swagger.model.CheckPreviewOptions;
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

@Api(value = "check", description = "the check API")
public interface CheckApi {

    @ApiOperation(value = "Get the preview of a check product.", notes = "Generate the preview of a check (in binary format) given a description of the check. ** Note that the check description, and name, url of the accent symbol, font, and one-liner as well as prices are optional for this service. ** ", response = CheckPreview.class, authorizations = {
        @Authorization(value = "oauth", scopes = {
            @AuthorizationScope(scope = "checks", description = "Grants access to order review order history, browse catalog, and order checks.")
            }),
        @Authorization(value = "key")
    }, tags={ "Check", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The preview generation was successful. Returns a base64 encoded image.", response = CheckPreview.class),
        @ApiResponse(code = 400, message = "The system has refused to generate a preview because of incorrectly formatted input.", response = CheckPreview.class),
        @ApiResponse(code = 401, message = "Authorization failed. Use the getToken service to obtain a valid token.", response = CheckPreview.class),
        @ApiResponse(code = 403, message = "The application has understood the request but refuses to fulfill it because of business validation error.", response = CheckPreview.class),
        @ApiResponse(code = 500, message = "A technical issue prevents fulfilling the request (application error).", response = CheckPreview.class),
        @ApiResponse(code = 503, message = "The application is not available.", response = CheckPreview.class),
        @ApiResponse(code = 504, message = "There is a break in the service chain that prevents fulfilling the request.", response = CheckPreview.class),
        @ApiResponse(code = 200, message = "Unexpected Error", response = CheckPreview.class) })
    @RequestMapping(value = "/check/preview/{customerId}",
        produces = { "image/png", "image/jpeg", "application/json" }, 
        consumes = { "application/json", "text/xml" },
        method = RequestMethod.POST)
    ResponseEntity<CheckPreview> previewCheck(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "A description of the check product to preview." ,required=true ) @RequestBody CheckPreviewOptions body);

}
