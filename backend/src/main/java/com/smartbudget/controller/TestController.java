package com.smartbudget.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "SmartBudget API fonctionne!";
    }

    @GetMapping("/status")
    public String status() {
        return "Backend SmartBudget - Version 1.0";
    }
}