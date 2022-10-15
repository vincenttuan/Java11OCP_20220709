package com.ocp.day21_thread;

public class Account {
    private int balance; // 帳戶餘額

    public Account(int balance) {
        this.balance = balance;
    }

    public void withdraw(String amount) {
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 得到的帳戶餘額: $%d\n", tName, balance);
        
        for(int i=0;i<=2100000000;i++); // 模擬延遲
        
        System.out.printf("%s 得到的帳戶餘額: $%d\n", tName, balance);
    }
    
}
