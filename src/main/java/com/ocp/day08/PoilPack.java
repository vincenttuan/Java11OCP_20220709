package com.ocp.day08;

// 鋁箔包
public class PoilPack implements Container {

    @Override
    public void printName() {
        System.out.println("鋁箔包");
    }

    @Override
    public int capacity() {
        return 250;
    }
    
}
