package com.ocp.day07;

// 角色扮演遊戲
public class ActorDemo {
    public static void main(String[] args) {
        Actor actor1 = new Actor();  // 建立一般角色
        Actor actor2 = new Hunter(); // 建立獵人角色
        Actor actor3 = new CityHunter(); // 建立城市獵人角色
        Actor actor4 = new Magician(); // 建立魔法師
        
        Actor[] actors = {actor1, actor2, actor3, actor4};
        for(Actor actor : actors) {
            actor.attack();
        }
    }
}
