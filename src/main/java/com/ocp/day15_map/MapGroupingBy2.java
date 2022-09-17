package com.ocp.day15_map;

import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toSet;

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
                new Fruit("apple", 20, 9.99)
        );
        // 希望印出
        // papaya=1, orange=1, banana=2, apple=3, watermelon=1
        Map<String, Long> result = fruits.stream()
                                         //.collect(groupingBy(fruit -> fruit.getName(), counting()));
                                         .collect(groupingBy(Fruit::getName, counting()));
        System.out.println(result);
        // 希望印出
        // papaya=20, orange=10, banana=30, apple=40, watermelon=10
        Map<String, Integer> result2 = fruits.stream()
                                         .collect(groupingBy(Fruit::getName, summingInt(Fruit::getQty)));
        System.out.println(result2);
        
        // 希望印出
        // 29.99=[orange, watermelon], 9.99=[papaya, apple], 19.99=[banana]
        Map<Double, List<Fruit>> result3 = fruits.stream().collect(groupingBy(Fruit::getPrice));
        System.out.println(result3);
        // 上述列印結果:
        // 29.99=[Fruit{name=orange, qty=10, price=29.99}, Fruit{name=watermelon, qty=10, price=29.99}], 
        // 9.99=[Fruit{name=apple, qty=10, price=9.99}, Fruit{name=papaya, qty=20, price=9.99}, Fruit{name=apple, qty=10, price=9.99}, Fruit{name=apple, qty=20, price=9.99}], 
        // 19.99=[Fruit{name=banana, qty=20, price=19.99}, Fruit{name=banana, qty=10, price=19.99}]}
        
        Map<Double, Set<String>> result4 = fruits.stream().collect(groupingBy(Fruit::getPrice, mapping(Fruit::getName, toSet())));
        System.out.println(result4);
        // 29.99=[orange, watermelon], 9.99=[papaya, apple], 19.99=[banana]
    }
}
