package com.ocp.day06;

// 計算工具
public class CalcUtil {
    public static int add(int x, int y) {
        return x + y;
    }
    
    public static int add(int x, int y, int z) {
        return x + y + z;
    }
    
    public static int add(int [] nums) {
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
