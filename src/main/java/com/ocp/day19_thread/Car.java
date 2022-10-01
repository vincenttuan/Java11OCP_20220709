package com.ocp.day19_thread;

public class Car extends Thread {
    
    @Override
    public void run() {
        driver();
    }
    
    public void driver() {
        String tName = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 累計開了 %d km\n", tName, i);
        }
    }
    
}
