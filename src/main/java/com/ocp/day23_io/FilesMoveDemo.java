package com.ocp.day23_io;

// 檔案移動

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesMoveDemo {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("src/main/java/com/ocp/day23_io/bar/A.txt");
        Path distPath = Paths.get("src/main/java/com/ocp/day23_io/foo/A.txt");
        try {
            // StandardCopyOption.ATOMIC_MOVE 原子移動, 表示在移動的過程中不會被其他請求使用
            // 使用 move() 相當於 copy() + delete()
            Files.move(sourcePath, distPath, StandardCopyOption.ATOMIC_MOVE);
            System.out.println("檔案移動完成");
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
