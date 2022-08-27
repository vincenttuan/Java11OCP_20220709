package com.ocp.day12_equals;

import java.util.Objects;

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
    
    // 使用精靈產生 hashCode() 與 equals() 的實作
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.brandName);
        hash = 97 * hash + this.pound;
        hash = 97 * hash + Objects.hashCode(this.size);
        hash = 97 * hash + Objects.hashCode(this.color);
        hash = 97 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paper other = (Paper) obj;
        if (this.pound != other.pound) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.brandName, other.brandName)) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        return this.color == other.color;
    }
    
    
    
    @Override
    public String toString() {
        return "Paper{" + "brandName=" + brandName + ", pound=" + pound + ", size=" + size + ", color=" + color + ", price=" + price + '}';
    }
    
    
    
}
