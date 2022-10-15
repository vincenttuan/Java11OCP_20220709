package com.ocp.day22_concurrency;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {
    // 建立門檻值
    private static final int THRESHOLD = 3;
    // 任務數組
    long[] array;
    // 起迄位置
    int start, end;
    // 任務注入(建構子)
    public SumTask(long [] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }
    @Override
    protected Long compute() {
        // 1. 判斷門檻值
        if(end - start <= THRESHOLD) {
            long sum = 0;
            for(int i = start;i<end;i++) {
                sum += array[i];
            }
            return sum;
        }
        // 2. 將任務一分為二的公式
        int middle = (end - start) / 2;
        System.out.printf("分割 %d~%d ==> %d~%d, %d~%d\n", start, end, start, middle, middle, end);
        // 3. 分裂任務 (fork)
        SumTask sumTask1 = new SumTask(array, start, middle);
        SumTask sumTask2 = new SumTask(array, middle, end);
        // 4. 並行運算二個子任務
        invokeAll(sumTask1, sumTask2);
        // 5. 獲得二個子任務的回報結果 (join)
        long subResult1 = sumTask1.join();
        long subResult2 = sumTask2.join();
        // 6. 彙總結果
        long result = subResult1 + subResult2;
        System.out.printf("會總結果: result = %d + %d = %d\n", subResult1, subResult2, result);
        return result;
    }
    
}
