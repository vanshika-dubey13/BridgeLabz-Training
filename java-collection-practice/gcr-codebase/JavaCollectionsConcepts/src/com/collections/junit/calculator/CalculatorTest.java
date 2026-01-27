package com.collections.junit.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(-2, 1));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
        assertEquals(-3, calc.subtract(-2, 1));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
        assertEquals(-2, calc.multiply(-2, 1));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(6, 3));
        assertEquals(-2, calc.divide(-4, 2));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.divide(5, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
