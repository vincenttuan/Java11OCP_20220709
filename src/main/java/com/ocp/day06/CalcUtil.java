package com.ocp.day06;

// 計算工具
public class CalcUtil {
    // ... 表示可以放置 0~N 個參數(也可以放陣列參數)
    public static int add(int... nums) {
        int sum = 0;
        for(int n : nums) {
            sum += n;
        }
        return sum;
    }
    
    public static int sub(int x, int y) {
        return x - y;
    }
}
