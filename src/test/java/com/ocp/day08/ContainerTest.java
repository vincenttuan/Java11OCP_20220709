package com.ocp.day08;

public class ContainerTest {
    public static void main(String[] args) {
        Container c1 = new Bottle();
        Container c2 = new PoilPack();
        
        c1.printName();
        System.out.println(c1.capacity());
        
        c2.printName();
        System.out.println(c2.capacity());
    }
}
