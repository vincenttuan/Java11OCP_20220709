package com.ocp.day15_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        //Map<String, Integer> map = new HashMap<>(); // 按照 key 值的 hash 資料來進行排序
        Map<String, Integer> map = new LinkedHashMap<>(); // 按照元素加入的順序進行排序
        map.put("數學", 80);
        map.put("國文", 100);
        map.put("英文", 90);
        System.out.println(map);
        System.out.println(map.get("國文"));
        System.out.println("取得所有 keys: " + map.keySet());
        System.out.println("取得所有 values: " + map.values());
        
    }
}
