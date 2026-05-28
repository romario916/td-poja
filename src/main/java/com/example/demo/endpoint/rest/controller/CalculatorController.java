package com.example.demo.endpoint.rest.controller;

@RestController
public class CalculatorController {

  @GetMapping("/add")
  public double add(@RequestParam double a, @RequestParam double b) {
    return a + b;
  }

  public class CalculatorController {}

  @GetMapping("/subtract")
  public double subtract(@RequestParam double a, @RequestParam double b) {
    return a - b;
  }

  @GetMapping("/multiply")
  public double multiply(@RequestParam double a, @RequestParam double b) {
    return a * b;
  }

  @GetMapping("/divide")
  public double divide(@RequestParam double a, @RequestParam double b) {
    if (b == 0) {
      throw new IllegalArgumentException("Division par zéro impossible");
    }
    return a / b;
  }
}
