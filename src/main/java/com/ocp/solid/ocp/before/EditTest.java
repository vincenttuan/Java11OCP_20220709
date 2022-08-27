package com.ocp.solid.ocp.before;

class Rectangle {
    public String toString() { return "畫矩形";};
}

class Traingle {
    public String toString() { return "畫三角形";};
}

class Circle { // 新功能
    public String toString() { return "畫圓形";};
}

class Edit { // 編輯板 (不可改變)
    public void draw(Rectangle rectangle) {
        System.out.println(rectangle);
    }
    public void draw(Traingle traingle) {
        System.out.println(traingle);
    }
    // 不可以加入 Circle, 因為會違反開放封閉原則
}

public class EditTest {
    public static void main(String[] args) {
        // 使用 Edit 物件
        Edit edit = new Edit();
        edit.draw(new Rectangle());
        edit.draw(new Traingle());
    }
}
