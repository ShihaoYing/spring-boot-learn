package com.creamy.springboot.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${wife.name}")
    private String wifeName;

    @Value("${pet.name}")
    private String petName;

    // expose"/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Welcome Home! Charles "+wifeName+" and "+petName;

    }
}
