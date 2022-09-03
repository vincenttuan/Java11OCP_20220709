package com.ocp.day13_set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo5 {
    public static void main(String[] args) {
        SortedSet<Integer> nums = new TreeSet<>();
        nums.add(5);
        nums.add(1);
        nums.add(9);
        nums.add(8);
        nums.add(6);
        nums.add(4);
        nums.add(2);
        // [1, 2, 4, 5, 6, 8, 9]
        System.out.println(nums);
        
        // 子集合
        SortedSet<Integer> sub = nums.subSet(2, 9); // 2 <= sub < 9
        System.out.println(sub); // [2, 4, 5, 6, 8]
        
        SortedSet<Integer> sub2 = nums.subSet(3, 7); // 3 <= sub < 7
        System.out.println(sub2); // [4, 5, 6]
        
        SortedSet<Integer> tail = nums.tailSet(5); // tail >= 5
        System.out.println(tail); // [5, 6, 8, 9]
    }
}
