package com.ocp.day22_concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class MyJob implements Runnable {
    @Override
    public void run() {
        System.out.println("寫程式工作");
    }
}

// 單次性排程
public class ThreadSingleScheduledDemo {
    
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        System.out.println("服務開始");
        // 停 5 秒後開始執行
        int delayTime = 5;
        service.schedule(new MyJob(), delayTime, TimeUnit.SECONDS);
        // 停止服務
        service.shutdown();
    }
    
}
