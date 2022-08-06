package com.ocp.day09;

public class Tank extends Car implements Weapon {

    @Override
    public void move() {
        System.out.println("用履帶走");
    }

    @Override
    public void shoot() {
        System.out.println("發射榴彈砲");
    }
    
}
