package com.company;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum")
@RequiredArgsConstructor
public class SumController {
    private final Main main;

    @GetMapping("")
    public ResponseEntity<Integer> sum(@RequestParam(name = "a", defaultValue = "5") Integer num1,
                                       @RequestParam(name = "b", defaultValue = "7") Integer num2) {
        return ResponseEntity.ok(main.sum(num1, num2));
    }
}
