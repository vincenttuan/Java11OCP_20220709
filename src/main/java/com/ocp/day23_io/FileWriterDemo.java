package com.ocp.day23_io;

// 將資料寫入到檔案

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String basePath = "src/main/java/com/ocp/day23_io/data/";
        String fileName = "myfile.txt";
        String fullPath = basePath + fileName;
        String data = "Hello Java";
        System.out.println("將 " + data + " 寫入到 " + fullPath + " 中");
        try(FileWriter fw = new FileWriter(fullPath)) {
            fw.write(data); // 寫入
            fw.flush(); // 更新
            System.out.println("寫入成功");
            //fw.close(); // 因為使用 try() 所以可以不用寫
        } catch(IOException e) {
        }
    }
}
