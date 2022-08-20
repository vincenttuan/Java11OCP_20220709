package com.ocp.day11;

import java.util.function.BiConsumer;

public class FunctionDemo2 {
    public static void main(String[] args) {
        // BiConsumer<T, U>
        BiConsumer<String, Integer> biConsumer = 
                (name, cost) -> System.out.printf("品名: %s 成本:$%d 價格:$%d\n", name, cost, cost*15);
        biConsumer.accept("冬瓜茶", 2);
    }
}
