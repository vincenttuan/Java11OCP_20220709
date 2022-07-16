package com.ocp.day04;

import java.util.Arrays;

public class ArrayDemo10 {
    public static void main(String[] args) {
        // 字串陣列
        String[] names = {"Java", "Python", "Go", null, "Foxpro", "Objective-C", "Swift", "Kotlin", "C"};
        System.out.println(Arrays.toString(names));
        // 印出每一個元素字串長度為何?
        Arrays.stream(names)
              .mapToInt(name -> (name == null)? 0 : name.length())
              .forEach(name -> System.out.print(name + " "));
        System.out.println();
        // 請求出平均字串長度為何?
        double avg = Arrays.stream(names)
                           .mapToInt(name -> (name == null) ? 0 : name.length())
                           .average()
                           .getAsDouble();
        System.out.println("平均字串長度: " + avg);
    }
}
