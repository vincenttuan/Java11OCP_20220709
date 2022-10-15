package com.ocp.day21_thread;

public class SetBalance implements Runnable {
    private Account account;
    private int balance;
    
    public SetBalance(Account account, int balance) {
        this.account = account;
        this.balance = balance;
    }
    
    @Override
    public void run() {
        account.setBalance(balance);
    }
}
