package com.ning.customer.controller;

import com.ning.customer.feign.FeignCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCustomerController {
    @Autowired
    private FeignCustomerService feignCustomerService;

    @GetMapping(value = "/show")
    public String show(@RequestParam("name") String name) {
        System.out.println(name);
        return feignCustomerService.echo(name);
    }
}
