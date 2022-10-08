package com.ocp.collection_modify;

import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> fruits = List.of("B", "O", "A", "L");
        System.out.println(fruits);
        //Collections.sort(fruits); // UnsupportedOperationException 不透過 Collections.sort() 來排序
        fruits.sort((a, b) -> a.compareTo(b));
        System.out.println(fruits);
        
    }
}
