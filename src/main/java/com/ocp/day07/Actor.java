package com.ocp.day07;

// 一般角色
public class Actor {
    public void attack() {
        System.out.print(getClass().getSimpleName() + " ");
        System.out.println("雙手攻擊");
    }
}
