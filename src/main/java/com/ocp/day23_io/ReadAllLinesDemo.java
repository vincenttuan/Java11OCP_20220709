package com.ocp.day23_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllLinesDemo {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/com/ocp/day23_io/data/program.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            lines.stream()
                    .filter(line -> line.contains("Java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
}
