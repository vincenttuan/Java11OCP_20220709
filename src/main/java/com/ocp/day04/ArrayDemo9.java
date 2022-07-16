package com.ocp.day04;

import java.util.Arrays;

public class ArrayDemo9 {
    public static void main(String[] args) {
        // 字串陣列
        String[] names = {"Java", "Python", "Go", "Foxpro", "Objective-C", "Swift", "Kotlin", "C"};
        //String[] names = {"Java", "Go"};
        System.out.println(Arrays.toString(names));
        // 請求出平均字串長度為何?
        int sum = 0; // 字串元素總長度
        for(int i=0;i<names.length;i++) {
            String name = names[i];  // 取得字串元素
            int lens = name.length(); // 取得字串元素的長度
            sum += lens;
        }
        System.out.println("字串元素總長度: " + sum);
        double avg = (double)sum/names.length;
        System.out.println("平均字串長度: " + avg);
    }
}
