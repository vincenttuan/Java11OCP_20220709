package com.ocp.day20_thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class GetExam implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        int score = new Random().nextInt(101);
        System.out.println("印出考試成績: " + score);
        return score;
    }
}

public class CallableDemo {
    public static void main(String[] args) {
        // 準備 GetExam
        GetExam getExam = new GetExam();
        // 準備 FutureTask 來裝載 getExam
        FutureTask<Integer> task = new FutureTask<>(getExam);
        // 啟動執行緒
        new Thread(task).start();
        // 取得考試成績
        Integer score = null;
        try {
            score = task.get(); // 考試成績
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e);
        }
        // 根據考試成績來判斷是否及格 ?
        if(score == null) {
            System.out.println("沒有成績");
        } else if(score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}
