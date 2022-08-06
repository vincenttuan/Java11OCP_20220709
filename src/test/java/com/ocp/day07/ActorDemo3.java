package com.ocp.day07;

// 角色扮演遊戲
public class ActorDemo3 {
    public static void main(String[] args) {
        Actor actor1 = new Actor();  // 建立一般角色
        Actor actor2 = new Hunter(); // 建立獵人角色
        Actor actor3 = new CityHunter(); // 建立城市獵人角色
        Actor actor4 = new Magician(); // 建立魔法師
        Hunter hunter = new Hunter();
        CityHunter cityHunter = new CityHunter();
        Magician magician = new Magician();
        
        Actor[] actors = {actor1, actor2, actor3, actor4, hunter, cityHunter, magician};
        for(Actor actor : actors) {
            actor.attack();
        }
    }
}
