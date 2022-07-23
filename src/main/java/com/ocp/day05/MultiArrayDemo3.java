package com.ocp.day05;

public class MultiArrayDemo3 {
    public static void main(String[] args) {
        // 多維陣列的初始值
        int[][] m = {{100, 90, 80}, {70, 60, 50}}; // [2]x[3] 的二維陣列(對稱型)
        System.out.println("m: " + m);
        System.out.println("m[0]: " + m[0]);
        System.out.println("m[1]: " + m[1]);
        
        System.out.println("m[0][0]: " + m[0][0]);  // 內容值
        System.out.println("m[0][1]: " + m[0][1]);
        System.out.println("m[0][2]: " + m[0][2]);
        
        System.out.println("m[1][0]: " + m[1][0]);
        System.out.println("m[1][1]: " + m[1][1]);
        System.out.println("m[1][2]: " + m[1][2]);
    }
}
