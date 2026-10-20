package com.example.pathvariable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api/users")
public class UserController {
    // In-memory list of demo users
    private List<String> users = new ArrayList<>();
    // Constructor to add demo users
    public UserController() {
        users.add("ABHI");
        users.add("Bhatnagar");
        users.add("Shivam");
    }
    // Get all users
    @GetMapping
    public List<String> getAllUsers() {
        return users;
    }
    // Get user by ID
    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id) {
        if (id < 0 || id >= users.size()) {
            return "User not found";
        }
        return users.get(id);
    }
}