package com.ocp.day10;

public class Anonymouse2 {
    public static void main(String[] args) {
        // 匿名內部類別語法
        Calculator calculator = new Calculator() {
            @Override
            public double calc(double x, double y) {
                return x + y;
            }
        };
        // Lambda 語法 1
        Calculator calculator2 = (double x, double y) -> {
            return x + y;
        };
        
        System.out.println(calculator.calc(10, 20));
        System.out.println(calculator2.calc(10, 20));
    }
}
