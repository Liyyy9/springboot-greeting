package com.liyana.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")                    // user requests for the website w/o additional url info
    public String index(){
        return "Greetings from Spring Boot!";
    }

}
