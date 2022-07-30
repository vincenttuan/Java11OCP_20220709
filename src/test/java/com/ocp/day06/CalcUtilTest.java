package com.ocp.day06;

public class CalcUtilTest {
    public static void main(String[] args) {
        System.out.println(CalcUtil.add(10, 20));
        System.out.println(CalcUtil.add(10, 20, 30));
        int[] nums = {10, 20, 30, 40, 50};
        System.out.println(CalcUtil.add(nums));
        System.out.println(CalcUtil.add(50));
        System.out.println(CalcUtil.add()); // 不放置參數也行

        System.out.println(CalcUtil.sub(10, 20));
    }
}
