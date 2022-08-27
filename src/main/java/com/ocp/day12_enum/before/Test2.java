package com.ocp.day12_enum.before;

// 1美分: PENNY, 5美分: NICKLE, 10美分: DIME, 25美分: QUARTER
class UScoin {
    private int value;
    public UScoin(int value) {
        if(value == 1 || value == 5 || value == 10 || value == 25) {
            this.value = value;
        } else {
            throw new RuntimeException("金額不對");
        }
    }
    public int getValue() {
        return value;
    }
}

public class Test2 {
    public static void main(String[] args) {
        UScoin us1 = new UScoin(1); // 1美分: PENNY
        UScoin us5 = new UScoin(5); // 5美分: NICKLE
        UScoin us10 = new UScoin(10); // 10美分: DIME
        UScoin us25 = new UScoin(25); // 25美分: QUARTER
        
        UScoin us27 = new UScoin(27); // 27美分: ????
    }
}
