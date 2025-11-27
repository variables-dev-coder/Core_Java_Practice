package day75_Modern_I_O_Reading_Writing_Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Ex3_AppendFile {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("D:/SKILL/JAVA/Core_Java_Practice/src/day75_Modern_I_O_Reading_Writing_Files/Example3.txt");

        String data = "Appended line\n";

        Files.write(path, Arrays.asList("Hello", "Java NIO", "Day 75 Learning"));

        Files.write(path, data.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}

//Explanation
//Adds new line at the end. Creates file if missing.