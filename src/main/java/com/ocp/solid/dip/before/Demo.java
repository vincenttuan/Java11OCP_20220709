package com.ocp.solid.dip.before;

class Email { // 功能服務 一
    public String message() { return "email...";}
}

class Line { // 功能服務 二
    public String message() { return "line...";}
}

class MyPhone { // 手機
    public void read(Email email) { // 讀取 Email 服務訊息
        System.out.println(email.message());
    }
    public void read(Line line) { // 讀取 Line 服務訊息
        System.out.println(line.message());
    }
}

public class Demo {
    public static void main(String[] args) {
        MyPhone myPhone = new MyPhone();
        myPhone.read(new Email());
        myPhone.read(new Line());
    }
}
