package com.ocp.day10;

public class MathUtilDemo {
    public static void main(String[] args) {
        MathUtil<Integer> mu1 = (t) -> t / 2;
        MathUtil<Double>  mu2 = (t) -> t / 2;
        // 沒寫泛型預設就是<Object>
        MathUtil  mu3 = (t) -> t;
        
        System.out.println(mu1.calc(5));
        System.out.println(mu2.calc(5.0));
    }
}
