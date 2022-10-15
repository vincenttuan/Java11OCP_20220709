package com.ocp.day22_concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Job implements Runnable {
    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 任務進行中...\n", tName);
        for(int i=0;i<=10000;i++);
        System.out.printf("%s 任務進行完畢\n", tName);
    }
}

public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new NormalJob());
        service.submit(new NormalJob());
        service.submit(new NormalJob());
        service.submit(new NormalJob());
        service.submit(new NormalJob());
        
        // 停止服務
        service.shutdown(); // 平滑結束(會等到所有執行緒的工作都做完才會結束)
        //service.shutdownNow(); // 強制結束(不會等到所有執行緒的工作做完, 強制結束)
       
    }
}
