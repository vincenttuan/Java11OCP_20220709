package com.ocp.day05;

public class MultiArrayDemo1 {
    public static void main(String[] args) {
        // 多維陣列-二維(2x3對稱型)
        int[][] m = new int[2][3];
        System.out.println("m: " + m);  // m 是一個二維陣列
        System.out.println("m[0]: " + m[0]);  // m[0] 是一個一維陣列
        System.out.println("m[1]: " + m[1]);  // m[1] 是一個一維陣列
        
        System.out.println("m[0][0]: " + m[0][0]);  // 內容值
        System.out.println("m[0][1]: " + m[0][1]);
        System.out.println("m[0][2]: " + m[0][2]);
        
        System.out.println("m[1][0]: " + m[1][0]);
        System.out.println("m[1][1]: " + m[1][1]);
        System.out.println("m[1][2]: " + m[1][2]);
    }
}
