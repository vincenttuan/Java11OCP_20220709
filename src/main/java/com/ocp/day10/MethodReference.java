package com.ocp.day10;

@FunctionalInterface
interface Book {
    void print();
}

class BookImpl implements Book {
    @Override
    public void print() {
        System.out.println("Java OCP 11");
    }
}

// 方法參考的應用
public class MethodReference {
    public static void main(String[] args) {
        // 一般方式
        Book b1 = new BookImpl();
        b1.print();
        // 使用 :: 建立實體
        Book b2 = BookImpl::new;
        b2.print();
    }
}
