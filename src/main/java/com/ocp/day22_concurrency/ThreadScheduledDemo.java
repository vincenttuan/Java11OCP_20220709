package com.ocp.day22_concurrency;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class PlayJob implements Runnable {
    @Override
    public void run() {
        System.out.print("開始: " + new Date());
        System.out.print(" [ Play Job ] ");
        System.out.println("結束: " + new Date());
    }
}

// 重複性排程
public class ThreadScheduledDemo {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        // 每隔 2 秒鐘重複執行任務
        int delayTime = 1; // 停 1 秒
        int peroidTime = 2; // 間隔 2 秒
        // 1 秒鐘後開始 [執行 MyJob 工作] 間隔 2 秒 [執行 MyJob 工作] 間隔 2 秒 [執行 MyJob 工作] ...
        service.scheduleWithFixedDelay(new PlayJob(), delayTime, peroidTime, TimeUnit.SECONDS);
    }
}
