package com.ocp.day13_set;

public class Score {
    private Integer value;

    public Score(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Score{" + "value=" + value + '}';
    }
    
    
}
