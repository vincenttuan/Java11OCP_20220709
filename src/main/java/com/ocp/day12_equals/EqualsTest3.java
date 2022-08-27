package com.ocp.day12_equals;

public class EqualsTest3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 60000, "IT");
        Employee e2 = new Employee("John", 60000, "IT");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}

