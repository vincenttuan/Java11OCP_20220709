package com.ocp.day10;

public class OuterTest {
    public static void main(String[] args) {
        // 建立 Outer 物件
        Outer outer = new Outer();
        // 建立一般內部類別物件 Outer.Inner
        Outer.Inner inner = outer.new Inner();
        inner.print();
        // 調用靜態內部類別
        // 透過 Outer 直接取用
        Outer.SInner sinner = new Outer.SInner();
        sinner.print();
        // 呼叫 foo() 方法
        outer.foo();
    }
}
