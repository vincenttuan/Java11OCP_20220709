package com.ocp.day21_thread;

import java.util.concurrent.CyclicBarrier;

public class CarMain {
    public static void main(String[] args) {
        Runnable job = () -> System.out.println("吃午飯");
        int n = 4;
        CyclicBarrier cb = new CyclicBarrier(n, job);
        
        for(int i=1;i<=n;i++) {
            new Car(cb, "Car"+i).start();
        }
    }
}
