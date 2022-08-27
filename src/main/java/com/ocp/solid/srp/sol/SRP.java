package com.ocp.solid.srp.sol;

interface Call {
    public void dial(String number); // 打電話
}
interface Transfer {
    public void send(String message); // 發送 SMS
}
interface TV {
    public void watch(); // 看直播
}

class IPhone { // 單一職責
    // 組合需要的功能
    Call call = (number) -> System.out.println("撥號: " + number);
    Transfer transfer = (msg) -> System.out.println("訊息: " + msg);
    TV tv = () -> System.out.println("看直播");
}

class OldPhone { // 單一職責
    // 組合需要的功能
    Call call = (number) -> System.out.println("撥號: " + number);
    // 沒有 Transfer 與 TV 功能
}

public class SRP {
    public static void main(String[] args) {
        IPhone myPhone1 = new IPhone();
        myPhone1.call.dial("0912345678");
        myPhone1.transfer.send("Hello");
        myPhone1.tv.watch();
        
        OldPhone myPhone2 = new OldPhone();
        myPhone2.call.dial("0912345678");
    }
}
