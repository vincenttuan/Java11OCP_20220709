package com.ocp.day06;

public class Bmi {
    double height;
    double weight;
    
    double calcAndGetBmi() {
        double bmiValue = weight / Math.pow(height/100, 2);
        return bmiValue;
    }
}
