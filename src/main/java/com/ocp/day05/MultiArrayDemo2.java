package com.ocp.day05;

public class MultiArrayDemo2 {
    public static void main(String[] args) {
        // 多維陣列-二維(2x?非對稱型)
        int[][] m = new int[2][];
        m[0] = new int[3];
        m[1] = new int[1];
        System.out.println("m: " + m);  // m 是一個二維陣列
        System.out.println("m[0]: " + m[0] + ", length: " + m[0].length);  // m[0] 是一個長度為3的一維陣列
        System.out.println("m[1]: " + m[1] + ", length: " + m[1].length);  // m[1] 是一個長度為1的一維陣列
        
        System.out.println("m[0][0]: " + m[0][0]);
        System.out.println("m[0][1]: " + m[0][1]);
        System.out.println("m[0][2]: " + m[0][2]);
        System.out.println("m[1][0]: " + m[1][0]);
        
    }
}
