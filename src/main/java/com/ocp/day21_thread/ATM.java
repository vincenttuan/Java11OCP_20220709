package com.ocp.day21_thread;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10000);
        Withdraw withdraw = new Withdraw(account, 2000);
        SetBalance setBalance = new SetBalance(account, 5000);
        Thread t1 = new Thread(withdraw, "T1");
        Thread t2 = new Thread(setBalance, "T2");
        t1.start();
        t2.start();
    }
}
