package com.ocp.solid;

class A {
    void printA() {
        System.out.println("Hello A");
    }
}

class B extends A {
    void printB() {
        System.out.println("Hello B");
    }
}

class C {
    void printC() {
        System.out.println("Hello C");
    }
}

class D {
    C c = null;

    public D() {
    }
    
    public D(C c) {
        this.c = c;
    }
    
    void printC() {
        if(c != null) {
            c.printC();
        }
    }
    
    void printD() {
        System.out.println("Hello D");
    }
}

public class 組合與繼承 {
    public static void main(String[] args) {
        B b = new B();
        b.printA(); // 即使你不要 printA() 也不行
        b.printB();
        
        D d = new D();
        d.printC();
        d.printD();
        
        D d2 = new D(new C());
        d2.printC();
        d2.printD();
    }
}
