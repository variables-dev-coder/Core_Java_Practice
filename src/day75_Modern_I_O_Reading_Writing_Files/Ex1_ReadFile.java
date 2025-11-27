package day75_Modern_I_O_Reading_Writing_Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex1_ReadFile {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("D:/SKILL/JAVA/Core_Java_Practice/src/day75_Modern_I_O_Reading_Writing_Files/example1.txt");

        List<String> lines = Files.readAllLines(path);

        lines.forEach(System.out::println);
    }
}

//Explanation
//Reads all text lines from example1.txt and prints them.