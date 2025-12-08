package com.boot_learning_lab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/greet")
    public String greet(){
        return "Good Morning";
    }

    @GetMapping("/bye")
    public String bye(){
        return "See you soon";
    }
}
