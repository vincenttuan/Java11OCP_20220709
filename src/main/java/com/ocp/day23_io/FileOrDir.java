package com.ocp.day23_io;

// 判斷該路徑指的是檔案還是目錄 ?

import java.io.File;
import java.util.Arrays;

public class FileOrDir {
    public static void main(String[] args) {
        String basePath = "src/main/java/com/ocp/day23_io/";
        File file = new File(basePath);
        // 取得 basePath 下所有名稱
        String[] names = file.list();
        System.out.println(Arrays.toString(names));
        // 分析每一個名字是檔案還是目錄
        for(String name : names) {
            String fullPath = basePath + name;
            File f = new File(fullPath);
            if(f.isDirectory()) {
                System.out.println(name + "是目錄");
            } else {
                System.out.println(name + "是檔案");
            }
        }
    }
}
