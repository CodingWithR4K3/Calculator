package com.calculator;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(19, 5);
        calculator.subtract(20, 19);
        calculator.multiply(8, 8);
        calculator.divide(60, 20);

    }

    public void sum(int parA, int parB) {
        int sums = parA + parB;
        System.out.println("The sum value = " + sums);
    }

    public void subtract(int parA, int parB) {
        int subtraction = parA - parB;
        System.out.println("The subtraction value = " + subtraction);
    }

    public void multiply(int parA, int parB) {
        int multiplication = parA * parB;
        System.out.println("The multiplication value = " + multiplication);
    }

    public void divide(int parA, int parB) {
        int division = parA / parB;
        System.out.println("The division value = " + division);
    }

}