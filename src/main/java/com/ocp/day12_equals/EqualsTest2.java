package com.ocp.day12_equals;

public class EqualsTest2 {
    public static void main(String[] args) {
        Paper p1 = new Paper("DoubleA", 80, Size.A4, Color.白, 7);
        Paper p2 = new Paper("DoubleA", 80, Size.A4, Color.白, 7);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
