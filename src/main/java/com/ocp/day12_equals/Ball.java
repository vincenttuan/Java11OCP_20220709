package com.ocp.day12_equals;

public class Ball {
    private String color;
    private int price;

    public Ball(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        Ball b = (Ball)obj;
        if(b.color.equals(color) && b.price == price) {
            return true;
        }
        return false;
    }
    
    
    
    @Override
    public String toString() {
        return "Ball{" + "color=" + color + ", price=" + price + '}';
    }
    
}
