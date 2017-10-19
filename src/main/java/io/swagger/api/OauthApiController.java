package io.swagger.api;

import io.swagger.model.Authorization;
import io.swagger.model.Errors;

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
public class OauthApiController implements OauthApi {

    public ResponseEntity<Authorization> getToken(@ApiParam(value = "The grant_type. This is always 'password'", required = true, defaultValue = "password") @RequestParam(value = "grantType", required = true, defaultValue="password") String grantType,
        @ApiParam(value = "The client Id assigned to the caller (Obtained from the API Manager and assigned to the application).", required = true) @RequestParam(value = "clientId", required = true) String clientId,
        @ApiParam(value = "The customer's account number.", required = true) @RequestParam(value = "username", required = true) String username,
        @ApiParam(value = "The customer's transit routing number.", required = true) @RequestParam(value = "password", required = true) String password,
        @ApiParam(value = "The security scope for the token e.g. 'checks'.", required = true, defaultValue = "checks") @RequestParam(value = "scope", required = true, defaultValue="checks") String scope) {
        // do some magic!
        return new ResponseEntity<Authorization>(HttpStatus.OK);
    }

}
