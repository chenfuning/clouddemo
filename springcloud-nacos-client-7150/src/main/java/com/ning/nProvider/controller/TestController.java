package com.ning.nProvider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("$user.name")
    private String user;
    @GetMapping(value = "/echo")
    public String echo(@RequestParam("name") String name) {
        return "Hello Nacos Discovery " + name+user;
    }
}
