package com.ocp.day19_thread;

public class CatTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        //car1.driver();
        //car2.driver();
        car1.start();
        car2.start();
    }
}
