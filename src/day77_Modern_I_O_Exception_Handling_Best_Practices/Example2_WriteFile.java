package day77_Modern_I_O_Exception_Handling_Best_Practices;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example2_WriteFile {

    public static void main(String[] args) {

        Path path = Path.of("D:\\SKILL\\JAVA\\Core_Java_Practice\\src\\day77_Modern_I_O_Exception_Handling_Best_Practices/output.txt");
        String content = "Hello Munna! Writing safely using Modern I/O.";

        try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            bw.write(content);
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.err.println("Failed to write file: " + e.getMessage());
        }
    }
}

//File written successfully!