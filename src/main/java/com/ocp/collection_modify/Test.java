package com.ocp.collection_modify;

// Jav 11 1z0-819 考試重點

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 可變集合(mutable), 不可變集合(immutable), 不可修改集合(unmodifiable)
public class Test {
    public static void main(String[] args) {
        // 可變集合(mutable), 可以自由進行元素新增修改刪除與排序
        List list_a = new ArrayList();
        list_a.add("B");
        list_a.add("A");
        list_a.add("C");
        System.out.println("list_a: " + list_a);
        
        // 不可變集合(immutable)
        List list_b = Arrays.asList("B", "A", "C"); // Returns a fixed-size list
        //list_b.add("D"); // 不可增加元素
        //list_b.add(0, "D"); // 不可修改元素
        //list_b.remove(0); // 不可刪除元素
        Collections.sort(list_b); // 可排序
        System.out.println("list_b: " + list_b);
        
        // 不可修改集合(unmodifiable)
        List list_c = List.of("B", "A", "C"); // Returns an unmodifiable
        //list_c.add("D"); // 不可增加元素
        //list_c.add(0, "D"); // 不可修改元素
        //list_c.remove(0); // 不可刪除元素
        //Collections.sort(list_c); // 不可排序
        System.out.println("list_c: " + list_c);
    }
}
