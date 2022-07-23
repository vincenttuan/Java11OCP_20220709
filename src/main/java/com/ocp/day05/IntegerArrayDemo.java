package com.ocp.day05;

import java.util.Arrays;

public class IntegerArrayDemo {
    public static void main(String[] args) {
        Integer[] scores = {100, 90, 80, 70, 60};
        // 計算出總分, 使用 Java 8 Stream
        int sum = Arrays.stream(scores)
                        //.mapToInt(score -> score.intValue())
                        //.mapToInt(score -> score) // 編譯器會幫你加上 intValue()
                        //.mapToInt(score -> Integer.valueOf(score)) // 編譯器會幫你加上 intValue()
                        .mapToInt(Integer::valueOf) // 同上
                        .sum();
        System.out.println(sum);
        
        
    }
}
