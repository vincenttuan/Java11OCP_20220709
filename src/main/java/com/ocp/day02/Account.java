package com.ocp.day02;

public class Account {
    String name; // 戶名
    int balance; // 餘額
    
    void deposit(int amount) { // 存款, amount 用來表示存款金額變數
        if (amount > 0) { // 判斷 amount 是否大於 0
            balance += amount; // 目前餘額(balance) = 目前餘額(balance) + 存款金額(amount)
        } else {
            System.out.printf("存款金額錯誤: %,d\n", amount);
        }
    }
    
    void withdraw(int amount) { // 提款, amount 用來表示提款金額變數
        // 提款金額 > 0 且 提款金額 <= 帳戶餘額
        if (amount > 0 && amount <= balance) {
            balance -= amount; // 目前餘額(balance) = 目前餘額(balance) - 提款金額(amount)
        } else {
            System.out.printf("提款金額錯誤: %,d\n", amount);
        }
    }
    
    void transfer(int amount, Account targetAccount) { // 轉帳
        // 檢查轉帳金額
        if (amount <= 0 || amount > balance) {
            System.out.printf("轉帳失敗: %d\n", amount);
            return; // 方法提早結束
        }
        // 進行轉帳
        withdraw(amount); // 轉帳方提款程序
        targetAccount.deposit(amount); // 接收方進行存款程序
        System.out.println("轉帳成功");
    }
    
    void printAccount() { // 列印帳戶資訊
        System.out.printf("name: %s balance: %,d\n", name, balance);
    }
    
}
