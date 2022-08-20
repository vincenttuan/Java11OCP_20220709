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
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // 一般方式
        Book b1 = new BookImpl();
        System.out.println(b1.getClass());
        b1.print();
        // 使用 :: 建立 MethodReference 實體
        Book b2 = BookImpl::new;
        System.out.println(b2.getClass());
    }
}
