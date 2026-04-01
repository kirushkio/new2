package com.example.greeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    // Show login page
    @GetMapping("/")
    public String showLoginPage() {
        return "login"; // loads login.html
    }

    // Handle login
    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestParam String username,
                        @RequestParam String password) {

        if ("admin".equals(username) && "1234".equals(password)) {
            return "Login Successful!";
        } else {
            return "Invalid Credentials!";
        }
    }
}