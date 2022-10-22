package com.ocp.day23_io;

// 讀取 myfile.txt 的內容

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        String basePath = "src/main/java/com/ocp/day23_io/data/";
        String fileName = "myfile.txt";
        String fullPath = basePath + fileName;
        try(FileReader fr = new FileReader(fullPath)) {
            // 將每次讀到的資料放到一個暫存區中
            char[] buffer = new char[1]; // 只能放一個 char
            // fr.read(buffer) 將每次讀取道的字元放入到 buffer 中
            // 若返回 -1 表示讀到檔尾
            while (fr.read(buffer) != -1) {                
                System.out.print(buffer); // 印出 buffer 內容
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
