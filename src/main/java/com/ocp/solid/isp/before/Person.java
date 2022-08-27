package com.ocp.solid.isp.before;

public interface Person {
    void eat();
    void sleep();
    void code();
}

class Enginner implements Person {
    public void eat() {
        System.out.println("吃");
    }
    public void sleep() {
        System.out.println("睡");
    }
    public void code() {
        System.out.println("Java");
    }
}

class Baby implements Person {
    public void eat() {
        System.out.println("多吃");
    }
    public void sleep() {
        System.out.println("多睡");
    }
    // 客戶端不需要依賴他不需要的 interface 
    public void code() {
        throw new RuntimeException("沒有這種行為");
    }
}
