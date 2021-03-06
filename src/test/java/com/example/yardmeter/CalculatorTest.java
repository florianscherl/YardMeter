package com.example.yardmeter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test

    void centimeter(){
        //Arrange
        double inch = 1;
        double expected = 2.54;

        //Act
        double result = calculator.centimeter(inch);

        //Assert
        assertEquals(expected,result);
    }

    @Test

    void meter(){
        //Arrange
        double yard = 1;
        double expected = 0.9144;

        //Act
        double result = calculator.meter(yard);

        //Assert
        assertEquals(expected,result);
    }
}
