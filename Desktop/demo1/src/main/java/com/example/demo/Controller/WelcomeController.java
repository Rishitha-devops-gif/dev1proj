package com.example.demo.Controller;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class WelcomeController {
 
    @GetMapping("/")
    public String welcomeMessage() {
        return "Welcome to Spring Boot Application!";
    }
    @GetMapping("/hello")
    public String welcomeMessage2() {
        return "Welcome";
    }
}