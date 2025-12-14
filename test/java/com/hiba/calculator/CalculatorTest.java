package com.hiba.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5,calc.add(3, 2));
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(5,calc.add(3, 2));
    }
}