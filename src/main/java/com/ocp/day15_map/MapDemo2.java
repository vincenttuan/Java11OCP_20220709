package com.ocp.day15_map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import java.util.stream.Collectors;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 90);
        map.put("Bob", 100);
        map.put("Helen", 50);
        map.put("Mary", 30);
        map.put("Coco", 80);
        System.out.println(map);
        // 取總分
        // entrySet -> (John=90), (Bob=100), (Helen=50), (Mary=30), (Coco=80)
        int sum = map.entrySet().stream().mapToInt(entry -> entry.getValue()).sum();
        System.out.println(sum);
        // 排序
        Map map2 = map.entrySet().stream()
                      //.sorted(comparingByKey())
                      .sorted(comparingByValue())
                      //.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o2, LinkedHashMap::new));
                      //.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (o1, o2) -> o2, LinkedHashMap::new));
                      .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (o1, o2) -> o2, LinkedHashMap::new));
        // Collectors.toMap(key 值的映射函數, value 值的映射函數, 當有 key 值衝突發生的解決方法, 建構一個 Map 集合來放入所有元素)
        // (o1, o2) -> o2, LinkedHashMap::new
        // 元素1, 元素2 -> 若有 key 的衝突以 元素2 回主
        // LinkedHashMap::new 是指 建立一個 LinkedHashMap 集合來將所有元素放入
        System.out.println(map2);
    }
}
