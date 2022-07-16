package com.ocp.day02;

public class TestAccount {
    public static void main(String[] args) {
        Account act1 = new Account();
        // 開戶
        act1.name = "Vincent";
        // 存款
        act1.deposit(10000);
        // 存款
        act1.deposit(5000);
        // 存款
        act1.deposit(-4000);
        // 提款
        act1.withdraw(8000);
        // 提款
        act1.withdraw(80000);
        // 檢視帳戶資料
        act1.printAccount();
    }
}
