package io.swagger.api;

import io.swagger.model.CheckPreview;
import io.swagger.model.CheckPreviewOptions;
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
public class CheckApiController implements CheckApi {

    public ResponseEntity<CheckPreview> previewCheck(@ApiParam(value = "The clientId and token e.g. CREDENTIAL: token APIKEY: clientId" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The customer identifier.",required=true ) @PathVariable("customerId") String customerId,
        @ApiParam(value = "A description of the check product to preview." ,required=true ) @RequestBody CheckPreviewOptions body) {
        // do some magic!
        return new ResponseEntity<CheckPreview>(HttpStatus.OK);
    }

}
