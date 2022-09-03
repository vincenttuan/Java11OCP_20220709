package com.ocp.day13_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        Set scores = new LinkedHashSet();
        scores.add(100);                 // 是 Integer 物件 不是 int
        scores.add(Integer.valueOf(80)); // 是 Integer 物件 
        scores.add(null);                // null
        scores.add(90);                  // 是 Integer 物件 不是 int
        System.out.println(scores);
        // 計算總分
        int sum = 0;
        for(Object obj : scores) {
            if(obj == null) {
                continue;
            }
            Integer score = (Integer)obj;
            sum += score;
        }
        System.out.println(sum);
    }
}
