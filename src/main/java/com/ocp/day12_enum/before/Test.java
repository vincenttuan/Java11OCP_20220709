package com.ocp.day12_enum.before;

interface Sex {
    int 男 = 1;
    int 女 = 2;
}

public class Test {
    public static void showSex(int sex) {
        switch (sex) {
            case Sex.男:
                System.out.println("男性");
                break;
            case Sex.女:
                System.out.println("女性");
                break;
        }
    }
    public static void main(String[] args) {
        showSex(Sex.男);
        showSex(Sex.女);
        showSex(1);
        showSex(2);
        showSex(-1); // 不正確的用法, 但是編譯卻通過了
        showSex(200); // 不正確的用法, 但是編譯卻通過了
    }
}
