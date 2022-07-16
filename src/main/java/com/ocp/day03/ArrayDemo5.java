package com.ocp.day03;

import java.util.Arrays;

public class ArrayDemo5 {
    public static void main(String[] args) {
        // 建立陣列 + {初始值...}
        int[] scores = {95, 45, 37, 81, 75};
        System.out.println(Arrays.toString(scores));
        // 印出及格的分數
        // 使用 Java stream
        Arrays.stream(scores)
              .filter(score -> score >= 60)
              .forEach(score -> System.out.println(score));
        
    }
}
