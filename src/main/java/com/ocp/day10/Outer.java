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
            System.out.println(Outer.SInner.x);
            System.out.println(SInner.x);
            
            SInner sinner = new SInner();
            System.out.println(sinner.y);
        }
    }
    
    // 靜態內部類別
    public static class SInner {
        int y = 10;
        static int x = 8;
        public static void print() {
            System.out.println("B");
            System.out.println(x);
            System.out.println(Outer.sx);
            
            SInner sinner = new SInner();
            System.out.println(sinner.y);
            
            Outer.Inner inner = new Outer().new Inner();
            System.out.println(inner.x);
            
            
        }
    }
    
    // 在物件方法中有內部類別-該內部稱為方法內部類別
    public void foo() {
        final int x = 100; // final 區域變數
        int y = 200; // 看似一般區域變數
                     // 若方法內部類別有使用則在編譯時期會修飾成
                     // final int y = 200;
        // y = 300;  // 若有寫此行, 則編譯時期無法加入 final 修飾
                     // 則方法內部類別中就無法使用 y
        // 方法內部類別(此類別上不可以加入權限)
        class MInner {
            public void print() {
                System.out.println("C");
                System.out.println(x);
                System.out.println(y);
            }
        }
        // 在方法中自行建立物件與操作
        MInner minner = new MInner();
        minner.print();
    }
    
}
