package com.tit.uc1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // GET Request to /hello endpoint
    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLabz";
    }
}
