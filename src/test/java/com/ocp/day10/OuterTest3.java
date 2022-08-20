package com.ocp.day10;

public class OuterTest3 {
    public static void main(String[] args) {
        // 調用靜態內部類別
        // 透過 Outer 直接取用
        Outer.SInner sinner = new Outer.SInner();
        sinner.print();
    }
}
