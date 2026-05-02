package com.vishwas.spring_security.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/portfolio")
    public String test() {
        return "Welcome to your portfolio";
    }
}
