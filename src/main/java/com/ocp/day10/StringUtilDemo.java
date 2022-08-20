package com.ocp.day10;

public class StringUtilDemo {
    public static void main(String[] args) {
        
        StringUtil stringUtil = (message) -> {
            return message.length();
        };
        
        StringUtil stringUtil2 = (message) -> message.length();
        
        StringUtil stringUtil3 = String::length;
        
        System.out.println(stringUtil.calc("ABCDEFG"));
        System.out.println(stringUtil2.calc("ABCDEFG"));
        System.out.println(stringUtil3.calc("ABCDEFG"));
    }
}
