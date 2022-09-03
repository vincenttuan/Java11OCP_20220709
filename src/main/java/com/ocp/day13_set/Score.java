package com.ocp.day13_set;

public class Score {
    private Integer score;

    public Score(Integer score) {
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" + "score=" + score + '}';
    }
    
}
