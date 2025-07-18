package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return divide(a) + sum(a) + multiply(a) + minus(a);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);

        Calculator calculator = new Calculator();
        int result2 = calculator.multiply(5);
        System.out.println(result2);
        int result3 = calculator.divide(10);
        System.out.println(result3);
        int result4 = calculator.sumAllOperation(10);
        System.out.println(result4);
    }
}