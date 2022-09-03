package com.ocp.day13_set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
        // <> 泛型(化)
        // <> 的效果是發生在編譯時期, 而非執行時期
        Set<Integer> scores = new LinkedHashSet<>(); // Java 7.0 以前 new LinkedHashSet<Integer>();
        scores.add(100);    // Integer
        //scores.add(3.14);   // Double
        scores.add(80);     // Integer
        //scores.add("John"); // String
        scores.add(90);     // Integer
        System.out.println(scores);
        
        int sum = 0;
        for(Integer score : scores) {
            sum += score;
        }
        System.out.println(sum);
        
        int sum2 = 0;
        Iterator<Integer> iter = scores.iterator();
        while (iter.hasNext()) {
            Integer next = iter.next();
            sum2 += next;
        }
        System.out.println(sum2);
    }
}
