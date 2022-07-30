package com.ocp.day06;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MyClass myClass2 = new MyClass();
        myClass.i = 100;
        myClass2.i = 200;
        MyClass.k = 10;
        myClass.k = 20; // 相當於 MyClass.k = 20;
        myClass2.k = 30; // 相當於 MyClass.k = 30;
        System.out.println(myClass.i);
        System.out.println(myClass2.i);
        System.out.println(MyClass.k);
    }
}
