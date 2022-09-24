package com.ocp.day16_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
    
    public static void main(String[] args) {
        try {
            input();
            //return; // 即使有下達 return; finally 區段還是會被執行
            System.exit(0); // 強制結束指令, finally 區段不會執行
        } catch (InputMismatchException e) {
            System.out.println("有錯誤發生");
            System.out.println(e);
            e.printStackTrace(System.out); // 詳細錯誤資訊
            System.out.println("請重新輸入");
            //input();
        } finally {
            System.out.println("The end.");
        }
    }
    
    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入半徑: ");
        int r = scanner.nextInt();
        double area = Math.pow(r, 2) * Math.PI;
        System.out.printf("圓面積: %,.1f\n", area);
    }
    
}
