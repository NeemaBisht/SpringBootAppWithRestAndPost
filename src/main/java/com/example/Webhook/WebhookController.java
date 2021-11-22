package com.example.Webhook;

import java.net.URLDecoder;
;import java.net.http.HttpResponse;import java.nio.charset.StandardCharsets;import java.util.Map;import javax.servlet.http.HttpServletRequest;import org.apache.coyote.Response;import org.springframework.http.HttpStatus;import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.RequestBody;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RequestMethod;import org.springframework.web.bind.annotation.RequestParam;import org.springframework.web.bind.annotation.ResponseBody;import org.springframework.web.bind.annotation.ResponseStatus;import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;

@RestController
@RequestMapping("/webhookTest")
public class WebhookController {

      @RequestMapping(value = "Check1", method = RequestMethod.POST, produces = {"text/plain"})
    	public ResponseEntity getWebhookData(@RequestParam("validationToken") String validationToken) throws Exception {
        System.out.println("webhoooook : "+validationToken);
        org.springframework.http.HttpHeaders httpHeaders = new HttpHeaders();
          httpHeaders.setContentType(org.springframework.http.MediaType.TEXT_PLAIN);
              String result = java.net.URLDecoder.decode(validationToken, StandardCharsets.UTF_8.name());

          return new ResponseEntity(result, httpHeaders, HttpStatus.OK);
        //return validationToken;

      }

      @RequestMapping(value = "Check2", method = RequestMethod.GET)
    	public void getWebhookDataCHECK2() {
        System.out.println("webhoooook : ");
}
}
