package com.ocp.solid.lkp.sol;

import java.util.List;

public class PaperBoy {
    // 有許多要收款的客戶
    List<com.ocp.solid.lkp.before.Customer> customers = null;
    public PaperBoy(List<com.ocp.solid.lkp.before.Customer> customers) {
        this.customers = customers;
    }
    // 收集所有報費金額 $100
    public void collectMoney() {
    
    }
}
