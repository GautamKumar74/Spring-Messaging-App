package com.tit.uc5.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // PUT Request: curl -X PUT "localhost:8080/hello/put/Mark?lastName=Taylor" -w "\n"
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}

