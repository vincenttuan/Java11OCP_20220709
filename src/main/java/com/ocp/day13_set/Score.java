package com.ocp.day13_set;

import java.util.Objects;

public class Score {
    private Integer value;

    public Score(Integer value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.value);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Score other = (Score) obj;
        return Objects.equals(this.value, other.value);
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
