package com.example.javaapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AminController {
    @GetMapping("/api")
    public String runCode() {
        // Add your Java code logic here
        return "Hello from Java API";
    }
}
