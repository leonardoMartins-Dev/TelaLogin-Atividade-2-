package com.example.TelaLogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SecureLoginController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/Error")
    public String error() {
        return "error";
    }
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
    @GetMapping("/register")
    public String register() {
        return "register";
    }
    
}
