package com.ocp.day03;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] scores = new int[3];  // 陣列長度一經過宣告之後就固定了
        System.out.println(Arrays.toString(scores));
        // 陣列的最小維度 = 0
        // 陣列的最大維度 = 陣列的長度 - 1
        int maxLength = scores.length - 1;
        System.out.println("陣列的最大維度: " + maxLength);
        if (maxLength >= 3) {
            System.out.println("scores[3]: " + scores[3]);
        }
        if (maxLength >= 2) {
            System.out.println("scores[2]: " + scores[2]);
        }
    }
}
