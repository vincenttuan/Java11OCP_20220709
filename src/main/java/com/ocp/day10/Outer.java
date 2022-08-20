package com.ocp.day10;

public class Outer {
    // 一般內部類別
    public class Inner {
        public void print() {
            System.out.println("A");
        }
    }
    
    // 靜態內部類別
    public static class SInner {
        public static void print() {
            System.out.println("B");
        }
    }
    
    // 在物件方法中有內部類別-該內部稱為方法內部類別
    public void foo() {
        // 方法內部類別(此類別上不可以加入權限)
        class MInner {
            public void print() {
                System.out.println("C");
            }
        }
    }
    
}
