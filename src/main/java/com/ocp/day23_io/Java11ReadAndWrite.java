package com.ocp.day23_io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Java11ReadAndWrite {
    public static void main(String[] args) throws Exception {
        String data = "Hello";
        Path path = Paths.get("src/main/java/com/ocp/day23_io/data/hello.txt");
        // 將 data 資料寫入到 hello.txt
        Files.writeString(path, data, StandardOpenOption.CREATE_NEW);
        System.out.println("寫入成功");
        // 讀取 hello.txt 的資料
        System.out.println("讀取: " + Files.readString(path));
        
    }
}
