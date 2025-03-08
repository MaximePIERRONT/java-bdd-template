package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    void shouldValidSum(){
        Calculator calculator = new Calculator();
        int result = calculator.sum(1,2);
        assertEquals(3, result, "The result should be 3");
    }
}