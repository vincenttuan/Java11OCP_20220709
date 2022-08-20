package com.ocp.day10;

import java.util.Arrays;

public class StreamDemo {
    public static void main(String[] args) {
        String[] names = {"Jo", "Vincent", "Helen", "Bob", "Mary", "Angle", "Jack"};
        System.out.println(Arrays.toString(names));
        // 找出名字在 4 個字以上的成員
        System.out.println("找出名字在 4 個字以上的成員:");
        Arrays.stream(names) // 將陣列串流化
              .filter(name -> name.length() > 4)
              .forEach(name -> System.out.println(name));
        // 在名字 4 個字以上的成員中選一個出來當班長(leader)
        String leader = Arrays.stream(names) // 將陣列串流化
                              .parallel() // 平行處理, (預設是 .sequential() 循序處理)
                              .filter(name -> name.length() > 4)
                              .findAny()  // 任意抓取一人
                              .get(); // 取出人名
        System.out.println("Leader: " + leader);
        
                
        
    }
}
