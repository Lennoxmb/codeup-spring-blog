package com.codeup.codeupspringblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MathController {
    @GetMapping("/add/{number1}/and/{number2}")
    @ResponseBody
    public String Math(@PathVariable int number1, @PathVariable int number2) {
        return String.valueOf(number1 + number2);
    }

    @GetMapping("/subtract/{number1}/from/{number2}")
    @ResponseBody
    public String Math2(@PathVariable int number1, @PathVariable int number2) {
        return String.valueOf(number2 - number1);
    }

    @GetMapping("/multiply/{number1}/and/{number2}")
    @ResponseBody
    public String Math3(@PathVariable int number1, @PathVariable int number2) {
        return String.valueOf(number1 * number2);
    }

    @GetMapping("/divide/{number1}/by/{number2}")
    @ResponseBody
    public String Math4(@PathVariable int number1, @PathVariable int number2) {
        return String.valueOf(number1 / number2);
    }
}
