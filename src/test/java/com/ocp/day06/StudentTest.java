package com.ocp.day06;

public class StudentTest {
    public static void main(String[] args) {
        Test test = new Test("Java", 90);
        Student student = new Student("John", test);
        System.out.println(student);
        //------------------------------------------
        Student student2 = new Student("Mary", "Java", 55);
        System.out.println(student2);
    }
}
