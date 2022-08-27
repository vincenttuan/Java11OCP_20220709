package com.ocp.solid.lsp.before;

class A {
    public int calc(int x, int y) { // 加法功能
        return x + y;
    }
}

class B extends A {
    
}

public class Demo {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.calc(10, 20)); // 加法
        
        A b = new B();
        System.out.println(b.calc(10, 20)); // 加法
    }
}
