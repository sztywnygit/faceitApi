package com.faceyourstats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

import java.beans.BeanProperty;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class FaceYourStatsApplication {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    };

    public static void main(String[] args) {
        SpringApplication.run(FaceYourStatsApplication.class, args);
    }

}
