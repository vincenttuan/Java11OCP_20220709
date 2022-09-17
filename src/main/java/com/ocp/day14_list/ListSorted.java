package com.ocp.day14_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSorted {
    public static void main(String[] args) {
        // 集合的排序問題
        // 利用 List.of() 建立出來的集合式 ImmutableCollections 不可變集合
        // 不支援新增,修改,刪除與排序
        List<Integer> scores = List.of(80, 100, 90);
        // 將 ImmutableCollections 不可變集合變為可變集合
        scores = new ArrayList<>(scores);
        System.out.println("排序前: " + scores);
        // 進行排序
        Collections.sort(scores); // 預設排序原則是自然排序(小->大)
        System.out.println("排序後: " + scores);
        // 進行排序(自訂排序原則)
        //Collections.sort(scores, (o1, o2) -> o2 - o1);
        Comparator<Integer> c1 = (o1, o2) -> o2 - o1; // (大 -> 小)
        Comparator<Integer> c2 = (o1, o2) -> o1 - o2; // (小 -> 大)
        Comparator<Integer> c3 = (a, b) -> a.compareTo(b); // a - b (小 -> 大)
        Comparator<Integer> c4 = (a, b) -> b.compareTo(a); // b - a (大 -> 小)
        Comparator<Integer> c5 = c4.reversed(); // 反轉 (大 -> 小) -> (小 -> 大)
        Collections.sort(scores, c5);
        System.out.println("排序後: " + scores);
        // 如何將 "集合" 變成 "字串"
        // List -> String
        // [80, 90, 100] -> "80 90 100" (元素之間用空白隔開)
        String str = scores.stream()
                           //.map(data -> data + "")  // 將每一個元素(data) Integer 轉 String
                           //.map(data -> String.valueOf(data))  // 將每一個元素(data) Integer 轉 String
                           .map(String::valueOf)  // 將每一個元素(data) Integer 轉 String
                           .collect(Collectors.joining(" ")); // 每一個元素間用 " " 隔開
        System.out.println(str);
        
        
        
    }
}
