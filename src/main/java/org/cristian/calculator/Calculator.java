package org.cristian.calculator;

public class Calculator {
    public int sum (String a, String b) {
        try {
            int numA = Integer.parseInt(a);
            int numB = Integer.parseInt(b);
            return numA + numB;
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("It is not a valid number");
        }
    }

    public int subtract (String a, String b) {
        try {
            int numA = Integer.parseInt(a);
            int numB = Integer.parseInt(b);
            return numA - numB;
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("It is not a valid number");
        }
    }

    public int multiply (String a, String b) {
        try {
            int numA = Integer.parseInt(a);
            int numB = Integer.parseInt(b);
            return numA * numB;
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("It is not a valid number");
        }
    }

    public double divide (String a, String b) {
        try {
            if (b.equals("0")) throw new IllegalArgumentException("It is not possible to divide by zero");
            int numA = Integer.parseInt(a);
            int numB = Integer.parseInt(b);
            return (double) numA / numB;
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("It is not a valid number");
        }
    }
}
