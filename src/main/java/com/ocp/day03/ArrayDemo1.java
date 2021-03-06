package com.ocp.day03;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int x;  
        x = 10; 
        System.out.println("x=" + x); // 區域變數在使用之前必須要給定初始值
        
        // 特例: 若區域變數是陣列, 則 Java 會自動給定初始值
        int[] scores = new int[3];  // 會自動有初始值 [0, 0, 0]
        // 陣列長度
        System.out.println("陣列長度:" + scores.length);
        // 內容(一個一個顯示)
        System.out.println("陣列內容:" + scores[0] + ", " + scores[1] + ", " + scores[2]);
        // 內容(一個一個顯示 使用 for-loop)
        System.out.print("陣列內容:");
        for(int index=0;index<scores.length;index++) {
            System.out.print(scores[index] + ", ");
        }
        System.out.println();  // 換行
        // 內容(一個一個顯示 使用 Arrays.toString(陣列變數))
        System.out.println("陣列內容:" + Arrays.toString(scores));
    }
}
