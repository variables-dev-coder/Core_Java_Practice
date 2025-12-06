package day77_Modern_I_O_Exception_Handling_Best_Practices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example10_WalkFileTree {

    public static void main(String[] args) {

        Path root = Path.of(".");

        try {
            Files.walk(root)
                    .filter(Files::isRegularFile)
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Walk failed: " + e.getMessage());
        }
    }
}

//Walk entire directory
//Handles errors
//Best practice for scanning folders