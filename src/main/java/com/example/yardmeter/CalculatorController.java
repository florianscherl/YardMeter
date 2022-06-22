package com.example.yardmeter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CalculatorController {

    @RequestMapping("/centimeter")
    public double centimeter(
            @RequestParam double inch){
        return Calculator.centimeter(inch);
    }

    @RequestMapping("/meter")
    public double meter(
            @RequestParam double yard){
        return Calculator.meter(yard);
    }
}
