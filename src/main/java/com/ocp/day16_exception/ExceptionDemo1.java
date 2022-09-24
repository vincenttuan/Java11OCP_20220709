package com.ocp.day16_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
    
    public static void main(String[] args) {
        input();
    }
    
    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入半徑: ");
        try {
            int r = scanner.nextInt();
            double area = Math.pow(r, 2) * Math.PI;
            System.out.printf("圓面積: %,.1f\n", area);
        } catch (InputMismatchException e) {
            System.out.println("有錯誤發生");
            System.out.println(e);
            System.out.println("請重新輸入");
            input();
        }
        
    }
    
}
