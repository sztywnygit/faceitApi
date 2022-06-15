package com.faceyourstats.api;

import com.faceyourstats.model.CSGO_Player;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import util.Json;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping(value = "/profile")
public  class CSGO_FaceitApi {

    private final RestTemplate restTemplate;

    @Autowired
    public CSGO_FaceitApi(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/{player}")
    @CrossOrigin
    public Object getPlayerInfo(HttpServletRequest request){

        String stats;
        try {
            stats = restTemplate.getForObject(request.getRequestURL().toString() + "/api", String.class);
        }
        catch (Exception e){
            return new JSONObject()
                    .put("Error","User not found")
                    .toString();
        }

        CSGO_Player CSGOPlayer = Json.mapPlayer(Json.parse(stats));
        return CSGOPlayer;

    }



}