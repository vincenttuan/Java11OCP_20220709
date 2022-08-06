package com.ocp.day08;

// 寶特瓶
public class Bottle implements Container {

    @Override
    public void printName() {
        System.out.println("寶特瓶");
    }

    @Override
    public int capacity() {
        return 250;
    }
    
}
