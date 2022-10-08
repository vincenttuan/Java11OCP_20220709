package com.ocp.day20_thread;

class Program implements Runnable {
    @Override
    public void run() {
        System.out.println("寫程式");
    }
}

class Report implements Runnable {
    @Override
    public void run() {
        System.out.println("寫報告");
    }
}

class Drink implements Runnable {
    @Override
    public void run() {
        System.out.println("喝咖啡");
    }
}

public class MyJobs {
    
}
