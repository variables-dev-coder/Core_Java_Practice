package day77_Modern_I_O_Exception_Handling_Best_Practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example1_ReadFileSafe {

    public static void main(String[] args) {

        Path path = Path.of("D:\\SKILL\\JAVA\\Core_Java_Practice\\src\\day77_Modern_I_O_Exception_Handling_Best_Practices/data1.txt");

        try (BufferedReader br = Files.newBufferedReader(path)) {
            br.lines().forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

//Handles missing file
//Auto-closes resource
//Safe