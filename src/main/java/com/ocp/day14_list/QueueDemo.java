package com.ocp.day14_list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();
        System.out.println("佇列空的: " + names.isEmpty());
        names.offer("Leno");
        names.offer("Tom");
        names.offer("Helen");
        names.offer("Jack");
        System.out.println("佇列空的: " + names.isEmpty());
        System.out.println(names);
        // 拿走一個元素
        String name = names.poll(); // 注意: poll() 會拿走元素, 而 peek() 不會
        System.out.println("拿走: " + name);
        System.out.println(names);
        // 透過 while 將剩下的全部拿走
        while (!names.isEmpty()) { // 若佇列尚未空
            String n = names.poll();
            System.out.println("再拿走: " + n);
        }
        System.out.println("佇列空的: " + names.isEmpty());
        System.out.println(names);
    }
}
