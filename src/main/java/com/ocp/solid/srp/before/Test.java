package com.ocp.solid.srp.before;

public class Test {
    public static void main(String[] args) {
        MyPhone myPhone1 = new IPhone();
        myPhone1.dial("0912345678");
        myPhone1.send("Hello");
        myPhone1.watch();
        
        MyPhone myPhone2 = new OldPhone();
        myPhone2.dial("0912345678");
        myPhone2.send("Hello");
        myPhone2.watch();
    }
}
