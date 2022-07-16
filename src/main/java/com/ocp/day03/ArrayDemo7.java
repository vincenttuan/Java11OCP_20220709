package com.ocp.day03;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ArrayDemo7 {
    public static void main(String[] args) {
        int[] scores = {95, 45, 37, 81, 75};
        System.out.println(Arrays.toString(scores));
        var stat = Arrays.stream(scores).summaryStatistics();
        System.out.println(stat);
        System.out.println("人數: " + stat.getCount());
        System.out.println("總分: " + stat.getSum());
        System.out.println("平均: " + stat.getAverage());
        System.out.println("最大: " + stat.getMax());
        System.out.println("最小: " + stat.getMin());
    }
}
