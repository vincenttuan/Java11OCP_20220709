package com.ocp.day15_map;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(100, "Ball");
        map.put(80, "Ball");
        map.put(90, "Pen");
        System.out.println(map);
    }
}
