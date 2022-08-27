package com.ocp.solid.lkp.before;

public class Wallet {
    private int money;

    public Wallet(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Wallet{" + "money=" + money + '}';
    }
    
}
