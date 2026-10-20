package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/hello") // handles GET request to root URL
    public String home() {
        return "Hello, From Spring Boot!";
    }
}