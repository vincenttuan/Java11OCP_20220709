package com.ocp.day12_equals;

enum Size {
    A4, B5, A3, B4
}

enum Color {
    黑, 白, 黃
}
public class Paper {
    private String brandName; // 牌子
    private int pound; // 磅數
    private Size size; // 尺寸
    private Color color; // 顏色
    private int price;

    public Paper(String brandName, int pound, Size size, Color color, int price) {
        this.brandName = brandName;
        this.pound = pound;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Paper{" + "brandName=" + brandName + ", pound=" + pound + ", size=" + size + ", color=" + color + ", price=" + price + '}';
    }
    
    
    
}
