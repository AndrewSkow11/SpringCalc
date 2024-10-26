package com.calculator.calculate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculateController {

    private final CalculateServiceInterface calculateService;

    public CalculateController(CalculateServiceInterface calculateService){
        this.calculateService = calculateService;
    }

    @GetMapping
    public String sayHello(){
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculateService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculateService.minus(num1, num2);
    }


    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculateService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculateService.divide(num1, num2);
    }
}
