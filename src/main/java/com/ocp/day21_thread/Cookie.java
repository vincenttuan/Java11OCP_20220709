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
    private boolean empty = true; // 放餅乾的盤子
    public synchronized void eat(int i) { // 吃餅乾程序
        if(empty) {
            try {
                wait(); // 等待
            } catch (Exception e) {
            }
        }
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 吃了第 %2d 塊餅乾\n", tName, i);
        empty = true; // 餅乾吃光了
        notify(); // 呼叫主人放餅乾
    }
    
    public synchronized void put(int i) { // 放餅乾程序
        if(!empty) {
            try {
                wait(); // 等待
            } catch (Exception e) {
            }
        }
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 放了第 %2d 塊餅乾, ", tName, i);
        empty = false; // 盤子內有餅乾
        notify(); // 呼叫小狗吃餅乾
    }
    
}
