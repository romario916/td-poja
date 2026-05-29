package com.example.demo.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

   private void validatePositive(double a, double b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("Le chiffre doit être positif");
    }
  }

  @GetMapping("/add")
  public double add(@RequestParam double a, @RequestParam double b) {
    validatePositive(a, b);
    return a + b;
  }

  @GetMapping("/subtract")
  public double subtract(@RequestParam double a, @RequestParam double b) {
    validatePositive(a, b);
    return a - b;
  }

  @GetMapping("/multiply")
  public double multiply(@RequestParam double a, @RequestParam double b) {
    validatePositive(a, b);
    return a * b;
  }

  @GetMapping("/divide")
  public double divide(@RequestParam double a, @RequestParam double b) {
    validatePositive(a, b);

    if (b == 0) {
      throw new IllegalArgumentException("Division par zéro impossible");
    }

    return a / b;
  }
}