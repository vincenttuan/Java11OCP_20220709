package com.ocp.day10;

public class OuterTest2 {
    public static void main(String[] args) {
        // 建立 Outer 物件
        Outer outer = new Outer();
        // 建立一般內部類別物件 Outer.Inner
        Outer.Inner inner = outer.new Inner();
        inner.print();
        
    }
}
