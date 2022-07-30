package com.ocp.day06;

// 隨堂測驗
public class Test {
    String subjectName; // 科目
    private Integer score; // 分數
    
    // 建構子
    public Test() {
        
    }
    
    // 建構子
    public Test(String subjectName, Integer score) {
        this.subjectName = subjectName;
        setScore(score);
    }
    
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        if(score >= 0 && score <= 100) {
            this.score = score;
        }
    }
    
    public Boolean isPass() {
        if (score == null) {
            return null;
        }
        return score >= 60;
    }
    
    // 改寫 toString()
    @Override
    public String toString() {
        String message = String.format("科目: %s 分數: %d 及格: %s", 
                                       subjectName, getScore(), isPass());
        return message;
    }
}
