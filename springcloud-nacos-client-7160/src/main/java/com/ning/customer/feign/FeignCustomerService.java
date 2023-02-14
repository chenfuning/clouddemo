package com.ning.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dell
 */
@FeignClient("springcloud-nacos-client-provider")
public interface FeignCustomerService {
    @RequestMapping (value = "/echo")
    public String echo(@RequestParam("name") String name);
}
