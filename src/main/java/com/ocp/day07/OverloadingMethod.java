package com.ocp.day07;
public class OverloadingMethod {
    public void input(Integer x) {
        System.out.println("A");
    }
    /*
    public void input(int x) {
        System.out.println("B");
    }
    */
    public void input(double x) {
        System.out.println("C");
    }
    
    public static void main(String[] args) {
        OverloadingMethod om = new OverloadingMethod();
        //om.input(Integer.valueOf(0));
        om.input(0);
    }
}
