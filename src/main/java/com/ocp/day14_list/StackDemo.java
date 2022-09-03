package com.ocp.day14_list;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("Tom");
        names.push("Leon");
        names.push("Mary");
        names.push("John");
        System.out.println(names);
        // 全部取出
        while(!names.isEmpty()) {
            String name = names.pop();
            System.out.println("取出: " + name + " names:" + names);
        }
        System.out.println(names);
    }
}
