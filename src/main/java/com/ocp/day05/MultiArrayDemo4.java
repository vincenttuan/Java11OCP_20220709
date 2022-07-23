package com.ocp.day05;

import java.util.Arrays;

public class MultiArrayDemo4 {
    public static void main(String[] args) {
        // 多維陣列的初始值
        int[][] m = {{100, 90, 80}, {70, 60, 50}}; // [2]x[3] 的二維陣列(對稱型)
        // 將資料透過 for-loop 依序印出
        for(int i=0 ; i < m.length ; i++) {
            System.out.println(m[i]);
            for(int k=0 ; k < m[i].length ; k++) {
                System.out.printf("m[%d][%d]: %d\n", i, k, m[i][k]);
            }
        }
        // 將資料透過 for-each(in) 依序印出
        for(int[] array : m) {
            for(int data : array) {
                System.out.println(data);
            }
        }
        // 將資料透過 for-loop 反序印出
        for(int i=m.length-1 ; i >= 0 ; i--) {
            for(int k=m[i].length-1 ; k >= 0 ; k--) {
                System.out.printf("m[%d][%d]: %d\n", i, k, m[i][k]);
            }
        }
        
        // 透過 Arrays.toString(一維陣列)
        // 注意: Arrays.toString(一維陣列) 只支援一維陣列
        for(int i=0 ; i<m.length ; i++) {
            System.out.printf("m[%d]: %s\n", i, Arrays.toString(m[i]));
        }
        for(int[] array : m) {
            System.out.println(Arrays.toString(array));
        }
        
    }
}
