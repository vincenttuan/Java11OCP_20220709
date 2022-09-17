package com.ocp.day15_map;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import static java.util.Map.Entry.comparingByKey;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapDemo3 {
    public static void main(String[] args) {
        var symbols = List.of("USD","GBP","EUR","CNY");
        System.out.println("symbols: " + symbols);
        
        var exchangeRate = List.of(1.0, 1.3255, 1.1969, 0.1558094);
        System.out.println("exchangeRate: " + exchangeRate);
        
        System.out.println(Math.min(symbols.size(), exchangeRate.size()));
        var map1 = IntStream.range(0, Math.min(symbols.size(), exchangeRate.size()))
                .boxed() // int -> Integer, 因為集合不可放基本資料型別只能放物件型別
                .collect(Collectors.toMap(i -> symbols.get(i), i -> 1.0/exchangeRate.get(i)));
        System.out.println("map1: " + map1);
        
        var map2 = map1.entrySet().stream()
                .sorted(comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue , newValue) -> oldValue, LinkedHashMap::new));
        map2.forEach((var k , var v) -> System.out.printf("%s -> %.2f\n",k,v));
    }

}
