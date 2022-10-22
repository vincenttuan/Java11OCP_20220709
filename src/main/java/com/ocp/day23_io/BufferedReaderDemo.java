package com.ocp.day23_io;

// 利用緩衝區讀取 myfile.txt

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        String basePath = "src/main/java/com/ocp/day23_io/data/";
        String fileName = "myfile.txt";
        String fullPath = basePath + fileName;
        
        try(FileReader fr = new FileReader(fullPath);
            BufferedReader br = new BufferedReader(fr)) {
            
            String data = null;
            // 將資料逐行讀入字串 data
            while ( (data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
