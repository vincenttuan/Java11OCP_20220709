package com.ocp.day13_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {
    public static void main(String[] args) {
        Set scores = new HashSet(); // 無序集合
        scores.add(100);
        scores.add(80);
        scores.add(90);
        System.out.println("HashSet 無序集合: " + scores);
        
        Set scores2 = new LinkedHashSet(); // 有序集合(會自動按照元素先後加入的順序排列)
        scores2.add(100);
        scores2.add(80);
        scores2.add(90);
        System.out.println("LinkedHashSet 有序集合: " + scores2);
        
        Set scores3 = new TreeSet(); // 排序集合(會自動按照元素內容由小->大排序)
        scores3.add(100);
        scores3.add(80);
        scores3.add(90);
        System.out.println("TreeSet 排序集合: " + scores3);
    }
}
