package com.ning.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication7130 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication7130.class, args);
    }
}
