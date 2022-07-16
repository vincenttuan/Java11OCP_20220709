package com.ocp.day02;

// 轉帳測試
public class TestAccountForTransfer {
    public static void main(String[] args) {
        Account act1 = new Account();
        act1.name = "John";
        act1.deposit(10000);
        
        Account act2 = new Account();
        act2.name = "Mary";
        act2.deposit(10000);
        
        // act1(John) 要轉帳 6000 元給 act2(Mary)
        act1.transfer(6000, act2);
        
        // 個別查詢帳戶資訊
        act1.printAccount();
        act2.printAccount();
        
    }
}
