package com.ocp.day03;

import java.util.Arrays;

public class ArrayDemo6 {
    public static void main(String[] args) {
        // 建立陣列 + {初始值...}
        int[] scores = {95, 45, 37, 81, 75};
        System.out.println(Arrays.toString(scores));
        // 印出及格的分數的平均
        // 使用 Java stream
        double avg = Arrays.stream(scores)
                           .filter(score -> score >= 60)
                           .average() // 取得平均物件
                           .getAsDouble(); // 取得平均物件的內容值
        System.out.println("及格的分數的平均: " + avg);                   
    }
}
