package com.ocp.day01;

public class Calc {
    int x;
    int y;
    
    void printAddResult() { // 印出 add(加法) 的結果
        int result = x + y;
        System.out.println(result);
    }
    
    void printSubResult() { // 印出 sub(減法) 的結果
        int result = x - y;
        System.out.println(result);
    }
    
    int getAddResult() {  // 得到 add(加法) 的結果
        int result = x + y;
        return result;
    }
    
    int getSubResult() {  // 得到 sub(減法) 的結果
        int result = x - y;
        return result;
    }
}
