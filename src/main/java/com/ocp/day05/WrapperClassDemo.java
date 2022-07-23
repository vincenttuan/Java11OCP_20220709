package com.ocp.day05;

public class WrapperClassDemo {
    public static void main(String[] args) {
        // 取得 int 的最大值
        int max = Integer.MAX_VALUE; // 基本型的整數(只能放資料)
        System.out.println(max);
        
        Integer number = Integer.valueOf(100); // 物件型的整數(除了可放資料, 還具備其他功能服務)
        System.out.println(number.intValue()); // 將 number 物件裡的資料以 int 型態取出
        
        
    }
}
