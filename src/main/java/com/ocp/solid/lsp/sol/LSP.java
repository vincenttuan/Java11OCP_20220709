package com.ocp.solid.lsp.sol;

class A {
    public int calc(int x, int y) { // 加法功能
        return x + y;
    }
}

class B extends A {
    A a = new A();
    public int calc_A(int x, int y) { // 加法功能
        return a.calc(x, y);
    }
    
    public int calc(int x, int y) { // 減法功能
        return x - y;
    }
    
}

public class LSP {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.calc(10, 20));
        System.out.println(b.calc_A(10, 20));
    }
}
