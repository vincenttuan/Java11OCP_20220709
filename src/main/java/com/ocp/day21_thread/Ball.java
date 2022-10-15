package com.ocp.day21_thread;

public class Ball {
    private int num = 10;
    public void take() {
        String tName = Thread.currentThread().getName();
        for(;;) {
            synchronized (this) {
                if(num > 0) {
                    int current_num = num; // 取得目前的球號
                    for(int i=0;i<200000000;i++); // 模擬延遲時間 1
                    System.out.printf("%s 拿了 %d 號球\n", tName, current_num);
                    num--;
                } else {
                    break;
                }
            }
            for(int i=0;i<10000;i++); // 模擬延遲時間 2
        }
    }
}
