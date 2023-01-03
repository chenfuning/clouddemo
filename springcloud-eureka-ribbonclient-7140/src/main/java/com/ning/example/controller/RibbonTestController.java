package com.ning.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonTestController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/sayRibbon")
    public String sayRibbon(){
        return restTemplate.getForObject("http://springcloud-eureka-client-provider/helloRibbon",
                String.class);
    }

}
