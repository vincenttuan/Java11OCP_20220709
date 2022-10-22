package com.ocp.day23_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesCopyAndDelete {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("src/main/java/com/ocp/day23_io/bar/A.txt");
        Path distPath = Paths.get("src/main/java/com/ocp/day23_io/foo/A.txt");
        try {
            Files.copy(sourcePath, distPath, StandardCopyOption.REPLACE_EXISTING); // 複製
            System.out.println("複製完畢");
            // 刪除來源端
            Files.delete(sourcePath);
            System.out.println("來源端檔案刪除");
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
}
