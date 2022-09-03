package com.ocp.day14_list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("Leno");
        names.add("John");
        names.add(2, "Mary");
        names.add("Helen");
        System.out.println(names);
        
        // 走訪器
        ListIterator<String> iter = names.listIterator(0); // 從 0(預設) 開始尋訪
        // 往下(右)巡訪
        while (iter.hasNext()) {
            int index = iter.nextIndex(); // 得到元素內容的 index
            String value = iter.next(); // 得到元素內容的值
            System.out.printf("%d : %s\n", index, value);
        }
        // 往上(左)巡訪
        while(iter.hasPrevious()) {
            int index = iter.previousIndex();
            String value = iter.previous();
            System.out.printf("%d : %s\n", index, value);
        }
        
    }
}
