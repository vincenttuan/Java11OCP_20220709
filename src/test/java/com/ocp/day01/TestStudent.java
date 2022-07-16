package com.ocp.day01;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student(); // 建立一個學生物件
        Student student2 = new Student(); // 建立一個學生物件
        Student student3 = new Student(); // 建立一個學生物件
        // 建立 student1 物件欄位的內容
        student1.no = 2001001;
        student1.name = "Vincent";
        student1.age = 18;
        // 建立 student2 物件欄位的內容
        student2.no = 2001002;
        student2.name = "Mary";
        student2.age = 19;
        // 建立 student3 物件欄位的內容
        student3.no = 2001003;
        student3.name = "Helen";
        student3.age = 17;
        // 印出 student1 的物件欄位內容
        System.out.printf("no: %d name: %s age: %d\n", student1.no, student1.name, student1.age);
        System.out.printf("no: %d name: %s age: %d\n", student2.no, student2.name, student2.age);
        System.out.printf("no: %d name: %s age: %d\n", student3.no, student3.name, student3.age);
    }
}
