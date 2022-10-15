package com.ocp.day21_thread;

public class Ball {
    private int num = 10;
    public void take() {
        String tName = Thread.currentThread().getName();
        for(;num > 0;num--) {
            int current_num = num; // 取得目前的球號
            for(int i=0;i<200000000;i++); // 模擬延遲時間
            System.out.printf("%s 拿了 %d 號球\n", tName, current_num);
        }
    }
}
