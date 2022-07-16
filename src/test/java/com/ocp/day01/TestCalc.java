package com.ocp.day01;

public class TestCalc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        // 設定資料
        calc.x = 300;
        calc.y = 200;
        // 印出結果
        calc.printAddResult();
        calc.printSubResult();
        // 得到結果(另外設定一個區域變數來存放)
        int add_result = calc.getAddResult();
        int sub_result = calc.getSubResult();
        // 自行印出結果
        System.out.println(add_result);
        System.out.println(sub_result);
    }
}
