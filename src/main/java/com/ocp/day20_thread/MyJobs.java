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
    public static void main(String[] args) {
        // 1. 建立要執行的工作
        Program program = new Program();
        Report report = new Report();
        Drink drink = new Drink();
        // 2. 將工作配給執行緒準備執行
        Thread t1 = new Thread(program);
        Thread t2 = new Thread(report);
        Thread t3 = new Thread(drink);
        // 3. 調用 start() 執行工作任務
        t1.start();
        t2.start();
        t3.start();
    }
}
