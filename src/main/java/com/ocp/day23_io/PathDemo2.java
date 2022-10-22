package com.ocp.day23_io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo2 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/temp/foo/bar/");
        Path path2 = Paths.get("test.txt");
        path1 = path1.resolve(path2); // 相對路徑結合
        System.out.println("path1 = " + path1);
        Path path3 = Paths.get("/demo.txt"); // 絕對( 開頭是 / )路徑結合
        path1 = path1.resolve(path3);
        System.out.println("path1 = " + path1);
    }
}
