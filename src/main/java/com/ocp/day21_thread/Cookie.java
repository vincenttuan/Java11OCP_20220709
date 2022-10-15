package com.ocp.day21_thread;

class Eat implements Runnable {
    private Cookie cookie;
    public Eat(Cookie cookie) {
        this.cookie = cookie;
    }
    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            cookie.eat(i);
        }
    }
}

class Put implements Runnable {
    private Cookie cookie;
    public Put(Cookie cookie) {
        this.cookie = cookie;
    }
    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            cookie.put(i);
        }
    }
}

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
