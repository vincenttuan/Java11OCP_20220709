package com.ocp.solid.dip.before;

class Email { // 功能服務 一
    public String message() { return "email...";}
}

class Line { // 功能服務 二
    public String message() { return "line...";}
}

class SMS { //  功能服務 三 (額外加上)
    public String message() { return "sms...";}
}

class MyPhone { // 手機實體(不可再變動了)
    public void read(Email email) { // 讀取 Email 服務訊息
        System.out.println(email.message());
    }
    public void read(Line line) { // 讀取 Line 服務訊息
        System.out.println(line.message());
    }
    // 被迫加入實作, 違反"開放關閉原則"
    public void read(SMS sms) { // 讀取 SMS 服務訊息
        System.out.println(sms.message());
    }
}

public class Demo {
    public static void main(String[] args) {
        MyPhone myPhone = new MyPhone();
        myPhone.read(new Email()); // 收 email
        myPhone.read(new Line()); // 收 line
        myPhone.read(new SMS());  // 收 sms
    }
}
