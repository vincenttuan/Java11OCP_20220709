package com.ocp.day07;

public class Hunter extends Actor {

    @Override
    public void attack() {
        System.out.print(getClass().getSimpleName() + " ");
        System.out.println("用槍射擊");
    }
    
}
