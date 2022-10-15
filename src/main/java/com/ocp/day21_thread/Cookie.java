package com.ocp.day21_thread;

public class Cookie {
    
    public void eat(int i) { // 吃餅乾程序
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 吃了第 %d 塊餅乾\n", tName, i);
    }
    
    public void put(int i) { // 放餅乾程序
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 放了第 %d 塊餅乾\n", tName, i);
    }
    
}
