package com.ocp.day06;

public class Varage {
    public static void call(int... x) {
        System.out.println("C");
    }
    public static void call(Integer x, Integer y) {
        System.out.println("B");
    }
    public static void call(int x, int y) {
        System.out.println("BB");
    }
    public static void call(int x) {
        System.out.println("A");
    }
    
}
