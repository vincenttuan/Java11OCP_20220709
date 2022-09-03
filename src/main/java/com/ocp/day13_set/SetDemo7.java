package com.ocp.day13_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo7 {
    public static void main(String[] args) {
        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("Tom", 30, new Score(90)));
        students.add(new Student("Leon", 28, new Score(85)));
        students.add(new Student("Mary", 26, new Score(65)));
        students.add(new Student("Angle", 18, new Score(75)));
        students.add(new Student("Jean", 24, new Score(45)));
        students.add(new Student("Bob", 27, new Score(82)));
        students.add(new Student("Helen", 23, new Score(56)));
        System.out.println(students);
        // 利用 Java 8 stream 來分析資料
        // 找年紀最大
        int max_age = students.stream()
                              //.peek(System.out::println)
                              .mapToInt(s -> s.getAge()) // 轉換為 age int 資料
                              //.peek(System.out::println)
                              .max()
                              .getAsInt();
        System.out.println("max_age: " + max_age);
        // 找年紀最大是誰 ?
        String max_age_name = students.stream()
                                      .filter(s -> s.getAge() == max_age)
                                      .findFirst()  // 找到第一個
                                      .get() // 得到 student 物件
                                      .getName(); // 取得人名
        System.out.println("max_age_name: " + max_age_name);
        
        // 找到最低分的人是誰 ?
        // 1. 先找到最低分的分數
        // 2. 再透過該分數找到人名
        int min_score = students.stream()
                                .mapToInt(s -> s.getScore().getValue())
                                //.peek(System.out::println)
                                .min()
                                .getAsInt();
        System.out.println("min_score: " + min_score);
        
        String min_score_name = students.stream()
                                        .filter(s -> s.getScore().getValue() == min_score)
                                        .findFirst()
                                        .get() // 得到 student 物件
                                        .getName(); // 取得人名
        System.out.println("min_score_name: " + min_score_name);
                
        
        
    }
}
