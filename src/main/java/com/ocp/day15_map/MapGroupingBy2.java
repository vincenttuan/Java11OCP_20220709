package com.ocp.day15_map;

import java.util.List;

public class MapGroupingBy2 {
    public static void main(String[] args) {
        List<Fruit> fruits = List.of(
                new Fruit("apple", 10, 9.99),
                new Fruit("banana", 20, 19.99),
                new Fruit("orange", 10, 29.99),
                new Fruit("watermelon", 10, 29.99),
                new Fruit("papaya", 20, 9.99),
                new Fruit("apple", 10, 9.99),
                new Fruit("banana", 10, 19.99),
                new Fruit("apple", 10, 9.99)
        );
        // 希望印出
        // apple=3, banana=2, orange=1, watermelon=1
    }
}
