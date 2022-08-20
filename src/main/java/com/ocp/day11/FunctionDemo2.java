package com.ocp.day11;

import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;

public class FunctionDemo2 {
    public static void main(String[] args) {
        // BiConsumer<T, U>
        // void accept(T t, U u)
        BiConsumer<String, Integer> biConsumer = 
                (name, cost) -> System.out.printf("品名: %s 成本:$%d 價格:$%d\n", name, cost, cost*15);
        biConsumer.accept("冬瓜茶", 2);
        
        // ObjIntConsumer<T>
        // void accept(T t, int value)
        ObjIntConsumer<String> objIntConsumer = 
                (name, cost) -> System.out.printf("品名: %s 成本:$%d 價格:$%d\n", name, cost, cost*15);
        objIntConsumer.accept("冬瓜茶", 2);
    }
}
