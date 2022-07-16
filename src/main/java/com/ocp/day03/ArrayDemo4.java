package com.ocp.day03;

import java.util.Arrays;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 建立陣列 + {初始值...}
        //int[] scores = {95, 45, 37, 81, 75};
        int[] scores = new int[]{95, 45, 37, 81, 75}; //  有設定初始值時, 不可再定義陣列長度
        System.out.println(Arrays.toString(scores));
        // 印出及格的分數的總平均
        int sum = 0; // 及格分數的總分
        int pass_length = 0; // 及格分數的元素個數
        for(int i=0;i<scores.length;i++) {
            if(scores[i] >= 60) {
                sum += scores[i];
                pass_length++;
            }
        }
        double avg = (double)sum / pass_length; // 及格分數的平均
        System.out.println("及格分數的元素個數:" + pass_length);
        System.out.println("及格分數的平均:" + avg);
        
    }
}
