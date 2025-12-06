package day77_Modern_I_O_Exception_Handling_Best_Practices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Example7_StreamLargeFile {

    public static void main(String[] args) {

        Path path = Path.of("D:\\SKILL\\JAVA\\Core_Java_Practice\\src\\day77_Modern_I_O_Exception_Handling_Best_Practices/message.txt");

        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error streaming file: " + e.getMessage());
        }
    }
}

//Best for large files — doesn't load entire file into memory.