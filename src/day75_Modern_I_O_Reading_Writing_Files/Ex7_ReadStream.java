package day75_Modern_I_O_Reading_Writing_Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ex7_ReadStream {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("D:/SKILL/JAVA/Core_Java_Practice/src/day75_Modern_I_O_Reading_Writing_Files/BigFile.txt");

        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(System.out::println);
        }
    }
}


//Explanation
//Reads the file line by line using a stream — great for big files.