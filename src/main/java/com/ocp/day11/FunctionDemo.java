package com.ocp.day11;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionDemo {
    public static void main(String[] args) {
        // 1. Consumer
        Consumer<Integer> consumer = (score) -> System.out.println("成績印出: " + score);
        consumer.accept(100);
        // 2. Function
        Function<Integer, Double> function = (r) -> r * r * Math.PI;
        System.out.println("圓面積: " + function.apply(10));
        // 3. Predicate(判定)
        Predicate<Integer> predicate = (score) -> score >= 60;
        System.out.println(predicate.test(75)?"及格":"不及格");
        System.out.println(predicate.test(45)?"及格":"不及格");
        // 4. Supplier
        Supplier<Date> supplier = () -> new Date();
        System.out.println("現在時刻: " + supplier.get());
        
        
    }
}
