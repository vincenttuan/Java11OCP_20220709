package com.ocp.day20_thread;

import java.util.ArrayList;
import java.util.List;

public class MyJobs2 {
    public static void main(String[] args) {
        // 因為 Runnable 是 FunctionalInterface
        // 所以可以支援 Lambda 語法
        Runnable program = () -> System.out.println("寫程式");
        Runnable report = () -> System.out.println("寫報告");
        Runnable drink = () -> System.out.println("喝咖啡");
        // 將所有 Runnable 放到 List 中
        // List.of 所創建的集合是不可變集合
        // 不可對集合元素進行排序, 元素位置調動, 新增/刪除元素
        List<Runnable> list = List.of(program, report, drink); 
        // 執行 list 中的任務
        // 將 r 放到執行緒中去執行
        list.forEach(r -> new Thread(r).start());
        
        /*
        List<Runnable> list2 = new ArrayList<>(); // 可變集合
        list2.add(program);
        list2.add(report);
        list2.add(drink);
        */
    }
}
