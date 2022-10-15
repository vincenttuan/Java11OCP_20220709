package com.ocp.day21_thread;

import java.util.concurrent.CyclicBarrier;

public class Car extends Thread {
    private CyclicBarrier cb;
    private String name;
    public Car(CyclicBarrier cb, String name) {
        this.cb = cb;
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.printf("%s 出發~~\n", name);
        try {
            for(int i=0;i<=2100000000;i++); // 模擬開車時間
            System.out.printf("%s 到達台中~~\n", name);
            cb.await(); // 等待其他夥伴
            for(int i=0;i<=2100000000;i++); // 模擬開車時間
            System.out.printf("%s 到達高雄~~\n", name);
        } catch (Exception ex) {
        }
        System.out.printf("%s 結束旅程~~\n", name);
    }
    
}
