package com.ocp.solid.dip.sol;

interface Receiver {
    public String message();
}

class Email implements Receiver { // 功能服務 一
    public String message() { return "email...";}
}

class Line implements Receiver { // 功能服務 二
    public String message() { return "line...";}
}

class SMS implements Receiver { //  功能服務 三 (額外加上)
    public String message() { return "sms...";}
}

class MyPhone { // 手機實體(不可再變動了)
    public void read(Receiver receiver) { // 讀取服務訊息
        System.out.println(receiver.message());
    }
}

public class DIP {
    public static void main(String[] args) {
        MyPhone myPhone = new MyPhone();
        myPhone.read(new Email()); // 收 email
        myPhone.read(new Line()); // 收 line
        myPhone.read(new SMS()); // 收 sms
    }
}
