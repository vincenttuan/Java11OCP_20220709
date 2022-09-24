package com.ocp.day16_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandler {
    public static void main(String[] args) {
        // 因為 FileInputStream 配置在 try() 會自動呼叫 Closeable
        // public void close() throws IOException;
        // 所以需要 catch IOException
        
        try(FileInputStream in = new FileInputStream("foo.txt")) {}
        catch(IOException e) {
        }
        
        
        try {
            FileInputStream in = new FileInputStream("foo.txt");
        } catch(FileNotFoundException e) {
        }
    }
}
