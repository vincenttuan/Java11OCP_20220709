package com.ocp.day14_list;

import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class VectorDemo {
    public static void main(String[] args) {
        //Vector vector = new Vector();
        //Vector vector = new Vector(41);
        Vector vector = new Vector(41, 5);
        for(int i=1;i<=41;i++) {
            vector.add(100);
        }
        vector.add(100); // 意外增加了節點
        System.out.printf("capcity(空間數量): %d\n", vector.capacity());
        System.out.printf("size(已用數量): %d\n", vector.size());
        System.out.printf("vector(容器內容): %s\n", vector);
    }
}
