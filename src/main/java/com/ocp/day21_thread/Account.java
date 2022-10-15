package com.ocp.day21_thread;

public class Account {
    private int balance; // 帳戶餘額

    public Account(int balance) {
        this.balance = balance;
    }
    
    // 提款
    public synchronized void withdraw(int amount) {
        String tName = Thread.currentThread().getName();
        
        System.out.printf("%s 得到的帳戶餘額(1): $%d\n", tName, balance);
        
        for(int i=0;i<=2100000000;i++); // 模擬延遲 
        
        System.out.printf("%s 得到的帳戶餘額(2): $%d\n", tName, balance);
        
    }
    
    // 修改餘額
    public synchronized void setBalance(int balance) {
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 修改帳戶餘額(前): $%d\n", tName, this.balance);
        this.balance = balance;
        System.out.printf("%s 修改帳戶餘額(後): $%d\n", tName, this.balance);
    }
    
}
