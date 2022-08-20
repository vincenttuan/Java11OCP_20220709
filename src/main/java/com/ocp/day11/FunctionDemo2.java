package com.ocp.day11;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.UnaryOperator;

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
        
        // BiFunction<T, U, R>
        // R apply(T t, U u)
        BiFunction<Double, Double, Double> biFunction = (h, w) -> w / Math.pow(h/100, 2);
        System.out.println("BMI: " + biFunction.apply(170.0, 60.0));
        
        // BinaryOperator<T> 相當於 BiFunction<T, T, T>
        BinaryOperator<Double> binaryOperator = (h, w) -> w / Math.pow(h/100, 2);
        System.out.println("BMI: " + binaryOperator.apply(170.0, 60.0));
        
        // UnaryOperator<T> 相當於 Function<T, T>
        // T apply(T t)
        UnaryOperator<Double> unaryOperator = (r) -> r * r * Math.PI;
        System.out.println(unaryOperator.apply(5.5));
        
    }
}
