package com.ocp.day02;

public class TestBank {
    public static void main(String[] args) {
        // 一定要先開戶才可以進入系統服務流程
        Bank bank = new Bank();
        // 1. 開戶
        bank.createAccount("John");
        // 2. 進入系統服務流程
        do {            
            bank.serviceCatalog();
        } while (true);
    }
}
