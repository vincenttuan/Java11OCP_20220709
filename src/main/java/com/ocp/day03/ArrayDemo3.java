package com.ocp.day03;

import java.util.Arrays;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] scores = new int[3];
        System.out.println(Arrays.toString(scores));
        // 將內容放入到元素中
        scores[0] = 100;
        scores[1] = 85;
        scores[2] = 68;
        System.out.println(Arrays.toString(scores));
        // 計算總分 I (使用 for-loop)
        int sum = 0;
        for(int i = 0 ; i < scores.length ; i++) {
            sum += scores[i];
        }
        System.out.println("總分: " + sum);
        // 計算總分 II (使用 for-in(each))
        int sum2 = 0;
        for(int score : scores) {
            sum2 += score;
        }
        System.out.println("總分: " + sum2);
    }
}
