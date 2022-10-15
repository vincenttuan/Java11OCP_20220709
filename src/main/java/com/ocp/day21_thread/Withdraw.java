package com.ocp.day21_thread;

public class Withdraw implements Runnable {
    private Account account;
    private int amount;
    
    public Withdraw(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }
    
    @Override
    public void run() {
        account.withdraw(amount);
    }
}
