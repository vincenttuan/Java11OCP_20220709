package com.ocp.day16_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try {
            input();
        } catch (InputMismatchException e1) {
            System.out.println("您輸入的輸入不是數字");
            System.out.println(e1);
        } catch (ArithmeticException e2) {
            System.out.println("分母不可為 0");
            System.out.println(e2);
            System.out.println(e2.getMessage());
        }
    }
    
    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入分子: ");
        int x = scanner.nextInt();
        System.out.print("請輸入分母: ");
        int y = scanner.nextInt();
        int z = x / y;
        System.out.printf("計算結果: %d\n", z);
    }
}
