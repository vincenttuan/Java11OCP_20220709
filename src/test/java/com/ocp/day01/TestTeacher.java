package com.ocp.day01;

public class TestTeacher {
    public static void main(String[] args) {
        var teacher1 = new Teacher(); // 建立 teacher 物件
        var teacher2 = new Teacher(); // 建立 teacher 物件
        // 設定 teacher1 物件欄位資料
        teacher1.tno = "T001"; 
        teacher1.name = "Bob";
        teacher1.salary = 54321.5;
        // 設定 teacher2 物件欄位資料
        teacher2.tno = "T002"; 
        teacher2.name = "Jack";
        teacher2.salary = 76543.5;
        // 印出 teacher1 的物件欄位內容
        System.out.printf("tno: %s name: %s salary: %.1f\n", teacher1.tno, teacher1.name, teacher1.salary);
        // 印出 teacher2 的物件欄位內容
        System.out.printf("tno: %s name: %s salary: %.1f\n", teacher2.tno, teacher2.name, teacher2.salary);
    }
}
