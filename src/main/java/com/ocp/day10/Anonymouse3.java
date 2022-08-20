package com.ocp.day10;

public class Anonymouse3 {
    public static void main(String[] args) {
        // Lambda (標準版)
        Printer printer1 = (String data) -> {
            System.out.println(data);
        };
        printer1.print("中午吃啥?");
        
        // Lambda (精簡版)
        Printer printer2 = (data) -> System.out.println(data);
        printer2.print("晚上吃啥?");
        
        // Lambda (精簡版 + :: 方法參考)
        Printer printer3 = System.out::println;
        printer3.print("消夜吃啥?");
        
        
    }
}
