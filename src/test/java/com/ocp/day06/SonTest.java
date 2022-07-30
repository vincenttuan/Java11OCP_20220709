package com.ocp.day06;

public class SonTest {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.money);
        son.job();
        System.out.println(son.getClass().getName());
        System.out.println(son.getClass().getSimpleName());
    }
}
