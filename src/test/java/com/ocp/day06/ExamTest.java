package com.ocp.day06;

public class ExamTest {
    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.subjectName = "國文";
        exam.setScore(90);
        System.out.printf("國文: %s\n", exam.subjectName);
        System.out.printf("分數: %d\n", exam.getScore());
        System.out.printf("及格: %b\n", exam.isPass());
    }
}
