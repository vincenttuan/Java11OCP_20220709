package com.ocp.day12_enum.sol;

enum Sex {
    男, 女
}

public class Test {
    public static void showSex(Sex sex) {
        switch (sex) {
            case 男:
                System.out.println("男性");
                break;
            case 女:
                System.out.println("女性");
                break;
        }
    }
    public static void main(String[] args) {
        showSex(Sex.男);
        showSex(Sex.女);
        //showSex(1); // 不正確的用法, 編譯也不通過
        //showSex(2); // 不正確的用法, 編譯也不通過
        //showSex(-1); // 不正確的用法, 編譯也不通過
        //showSex(200); // 不正確的用法, 編譯也不通過
    }
}
