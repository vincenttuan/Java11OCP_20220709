package com.ocp.day05;

import java.util.Arrays;
import java.util.stream.Stream;

public class IntegerArrayDemo2 {
    public static void main(String[] args) {
        Integer[][] scores = {{100, 90, null}, {80, null, 70}};
        // null 表示未參與考試, 請求出有考試的平均分
        double avg = Stream.of(scores)
                           .flatMap(Arrays::stream)  // array -> Arrays.stream(array)
                           .filter(data -> data != null)
                           .mapToInt(Integer::valueOf)
                           .average()
                           .getAsDouble();
        System.out.println(avg);
              
                
    }
}
