package com.ocp.day05;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        // Java 5 以前
        Integer num1 = Integer.valueOf(100); // 建立一個整數物件
        int x1 = num1.intValue(); // 透過 intValue() 將資料取出
        System.out.println(x1); 
        
        // Java 5 提供了自動拆箱(unboxing), 裝箱(boxing)功能
        Integer num2 = 100; // 編譯器會自動轉為 Integer.valueOf(100), auto-boxing 自動裝箱
        int x2 = num2; // 編譯器會自動轉為 num2.intValue(), auto-unboxing 自動拆箱
        System.out.println(x2); 
        
        // 混合計算
        Integer a = 10;
        Integer b = Integer.valueOf(20);
        int c = 30;
        int result1 = a + b + c;
        Integer result2 = a + b + c;
        System.out.println(result1);
        System.out.println(result2);
        
    }
}

