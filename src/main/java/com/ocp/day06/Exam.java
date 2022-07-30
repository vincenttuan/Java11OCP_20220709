package com.ocp.day06;

public class Exam {
    String subjectName; // 科目
    private int score; // 分數
    
    // 設定分數的方法
    public void setScore(int score){
        // 判斷 score 是否介於0~100之間
        if(score >= 0 && score <= 100) {
            this.score = score;
        }
    }
    
    // 取得分數的方法
    public int getScore() {
        return score;
    }
    
    boolean isPass() { // 判斷是否及格 ?
        return score >= 60;
    }
}
