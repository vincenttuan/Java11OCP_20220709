package com.ocp.day06;

public class TestTest {
    public static void main(String[] args) {
        Test test = new Test(); // 建構時不帶參數
        test.subjectName = "國文";
        test.setScore(90);
        System.out.printf("科目: %s\n", test.subjectName);
        System.out.printf("分數: %d\n", test.getScore());
        System.out.printf("及格: %b\n", test.isPass());
        //------------------------------------------------
        Test test2 = new Test("數學", 100); // 建構時帶入二個參數
        System.out.printf("科目: %s\n", test2.subjectName);
        System.out.printf("分數: %d\n", test2.getScore());
        System.out.printf("及格: %b\n", test2.isPass());
        //------------------------------------------------
        Test test3 = new Test("英文", 80); // 建構時帶入二個參數
        System.out.println(test3.toString()); // 印出物件資料(以字串方式呈現)
        System.out.println(test3); // 相當於 test3.toString()
    }
}
