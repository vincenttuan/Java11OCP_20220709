package com.ocp.day06;

// 組合
// Student + Test
public class Student {
    private String name; // 學生姓名
    private Test test; // 測驗成績 
    
    public Student(String name, Test test) {
        this.name = name;
        this.test = test;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", test=" + test + '}';
    }

}
