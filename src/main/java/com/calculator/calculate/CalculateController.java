package com.calculator.calculate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculateController {
    @GetMapping("/calculate")
    public String sayHello(){
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }
}
