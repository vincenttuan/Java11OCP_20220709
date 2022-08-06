package com.ocp.day07;

class Father {
    Animal play(int x, String s) throws Exception { return null; }
}

class Son extends Father {
    @Override
    Dog play(int x, String s) throws RuntimeException { return null; }
}

class Animal {
    
}

class Dog extends Animal {

}

public class OverrideMethod {
    
}
