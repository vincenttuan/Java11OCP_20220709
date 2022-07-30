package com.ocp.day06;

public class BmiTest {
    public static void main(String[] args) {
        Bmi bmi = new Bmi();
        bmi.height = 170.0;
        bmi.weight = 60.0;
        double bmiValue = bmi.calcAndGetBmi();
        System.out.printf("%.2f\n", bmiValue);
    }
}
