package com.ocp.day23_io;

import java.nio.file.Path;
import java.nio.file.Paths;

// 透過 nio 讀取此檔的相關資訊
public class PathDemo {
    public static void main(String[] args) {
        String myPath = "src/main/java/com/ocp/day23_io/PathDemo.java";
        Path path = Paths.get(myPath);
        System.out.println("getFileName: " + path.getFileName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getRoot: " + path.getRoot());
        System.out.println("getNameCount: " + path.getNameCount());
        System.out.println("subpath(0, 2): " + path.subpath(0, 2));
        System.out.println("isAbsolute: " + path.isAbsolute());
        System.out.println("toAbsolutePath: " + path.toAbsolutePath());
        System.out.println("toUri: " + path.toUri());
    }
}
