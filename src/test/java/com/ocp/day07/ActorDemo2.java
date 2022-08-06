package com.ocp.day07;

// 角色扮演遊戲
public class ActorDemo2 {
    public static void main(String[] args) {
        Actor actor1 = new Magician(); // 建立魔法師
        Magician actor2 = new Magician(); // 建立魔法師
        
        actor1.attack(); // 只能呼叫 attack() 方法
        ((Magician)actor1).formula(); // 要透過轉型才能呼叫 formula() 方法
        
        actor2.attack(); // 可以呼叫 attack() 方法
        actor2.formula(); // 可以呼叫 formula() 方法
    }
}
