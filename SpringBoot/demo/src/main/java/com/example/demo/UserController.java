package com.example.demo;
import
        org.springframework.web.bind.annotation.GetMapping;
import
        org.springframework.web.bind.annotation.RestController;
import java.util.Map;
@RestController
public class UserController {
    @GetMapping("/")
    public Map<String, String> getUser() {
        return Map.of(
                "id", "1",
                "name", "Leanne Graham",
                "email", "leanne@example.com"
        );
    }
}