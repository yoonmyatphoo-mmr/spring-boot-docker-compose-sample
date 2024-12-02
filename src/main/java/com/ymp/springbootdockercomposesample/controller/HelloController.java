package com.ymp.springbootdockercomposesample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: yoon-myat-phoo
 * created: 28/11/2024 - 9:17 AM
 * project: spring-boot-docker-compose-sample
 * package: com.ymp.springbootdockercomposesample.controller
 */

@RestController
public class HelloController {

    /**
     * This is demo project for docker and so, I won't add many APIs and logic.
     */
    @GetMapping("/getHello")
    public String getHello(){
        return "Hello from Dockerized application";
    }
}
