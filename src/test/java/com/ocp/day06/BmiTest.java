package com.ocp.day06;

public class BmiTest {
    public static void main(String[] args) {
        Bmi bmi = new Bmi();
        bmi.height = 170.0;
        bmi.weight = 60.0;
        double bmiValue = bmi.calcAndGetBmi();
        System.out.printf("%.2f\n", bmiValue);
        //-------------------------------------
        Bmi bmi2 = new Bmi();
        bmi2.height = 165;
        bmi2.weight = 55;
        double bmiValue2 = bmi2.calcAndGetBmi();
        System.out.printf("%.2f\n", bmiValue2);
    }
}
