package com.ocp.day07;

public class Magician extends Actor {

    @Override
    public void attack() {
        System.out.print(getClass().getSimpleName() + " ");
        System.out.println("施展魔法攻擊");
    }
    
}
