package dev.be.githubaction.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${override.value}")
    private String value;

    @GetMapping("/demo")
    public String demo() {
        return "demo " + value;
    }
}
