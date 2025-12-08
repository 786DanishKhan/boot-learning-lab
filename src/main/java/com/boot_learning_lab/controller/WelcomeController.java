package com.boot_learning_lab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/")
    public String welcome(){
        return "welcome to boot learning lab";
    }

    @GetMapping("/welcome")
    public String sayWelcome(){
        return "Say Welcome";
    }
}
