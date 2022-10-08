package com.ocp.collection_modify;

// Jav 11 1z0-819 考試重點

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 可變集合(mutable), 不可變集合(immutable), 不可修改集合(unmodifiable)
public class Test2 {
    public static void main(String[] args) {
        // 可變集合(mutable), 可以自由進行元素新增修改刪除與排序
        List list_a = new ArrayList();
        list_a.add("B");
        list_a.add("A");
        list_a.add("C");
        System.out.println("list_a: " + list_a);
        
        // 不可修改集合(unmodifiable)
        List list_c = Collections.unmodifiableList(list_a); // Returns an unmodifiable
        System.out.println("list_c: " + list_c);
        
        // list_c 不可以自己新增元素 "D"
        // 必須透過 list_a 來達成
        // 將 list_a 增加一個元素 "D"
        list_a.add("D");
        System.out.println("list_a: " + list_a);
        // 是否會影響 list_c: 會
        // list_a 會影響 list_c
        System.out.println("list_c: " + list_c);
    }
}
