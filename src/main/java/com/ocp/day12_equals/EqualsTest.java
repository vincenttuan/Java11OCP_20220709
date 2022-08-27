package com.ocp.day12_equals;

public class EqualsTest {
    public static void main(String[] args) {
        Ball b1 = new Ball("red", 100);
        Ball b2 = new Ball("red", 100);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        /*
        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        */
    }
}
