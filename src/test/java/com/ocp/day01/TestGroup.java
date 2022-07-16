package com.ocp.day01;

public class TestGroup {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        // 設定 teacher 物件欄位資料
        teacher.tno = "T01";teacher.name="Vincent";teacher.salary=10_0000;
        student1.no = 2001001;student1.name="Bob";student1.age=18;
        student2.no = 2001002;student2.name="Jack";student2.age=19;
        student3.no = 2001003;student3.name="Helen";student3.age=17;
        // 組團隊
        Group group = new Group();
        group.teacher = teacher;
        group.student1 = student1;
        group.student2 = student2;
        group.student3 = student3;
        // 印出團隊 teacher 的資料
        System.out.printf("tno: %s name: %s salary: %,.1f\n", group.teacher.tno, group.teacher.name, group.teacher.salary);
        // 印出團隊 student 的資料 (請學生練習)
        System.out.printf("no: %d name: %s age: %d\n", group.student1.no, group.student1.name, group.student1.age);
        System.out.printf("no: %d name: %s age: %d\n", group.student2.no, group.student2.name, group.student2.age);
        System.out.printf("no: %d name: %s age: %d\n", group.student3.no, group.student3.name, group.student3.age);
    }
}
