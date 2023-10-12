package com.company;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import jdk.jfr.StackTrace;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@OpenAPIDefinition
@RestController
@RequestMapping("/sum")
@SpringBootApplication
@RequiredArgsConstructor
public class TestApplication extends SpringBootServletInitializer {
    private final Main main;

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TestApplication.class);
    }

    @GetMapping("")
    public ResponseEntity<Integer> sum(@RequestParam(name = "a") Integer num1,
                                             @RequestParam(name = "b") Integer num2) {
        return ResponseEntity.ok(main.sum(num1, num2));
    }
}
