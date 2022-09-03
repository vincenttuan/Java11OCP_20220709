package com.ocp.day14_list;

import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("Leno");
        names.add("John");
        names.add(2, "Mary");
        names.add("Helen");
        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(names.size()-1));
        // 移除
        names.remove("John");
        System.out.println(names);
        names.remove(2); // 移除 index = 2
        System.out.println(names);
        // 修改
        names.set(0, "Tomcat");
        System.out.println(names);
        
        
        
    }
}
