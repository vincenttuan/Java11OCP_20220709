package com.ocp.day10;

public class Anonymouse {
    public static void main(String[] args) {
        // 介面不可以直接 new
        // Calculator calculator = new Calculator();
        
        // 介面不可以直接 new 的原因是因為介面的方法沒有實作
        // 所以可以利用匿名內部類別的技術{}來實作方法
        // 這樣就可以 new
        Calculator calculator = new Calculator(){
            public double calc(double x, double y) {
                return x + y;
            }
        };
        System.out.println(calculator.calc(10, 20));
        
    }
}
