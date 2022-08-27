package com.ocp.solid.lkp.sol;

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
            // 請客戶付現金給我
            customer.getPayment(100);
        }
    }
}
