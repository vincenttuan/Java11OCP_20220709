package com.ocp.day22_concurrency;

public class NormalJob implements Runnable {
    @Override
    public void run() {
        System.out.println("普通任務");
    }
}
