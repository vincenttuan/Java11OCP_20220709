package com.ocp.day18_assertion;

public class Emp {
    private String name;
    private Integer salary;
    
    // 建構子
    public Emp(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("建立 Emp 物件 執行者: " + Thread.currentThread().getName());
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Emp 物件已被清除 執行者: " + Thread.currentThread().getName());
    }
    
}
