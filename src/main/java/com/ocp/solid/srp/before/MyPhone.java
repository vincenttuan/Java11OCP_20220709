package com.ocp.solid.srp.before;

public interface MyPhone {
    public void dial(String number); // 打電話
    public void send(String message); // 發送 SMS
    public void watch(); // 看直播
}
// 智慧電話, IPhone
class IPhone implements MyPhone {
    public void dial(String number) {
        System.out.println("撥打: " + number);
    }
    public void send(String message) {
        System.out.println("發送: " + message);
    }
    public void watch() {
        System.out.println("看直播");
    }
}

// 老式電話, 只能撥號
class OldPhone implements MyPhone {
    public void dial(String number) {
        System.out.println("撥打: " + number);
    }
    public void send(String message) {
        throw new RuntimeException("無此功能");
    }
    public void watch() {
        throw new RuntimeException("無此功能");
    }
}
