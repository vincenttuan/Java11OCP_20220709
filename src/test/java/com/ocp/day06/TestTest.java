package com.ocp.day06;

public class TestTest {
    public static void main(String[] args) {
        Test test = new Test();
        test.subjectName = "國文";
        test.setScore(900);
        System.out.printf("科目: %s\n", test.subjectName);
        System.out.printf("分數: %d\n", test.getScore());
        System.out.printf("及格: %b\n", test.isPass());
    }
}
