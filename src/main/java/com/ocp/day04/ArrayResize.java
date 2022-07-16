package com.ocp.day04;

import java.util.Arrays;

public class ArrayResize {
    public static void main(String[] args) {
        int[] arr = {100, 90, 80};
        System.out.println(Arrays.toString(arr));
        
        arr = Arrays.copyOf(arr, arr.length+1);
        System.out.println(Arrays.toString(arr));
        
        arr[arr.length - 1] = 70;
        System.out.println(Arrays.toString(arr));
    }
}
