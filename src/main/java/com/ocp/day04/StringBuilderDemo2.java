package com.ocp.day04;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello Java");
        System.out.println(sb);
        // 插入 World 變成 "Hello World Java"
        // "Hello Java"
        //  0123456789
        // 在 index = 6 的地方插入 "World "
        sb.insert(6, "World ");
        System.out.println(sb);
    }
}
