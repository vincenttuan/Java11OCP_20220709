package com.ocp.day12_enum.sol;

// 1美分: PENNY, 5美分: NICKLE, 10美分: DIME, 25美分: QUARTER
enum Uscoin {
    
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
    
    private int value;

    private Uscoin(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
}

public class Test2 {
    public static void main(String[] args) {
        Uscoin us1 = Uscoin.PENNY;
        System.out.println(us1.getValue());
    }
}
