package com.ocp.solid.lkp.before;

import com.ocp.solid.lkp.Wallet;

public class Customer {
    private Wallet wallet;

    public Customer(Wallet wallet) {
        this.wallet = wallet;
    }
    
    // 讓外界可以取得皮包
    public Wallet getWallet() {
        return wallet;
    }

    @Override
    public String toString() {
        return "Customer{" + "wallet=" + wallet + '}';
    }
    
}
