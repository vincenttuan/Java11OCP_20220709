package com.ocp.day22_concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class JobMain {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new LongJob());
        service.submit(new NormalJob());
        service.submit(new NormalJob());
        service.submit(new LongJob());
        service.submit(new NormalJob());
        
        service.shutdown();
        //service.shutdownNow();
        
        // 每一秒去偵測執行緒池是否關閉 ?
        while (!service.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("執行緒池尚未關閉");
        }
        System.out.println("執行緒已關閉");
    }
}
