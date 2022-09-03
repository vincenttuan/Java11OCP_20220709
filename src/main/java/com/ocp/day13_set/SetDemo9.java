package com.ocp.day13_set;

import java.util.LinkedHashSet;
import java.util.Set;
import static java.util.stream.Collectors.toSet;

public class SetDemo9 {
    public static void main(String[] args) {
        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("Tom", 30, new Score(90)));
        students.add(new Student("Leon", 28, new Score(85)));
        students.add(new Student("Mary", 26, new Score(65)));
        students.add(new Student("Angle", 18, new Score(75)));
        students.add(new Student("Jean", 24, new Score(45)));
        students.add(new Student("Bob", 27, new Score(82)));
        students.add(new Student("Helen", 23, new Score(56)));
        
        // 將不及格的同學抓出來暑期輔導
        Set<Student> nonePassStudents = students.stream()
                                                .filter(s -> s.getScore().getValue() < 60)
                                                .collect(toSet()); // 將目前 stream 中的元素收集成一個 set 集合
        
        System.out.println(nonePassStudents);
    }
}
