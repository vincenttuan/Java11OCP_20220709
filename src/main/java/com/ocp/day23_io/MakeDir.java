package com.ocp.day23_io;

// 建立資料夾

import java.io.File;

public class MakeDir {
    public static void main(String[] args) {
        String basePath = "src/main/java/com/ocp/day23_io/"; // 基礎路徑
        String folderName = "data"; // data 資料夾
        String fullPath = basePath + folderName;
        File file = new File(fullPath);
        if(file.mkdir()) { // 建立資料夾命令
            System.out.println("建立" + folderName + "資料夾成功");
        } else {
            System.out.println(folderName + "資料夾已經存在或路徑錯誤");
        }
        
    }
}
