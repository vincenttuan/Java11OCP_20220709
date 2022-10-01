package com.ocp.day18_assertion;

public class Emp {
    private String name;
    private Integer salary;
    
    // 建構子
    public Emp(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("此物件已被清除");
    }
    
}
