package com.ocp.day23_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class ReadAllLinesDemo {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/com/ocp/day23_io/data/program.txt");
        
        // Files.readAllLines 會得到 List<String> 集合
        try {
            List<String> lines = Files.readAllLines(path); // 會得到 List<String> 集合
            lines.stream()
                    .filter(line -> line.contains("Java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }
        
        // Files.lines 會得到 Stream<String> 串流
        try {
            Stream<String> stream = Files.lines(path); // 會得到 Stream<String> 串流
            stream.filter(line -> line.contains("Java"))
                  .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
}
