package com.ocp.day22_concurrency;

import java.util.Date;

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
        
    }
}
