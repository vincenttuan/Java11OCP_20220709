package com.ocp.day23_io;

// 寫入陣列字串資料

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        String basePath = "src/main/java/com/ocp/day23_io/data/";
        String fileName = "myfile.txt";
        String fullPath = basePath + fileName;
        String[] datas = {"Java", "爪哇"};
        try(FileWriter fw = new FileWriter(fullPath, false); // true 會保留原來的資料, false 會先清除原來的資料(預設)
            BufferedWriter bw = new BufferedWriter(fw)) {
            
            for(String data : datas) {
                bw.write(data);
                bw.newLine(); // 換行
            }
            System.out.println("資料寫入成功");
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
