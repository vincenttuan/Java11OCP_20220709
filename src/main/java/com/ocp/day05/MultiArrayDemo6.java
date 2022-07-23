package com.ocp.day05;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class MultiArrayDemo6 {
    public static void main(String[] args) {
        // 多維陣列的初始值
        int[][] m = {{100, 90, 80}, {70, 60, 50}, {40, 30, 20}};
        // 請計算出(及格的)元素個數, 總和, 平均, 最大, 最小
        var stat = Stream.of(m)
                         .flatMapToInt(Arrays::stream)
                         .filter(data -> data >= 60)  // 過濾出及格的
                         .summaryStatistics();
        System.out.println(stat);
        System.out.printf("元素個數: %d 總和: %d 平均: %.1f 最大: %d 最小: %d\n",
                        stat.getCount(), stat.getSum(), stat.getAverage(), stat.getMax(), stat.getMin());
    }
}
