package com.ocp.day09;

public class Fighter extends Airplane implements Weapon {
    @Override
    public void speed() {
        System.out.println("1000公里");
    }

    @Override
    public void shoot() {
        System.out.println("發射小牛飛彈");
    }
}
