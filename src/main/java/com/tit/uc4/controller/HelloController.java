package com.tit.uc4.controller;

import com.tit.uc4.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // POST Request with JSON Body: curl -X POST -H "Content-Type: application/json" -d '{"firstName": "Mark","lastName": "Taylor"}' "http://localhost:8080/hello/post" -w "\n"
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
