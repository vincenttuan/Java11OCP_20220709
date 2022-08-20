package com.ocp.day10;

public class Outer {
    int x = 7; // Outer 的物件變數
    static int sx = 9; // Outer 的類別變數
    // 一般內部類別
    public class Inner {
        int x = 77; // Inner 的物件變數
        public void print() {
            int x = 777; // 區域變數
            System.out.println("A");
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Outer.this.x);
            System.out.println(Outer.sx);
        }
    }
    
    // 靜態內部類別
    public static class SInner {
        static int x = 8;
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
        // 在方法中自行建立物件與操作
        MInner minner = new MInner();
        minner.print();
    }
    
}
