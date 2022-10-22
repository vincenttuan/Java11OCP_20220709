package com.ocp.day23_io;

// 目錄深度走訪

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;
import javax.naming.directory.BasicAttributes;

public class FilesWalkDemo {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/");
        Stream<Path> files = Files.walk(path);
        files.forEach(fileName -> {
            try {
                Path currentPath = fileName.toAbsolutePath();
                if(fileName.getFileName().toString().contains("java")) {
                    System.out.print(++count + ". " + fileName + " : ");
                    System.out.println(Files.readAttributes(path, BasicFileAttributes.class).creationTime());
                }
            } catch (Exception e) {
            }
        });
        
        
        
    }
    
}
