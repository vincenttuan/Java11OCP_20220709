package com.ocp.day14_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorted {
    public static void main(String[] args) {
        // 集合的排序問題
        // 利用 List.of() 建立出來的集合式 ImmutableCollections 不可變集合
        // 不支援新增,修改,刪除與排序
        List<Integer> scores = List.of(80, 100, 90);
        // 將 ImmutableCollections 不可變集合變為可變集合
        scores = new ArrayList<>(scores);
        System.out.println("排序前: " + scores);
        // 進行排序
        Collections.sort(scores); // 預設排序原則是自然排序(小->大)
        System.out.println("排序後: " + scores);
        // 進行排序(自訂排序原則)
        Collections.sort(scores, (o1, o2) -> o2 - o1);
        System.out.println("排序後: " + scores);
    }
}
