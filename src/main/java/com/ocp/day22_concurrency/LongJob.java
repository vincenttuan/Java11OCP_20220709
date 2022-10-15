package com.ocp.day22_concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class LongJob implements Callable<Boolean> {

    @Override
    public Boolean call() throws Exception {
        System.out.println("長任務開始");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("長任務結束");
        return true;
    }
    
}
