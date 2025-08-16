package org.cristian.calculator;

public class Calculator {
    public int sum (int a, int b) {
        return a + b;
    }

    public int subtract (int a, int b) {
        return a - b;
    }

    public int multiply (int a, int b) {
        return a * b;
    }

    public double divide (int a, int b) {
        if (b == 0) throw new IllegalArgumentException("It is not possible to divide by zero");
        return (double) a / b;
    }
}
