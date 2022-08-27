package com.ocp.solid.isp.sol;

interface Person {
    void eat();
    void sleep();
}

interface Programmer {
    void code();
}

class Enginner implements Person, Programmer {
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
}


public class ISP {
    
}
