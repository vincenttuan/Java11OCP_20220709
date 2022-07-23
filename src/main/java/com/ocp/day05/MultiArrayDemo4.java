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
        
    }
}
