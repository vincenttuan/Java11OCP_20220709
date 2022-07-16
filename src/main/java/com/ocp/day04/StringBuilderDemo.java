package com.ocp.day04;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ");
        sb.append("Java").append(" ").append("11").append("!");
        System.out.println(sb); // Hello Java 11!
    }
}
