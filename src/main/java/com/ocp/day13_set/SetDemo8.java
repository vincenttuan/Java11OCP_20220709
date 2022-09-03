package com.ocp.day13_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo8 {
    public static void main(String[] args) {
        Student s1 = new Student("John", 18, new Score(100));
        Student s2 = new Student("Mary", 17, new Score(90));
        Student s3 = new Student("John", 18, new Score(100));
        
        Set<Student> students = new LinkedHashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        
        for(Student student : students) {
            System.out.println(student);
        }
    }
}
