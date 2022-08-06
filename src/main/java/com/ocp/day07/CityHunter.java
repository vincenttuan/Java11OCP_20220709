package com.ocp.day07;

public class CityHunter extends Hunter {
    public void printBook() {
        System.out.print(getClass().getSimpleName() + " ");
        System.out.println("是一本漫畫書");
    }
}
