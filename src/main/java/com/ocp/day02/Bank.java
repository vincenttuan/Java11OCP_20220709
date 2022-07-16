package com.ocp.day02;

import java.util.Scanner;

public class Bank {
    // 帳戶
    Account account;
    
    // 開戶服務
    void createAccount(String name) {
        account = new Account();
        account.name = name;
        System.out.printf("%s 開戶成功!\n", name);
    }
    
    // 功能服務
    void serviceCatalog() {
        if (account == null) {
            System.out.println("請先建立帳戶");
            System.exit(0);
        }
        System.out.println("------------");
        System.out.println("1. 存款");
        System.out.println("2. 提款");
        System.out.println("3. 檢視帳戶");
        System.out.println("4. 離開");
        System.out.println("------------");
        System.out.print("請輸入代號: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        switch (id) {
            case 1:
                // 進行存款服務程序
                depositService();
                break;
            case 2:
                // 進行提款服務程序
                withdrawService();
                break;
            case 3:
                // 檢視帳戶資料服務程序
                printAccountService();
                break;
            case 4:
                // 離開系統程序
                System.out.println("離開系統");
                System.exit(0); // 強制離開程式
        }
    }
    
    void depositService() { // 進行存款服務程序
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入存款金額: ");
        int amount = scanner.nextInt();
        account.deposit(amount); // 對帳號進行存款行為
    }
    
    void withdrawService() { // 進行提款服務程序
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入提款金額: ");
        int amount = scanner.nextInt();
        account.withdraw(amount); // 對帳號進行提款行為
    }
    
    void printAccountService() { // 檢視帳戶資料服務程序
        account.printAccount();
    }
    
}
