package com.example.githubcicdactiona.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to test endpoint!";
    }
}
