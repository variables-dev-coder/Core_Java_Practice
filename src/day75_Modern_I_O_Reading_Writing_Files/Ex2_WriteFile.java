package day75_Modern_I_O_Reading_Writing_Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Ex2_WriteFile {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("D:/SKILL/JAVA/Core_Java_Practice/src/day75_Modern_I_O_Reading_Writing_Files/Example2.txt");

        Files.write(path, Arrays.asList("Hello", "Java NIO", "Day 75 Learning"));
    }
}


//Explanation
//Writes 3 lines. Creates file automatically if not exists.