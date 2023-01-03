package com.ning.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRibbonController {
    @Autowired
    Environment environment;

    @GetMapping("/helloRibbon")
    public String helloRibbon(){
        return String.valueOf(environment.getProperty("local.server.port"));
    }

}
