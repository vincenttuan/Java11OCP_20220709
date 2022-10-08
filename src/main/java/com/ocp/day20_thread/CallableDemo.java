package com.ocp.day20_thread;

class GetExam extends Thread {
    public void run() {
        int score = 75;
        System.out.println("印出考試成績: " + score);
    }
}

public class CallableDemo {
    public static void main(String[] args) {
        GetExam getExam = new GetExam();
        getExam.start();
        // 根據考試成績來判斷是否及格 ?
        
    }
}
