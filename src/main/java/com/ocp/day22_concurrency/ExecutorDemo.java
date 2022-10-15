package com.ocp.day22_concurrency;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executor;

class GetTime implements Runnable {
    @Override
    public void run() {
        System.out.println("現在時刻: " + new Date());
    }
}

class GetLuckyNumber implements Runnable {
    @Override
    public void run() {
        System.out.println("幸運數字: " + new Random().nextInt(100));
    }
}

class MyExecutor implements Executor {
    @Override
    public void execute(Runnable job) {
        new Thread(job).start();
    }
}

public class ExecutorDemo {
    public static void main(String[] args) {
        GetTime job1 = new GetTime();
        GetLuckyNumber job2 = new GetLuckyNumber();
        MyExecutor myExecutor = new MyExecutor();
        myExecutor.execute(job1);
        myExecutor.execute(job2);
    }
}
