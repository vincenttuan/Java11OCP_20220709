package com.ocp.day15_map;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import static java.util.Map.Entry.comparingByValue;
import static java.util.function.Function.identity;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class MapGroupingBy1 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "apple", "orange", "papaya", "apple", "banana");
        System.out.println(fruits);
        // 希望輸出成為
        // apple=3, banana=2, orange=1, papaya=1
        Map<String, Long> result = fruits.stream()
                                         //.collect(groupingBy(name -> name, counting()));
                                         .collect(groupingBy(identity(), counting()));
        System.out.println(result);
        // 排序
        Map result2 = result.entrySet().stream()
                //.sorted(comparingByValue())
                //.sorted(Map.Entry.<String, Long>comparingByValue())
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o2, LinkedHashMap::new));
        System.out.println(result2);
    }
}
