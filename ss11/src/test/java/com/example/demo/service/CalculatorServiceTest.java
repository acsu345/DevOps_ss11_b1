package com.example.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Unit Test cho CalculatorService")
class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    @DisplayName("Kiểm tra phép cộng hai số dương")
    void testAdd() {
        int result = calculatorService.add(10, 5);
        assertEquals(15, result, "10 + 5 phải bằng 15");
    }

    @Test
    @DisplayName("Kiểm tra phép trừ")
    void testSubtract() {
        int result = calculatorService.subtract(10, 4);
        assertEquals(6, result, "10 - 4 phải bằng 6");
    }

    @Test
    @DisplayName("Kiểm tra phép nhân")
    void testMultiply() {
        int result = calculatorService.multiply(6, 7);
        assertEquals(42, result, "6 * 7 phải bằng 42");
    }

    @Test
    @DisplayName("Kiểm tra phép chia hợp lệ")
    void testDivide() {
        double result = calculatorService.divide(20, 4);
        assertEquals(5.0, result, 0.0001, "20 / 4 phải bằng 5.0");
    }

    @Test
    @DisplayName("Kiểm tra phép chia cho 0 phải ném ngoại lệ IllegalArgumentException")
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
