package com.ocp.solid.lkp.before;

import java.util.List;

// 送報生: 負責收款
public class PaperBoy {
    // 有許多要收款的客戶
    List<Customer> customers = null;
    public PaperBoy(List<Customer> customers) {
        this.customers = customers;
    }
    // 收集所有報費金額 $100
    public void collectMoney() {
        for(Customer customer : customers) {
            // 先拿到客戶的皮包
            Wallet wallet = customer.getWallet();
            // 再在從皮包裡面拿錢
            int total = wallet.getMoney();
            // 扣掉 $100 元
            total = total - 100;
            // 將找的錢放回皮包
            wallet.setMoney(total);
        }
    }
}
