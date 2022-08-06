package com.ocp.day07;

// 角色扮演遊戲
public class ActorDemo {
    public static void main(String[] args) {
        Actor actor1 = new Actor();  // 建立一般角色
        Actor actor2 = new Hunter(); // 建立獵人角色
        Actor actor3 = new CityHunter(); // 建立城市獵人角色
        
        actor1.attack();
        actor2.attack();
        actor3.attack();
        
    }
}
