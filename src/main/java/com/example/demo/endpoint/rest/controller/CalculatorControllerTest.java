package com.example.demo.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorControllerTest {

  CalculatorController calculator = new CalculatorController();

  @Test
  void testAdd() {
    assertEquals(8, calculator.add(5, 3));
  }

  @Test
  void testSubtract() {
    assertEquals(6, calculator.subtract(10, 4));
  }

  @Test
  void testMultiply() {
    assertEquals(42, calculator.multiply(6, 7));
  }

  @Test
  void testDivide() {
    assertEquals(4, calculator.divide(20, 5));
  }

  @Test
  void testDivideByZero() {
    Exception exception =
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));

    assertEquals("Division par zéro impossible", exception.getMessage());
  }
}
