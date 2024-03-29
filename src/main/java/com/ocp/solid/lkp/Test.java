package com.ocp.solid.lkp;

// 使用 LKP 原則
import com.ocp.solid.lkp.sol.Customer;
import com.ocp.solid.lkp.sol.PaperBoy;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer(new Wallet(500)),
                new Customer(new Wallet(400)),
                new Customer(new Wallet(300))
        );
        System.out.println(customers);
        
        // 送報生收款
        PaperBoy paperBoy = new PaperBoy(customers);
        paperBoy.collectMoney();
        
        System.out.println(customers);
    }
}
