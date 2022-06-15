package com.faceyourstats.api;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RestController
@RequestMapping(value = "/profile", produces = MediaType.APPLICATION_JSON_VALUE)
public class FaceitApi {


    private final RestTemplate restTemplate;

    @Value("${api-key}")
    private String api_key;

    @Autowired
    public FaceitApi(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @RequestMapping(value = "/{player}/api", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getInfoFromFaceitApi(@PathVariable("player") String player)  {

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", api_key);
        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
        ResponseEntity<String> response;
        try {
             response = restTemplate.exchange("https://open.faceit.com/data/v4/players?nickname=" + player,
                    HttpMethod.GET, requestEntity, String.class);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
            if (response.getStatusCode().value() == 200) return response;
        else return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);

    }
}
