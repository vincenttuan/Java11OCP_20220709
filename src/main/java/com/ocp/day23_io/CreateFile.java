package com.ocp.day23_io;

// 建立檔案

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        String basePath = "src/main/java/com/ocp/day23_io/data/";
        String fileName = "myfile.txt";
        String fullPath = basePath + fileName;
        File file = new File(fullPath);
        try {
            if(file.createNewFile()) {
                System.out.println("建立" + fileName + "檔案成功");
            } else {
                System.out.println(fileName + "檔案已存在");
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
