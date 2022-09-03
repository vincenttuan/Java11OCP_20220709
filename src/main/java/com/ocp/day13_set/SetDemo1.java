package com.ocp.day13_set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        // 存放考試科目, 考試科目不得重複
        Set subjects = new HashSet();
        subjects.add("英文");
        subjects.add("英文"); // 重複資料會自動剔除
        subjects.add("數學");
        subjects.add("國文");
        System.out.println(subjects);
        System.out.println(subjects.size());
        // 利用 for/each 取出每一筆資料
        // 每一個元素預設都是 Object
        for(Object obj : subjects) {
            String subject = (String)obj; // 轉型成當初放入的資料型別
            System.out.println(subject);
        }
    }
}
