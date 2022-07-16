package com.ocp.day04;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = new String("jAVA");
        String s4 = "Java";
        String s5 = "Java";
        System.out.println(s1 == s2);  // false
        System.out.println(s1.equals(s2));  // true, equals() 大小寫視為不同
        System.out.println(s1.equals(s3));  // false
        System.out.println(s1.equalsIgnoreCase(s3));  // true, equalsIgnoreCase 大小寫視為相同
        System.out.println(s4 == s5);  // true
        System.out.println(s4.equals(s5));  // true
    }
}
