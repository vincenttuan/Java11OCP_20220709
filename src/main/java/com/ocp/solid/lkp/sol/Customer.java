package com.ocp.solid.lkp.sol;

import com.ocp.solid.lkp.Wallet;

public class Customer {
    private Wallet wallet;

    public Customer(Wallet wallet) {
        this.wallet = wallet;
    }
    
    // 要求付款
    public void getPayment(int payment) {
        int total = wallet.getMoney();
        total = total - payment;
        wallet.setMoney(total);
    }

    @Override
    public String toString() {
        return "Customer{" + "wallet=" + wallet + '}';
    }
    
}
