package com.ocp.day05;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiArrayDemo5 {
    public static void main(String[] args) {
        // 多維陣列的初始值
        int[][] m = {{100, 90, 80}, {70, 60, 50}, {40, 30, 20}};
        // 利用 Java 8 Stream 顯示
        Stream.of(m)
                //.flatMapToInt(array -> Arrays.stream(array)) // 將 array 轉換為 stream array
                .flatMapToInt(Arrays::stream)
                //.forEach(System.out::println);
                .forEach(data -> System.out.println(data));
    }
}
