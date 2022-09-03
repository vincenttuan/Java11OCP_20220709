package com.ocp.day13_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        // 存放考試科目, 考試科目不得重複
        Set subjects = new HashSet();
        subjects.add("英文");
        subjects.add("英文"); // 重複資料會自動剔除
        subjects.add("數學");
        subjects.add("國文");
        subjects.add("無"); // 需要被移除的元素
        System.out.println(subjects);
        System.out.println(subjects.size());
        
        // 利用 for/each 取出每一筆資料
        // 每一個元素預設都是 Object
        for(Object obj : subjects) {
            String subject = (String)obj; // 轉型成當初放入的資料型別
            System.out.println(subject);
        }
        // 利用 Iterator 走訪器
        // [無, 英文, 國文, 數學]
        Iterator iter = subjects.iterator(); // 取得 iterator 走訪器
        while (iter.hasNext()) {
            Object obj = iter.next();
            String subject = (String)obj; // 轉型成當初放入的資料型別
            System.out.println(subject);
        }
        // 利用 Iterator 走訪器並將 "無" 的元素資料移除 
        iter = subjects.iterator(); // 重新取得 iterator 走訪器
        while (iter.hasNext()) {
            Object obj = iter.next();
            String subject = (String)obj; // 轉型成當初放入的資料型別
            if(subject.equals("無")) {
                iter.remove();
            }
        }
        System.out.println(subjects);
    }
}
