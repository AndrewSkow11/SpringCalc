package com.calculator.calculate;


import org.springframework.stereotype.Service;

@Service
public class CalculateService implements CalculateServiceInterface {
    //plus
    @Override
    public String plus(int num1, int num2) {

        int result = num1 + num2;
        String stringResult = num1 + " + " + num2 + " = " + result;
        return "<h1>Результат сложения</h1>" + "<p>" + stringResult + "</p>";

        //throw new RuntimeException("Не получены входные параметры");
    }

    //minus
    @Override
    public String minus(int num1, int num2) {
        int result = num1 - num2;
        String stringResult = num1 + " - " + num2 + " = " + result;
        return "<h1>Результат вычитания</h1>" + "<p>" + stringResult + "</p>";
    }


    //multiply
    @Override
    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        String stringResult = num1 + " * " + num2 + " = " + result;
        return "<h1>Результат умножения</h1>" + "<p>" + stringResult + "</p>";
    }

    //divide
    @Override
    public String divide(int num1, int num2) {
        int result = num1 / num2;
        String stringResult = num1 + " / " + num2 + " = " + result;

        if (num2 == 0) {
            throw new RuntimeException("Делитель не может быть нулём!");
        } else {
            return "<h1>Результат деления</h1>" + "<p>" + stringResult + "</p>";
        }
    }


}
