package com.ocp.day04;

import java.util.Arrays;

public class ArrayDemo11 {
    public static void main(String[] args) {
        int[] scores = {100, 50, 40, 90, 80};
        // 及格分數的集合
        var pass_scores = Arrays.stream(scores).filter(score -> score >= 60);
        
        // 印出元素內容
        pass_scores.forEach(score -> System.out.println(score));
        
        // 印出總分
        int sum = pass_scores.sum();
        System.out.println(sum);
    }
}
