package com.ocp.day06;

import java.util.stream.Stream;

public class TestTest2 {
    public static void main(String[] args) {
        Test t1= new Test("國文", 100);
        Test t2= new Test("英文", 50);
        Test[] tests = {t1, t2, new Test("數學", 75)};
        System.out.println(tests);
        // for-loop 走訪資料
        for(int i=0;i<tests.length;i++) {
            System.out.println(tests[i]);
        }
        // for/each(in) 走訪資料
        for(Test test : tests) {
            System.out.println(test);
        }
        // Java 8 Stream
        Stream.of(tests).forEach(test -> System.out.println(test));
        Stream.of(tests).forEach(System.out::println);
    }
}
