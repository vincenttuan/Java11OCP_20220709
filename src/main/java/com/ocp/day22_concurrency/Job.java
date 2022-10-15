package com.ocp.day22_concurrency;

public class Job implements Runnable {
    @Override
    public void run() {
        System.out.println("普通任務");
    }
}
