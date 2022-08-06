package com.ocp.day07;

public class Magician extends Actor {

    @Override
    public void attack() {
        System.out.print(getClass().getSimpleName() + " ");
        System.out.println("施展魔法攻擊");
    }
    
    public void formula() { // 口訣
        System.out.print(getClass().getSimpleName() + " ");
        System.out.println("魔法口訣:天靈靈, 地靈靈...");
    }
    
}
