package com.ocp.day04;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        System.out.println(sb + ", " + sb.length());
        String s = "";
        System.out.println(s + ", " + s.length());
        
        // StringBuilder 的 equals 實作內容是使用 ==
        System.out.println(sb.equals(s));
        System.out.println(sb.toString().equals(s));  // 將 sb 轉為字串之後再與 s 相比
        System.out.println(sb.toString().equals(s.toString()));
        System.out.println(sb.equals(new StringBuilder(s))); // false
        
        
        
    }
}
