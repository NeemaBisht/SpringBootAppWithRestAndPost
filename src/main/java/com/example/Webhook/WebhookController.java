package com.example.Webhook;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

;

@RestController
@RequestMapping("/webhookTest")
public class WebhookController {

    Logger log = Logger.getLogger(String.valueOf(WebhookController.class));

    // for Teams calls
    @RequestMapping(value = "Check1", method = RequestMethod.POST, produces = {
        "text/plain"}, consumes = {"text/plain"})
    public ResponseEntity getWebhookData(
        @RequestParam(value = "validationToken", required = false) String validationToken,
        @RequestBody(required = false) String callRecord)  {
        System.out.println("Check1 Teams calls: " + validationToken);
        log.info("Check1 Teams calls: " + validationToken);
        if (callRecord != null) {
            System.out.println("Check1 Teams calls " + callRecord);
            log.info("Check1  Teams calls: " + callRecord);

        }

        org.springframework.http.HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(org.springframework.http.MediaType.TEXT_PLAIN);
        //String result = java.net.URLDecoder.decode(validationToken, StandardCharsets.UTF_8.name());
        return new ResponseEntity(validationToken, httpHeaders, HttpStatus.OK);

    }

    // for audit.sharepoint
    @RequestMapping(value = "Check3", method = RequestMethod.POST, consumes = {"application/json"})
    public ResponseEntity getWebhookDataCheck3(
        @RequestParam(value = "validationCode", required = false) String validationCode,
        @RequestParam(value = "validationToken", required = false) String validationToken,
        @RequestBody(required = false) String data) throws Exception {
        System.out.println("Check3 sharepoint: " + validationToken);
        log.info("Check3 sharepoint:{}" + data);
        if (data != null) {
            System.out.println("Check3  sharepoint: " + data);
            log.info("Check3 sharepoint: " + data);
        }

        org.springframework.http.HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAcceptCharset(Arrays.asList(Charset.forName("UTF-8")));
        httpHeaders.setContentType(org.springframework.http.MediaType.TEXT_PLAIN);
        return new ResponseEntity(httpHeaders, HttpStatus.OK);


    }

    // for audit general
    @RequestMapping(value = "Check4", method = RequestMethod.POST, consumes = {"application/json"})
    public ResponseEntity getWebhookDataCheck4(
        @RequestParam(value = "validationCode", required = false) String validationCode,
        @RequestParam(value = "validationToken", required = false) String validationToken,
        @RequestBody(required = false) String data) throws Exception {
        System.out.println("Check4 audit.general : " + validationToken);
        log.info("Check4 audit.general : " + data);
        if (data != null) {
            System.out.println("Check4 audit.general : " + data);
            log.info("Check4 audit.general" + data);
        }

        org.springframework.http.HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAcceptCharset(Arrays.asList(Charset.forName("UTF-8")));
        httpHeaders.setContentType(org.springframework.http.MediaType.TEXT_PLAIN);
        return new ResponseEntity(httpHeaders, HttpStatus.OK);


    }

    // For audit.exchange
    @RequestMapping(value = "Check5", method = RequestMethod.POST, consumes = {"application/json"})
    public ResponseEntity getWebhookDataCheck5(
        @RequestParam(value = "validationCode", required = false) String validationCode,
        @RequestParam(value = "validationToken", required = false) String validationToken,
        @RequestBody(required = false) String data) throws Exception {
        System.out.println("Check5 audit.exchange  : " + validationToken);
        log.info("Check5 audit.exchange : " + data);
        if (data != null) {
            System.out.println("Check5 audit.exchange  : " + data);
            log.info("Check5 audit.exchange : " + data);
        }

        org.springframework.http.HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAcceptCharset(Arrays.asList(Charset.forName("UTF-8")));

        httpHeaders.setContentType(org.springframework.http.MediaType.TEXT_PLAIN);
        return new ResponseEntity(httpHeaders, HttpStatus.OK);


    }


    // For Active directory
    @RequestMapping(value = "Check6", method = RequestMethod.POST, consumes = {"application/json"})
    public ResponseEntity getWebhookDataCheck6(
        @RequestParam(value = "validationCode", required = false) String validationCode,
        @RequestParam(value = "validationToken", required = false) String validationToken,
        @RequestBody(required = false) String data) throws Exception {
        System.out.println("Check6 Active directory data  : " + validationToken);
        log.info("Check6 Active directory data : " + data);
        if (data != null) {
            System.out.println("Check6 Active directory  : " + data);
            log.info("Check6 Active directory : " + data);
        }

        org.springframework.http.HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAcceptCharset(Arrays.asList(Charset.forName("UTF-8")));
        httpHeaders.setContentType(org.springframework.http.MediaType.TEXT_PLAIN);

        return new ResponseEntity(httpHeaders, HttpStatus.OK);


    }

    // For DLP.All
    @RequestMapping(value = "Check7", method = RequestMethod.POST, consumes = {"application/json"})
    public ResponseEntity getWebhookDataCheck7(
        @RequestParam(value = "validationCode", required = false) String validationCode,
        @RequestParam(value = "validationToken", required = false) String validationToken,
        @RequestBody(required = false) String data) throws Exception {
        System.out.println("Check7 DLP.All  : " + validationToken);
        log.info("Check7 DLP.All : " + data);
        if (data != null) {
            System.out.println("Check7 DLP.All  : " + data);
            log.info("Check7 DLP.All : " + data);
        }

        org.springframework.http.HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAcceptCharset(Arrays.asList(Charset.forName("UTF-8")));
        httpHeaders.setContentType(org.springframework.http.MediaType.TEXT_PLAIN);

        return new ResponseEntity(httpHeaders, HttpStatus.OK);


    }

    @RequestMapping(value = "Check2", method = RequestMethod.GET)
    public String getWebhookDataCHECK2() {
        log.info("webhook neema Its get call");
        return "Get Call";
    }
}
