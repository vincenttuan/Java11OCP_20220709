package com.ocp.day22_concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class SumTaskMain {
    public static void main(String[] args) {
        long[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // forkjoin
        ForkJoinTask<Long> task = new SumTask(array, 0, array.length);
        long result  = ForkJoinPool.commonPool().invoke(task);
        System.out.println(result);
    }
}
