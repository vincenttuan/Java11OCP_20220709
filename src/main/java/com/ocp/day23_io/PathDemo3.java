package com.ocp.day23_io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo3 {
    public static void main(String[] args) {
        // 路徑切換 relative()
        Path path1 = Paths.get("home");
        Path path2 = Paths.get("home/sally/bar");
        // path1 切換到 path2
        Path path1_to_path2 = path1.relativize(path2);
        System.out.println("path1 切換到 path2 => " + path1_to_path2);
        // path2 切換到 path1
        Path path2_to_path1 = path2.relativize(path1);
        System.out.println("path2 切換到 path1 => " + path2_to_path1);
    }
}
