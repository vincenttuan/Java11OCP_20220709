package com.ocp.day13_set;

public class Student {
    private String name;
    private Integer age;
    private Score score;

    public Student() {
    }

    public Student(String name, Integer age, Score score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", score=" + score + '}';
    }
    
    
}
