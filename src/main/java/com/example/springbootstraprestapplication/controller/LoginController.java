package com.example.springbootstraprestapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class LoginController {

    @GetMapping
    @RequestMapping("/login")
    public String longin() {
        return "redirect:/login";
    }
}