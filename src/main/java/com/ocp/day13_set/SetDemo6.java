package com.ocp.day13_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo6 {
    public static void main(String[] args) {
        Set scores = new LinkedHashSet();
        scores.add(100);
        scores.add(3.14);
        scores.add(80);
        scores.add("John");
        scores.add(null);
        scores.add(90);
        // [100, 3.14, 80, John, null, 90]
        System.out.println(scores);
        // 計算總分
        int sum = scores.stream()
                        .filter(num -> num instanceof Integer)  // 100, 80, 90
                        .peek(num -> System.out.println(num))
                        .mapToInt(num -> Integer.parseInt(num+"")) // 此時的 num 仍是 Object 所以加上空字串 ""
                        .sum();
        System.out.println(sum);      
        
        
    }
}
