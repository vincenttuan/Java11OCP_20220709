package com.ocp.day18_assertion;

public class AssertTest {
    public static void main(String[] args) {
        int score = -50;
        
        // assert 檢查
        assert ((score >= 0) && (score <= 100)) : "分數範圍錯誤: " + score;
        
        System.out.println("分數: " + score);
    }
}
