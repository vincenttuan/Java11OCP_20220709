package com.ocp.day07;
class Foo {
    void aaa() {System.out.println("甲");}
    void bbb() {System.out.println("乙");}
}
class Bar extends Foo {
    void aaa() {System.out.println("丙");}
    void ccc() {System.out.println("戊");}
}
class Fun extends Foo {
    void bbb() {System.out.println("丁");}
    void ddd() {System.out.println("己");}
}

// 多型測試
public class PolyTest {
    public static void main(String[] args) {
        
    }
}
