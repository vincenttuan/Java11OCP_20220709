package com.ocp.day16_exception;

import java.util.Scanner;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        input();
    }
    
    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入分子: ");
        //---------------------------------------------------
        String data = scanner.next(); // 得到使用者所輸入的內容
        // 判斷 data 是否都是含有數字的字串 ?
        if(!data.matches("\\d+")) { // 正則表示式
            System.out.println("請輸入數字"); 
            return;
        }
        int x = Integer.parseInt(data); // 將字串轉數字
        //---------------------------------------------------
        System.out.print("請輸入分母: ");
        // 請自行撰寫分母是否是數字的判斷 ?
        int y = scanner.nextInt();
        
        // 判斷 y 是否為 0 ?
        if(y == 0) {
            System.out.println("分母不可為 0");
            return; // 方法結束
        }
        int z = x / y;
        System.out.printf("計算結果: %d\n", z);
    }
}
