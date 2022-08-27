package com.ocp.solid.lkp;

public class Customer {
    private Wallet wallet;

    public Customer(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    @Override
    public String toString() {
        return "Customer{" + "wallet=" + wallet + '}';
    }
    
}
