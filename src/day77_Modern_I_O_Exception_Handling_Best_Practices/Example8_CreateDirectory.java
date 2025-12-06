package day77_Modern_I_O_Exception_Handling_Best_Practices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example8_CreateDirectory {

    public static void main(String[] args) {

        Path dir = Path.of("D:\\SKILL\\JAVA\\Core_Java_Practice\\src\\day77_Modern_I_O_Exception_Handling_Best_Practices/my_data_folder");

        try {
            if (!Files.exists(dir)) {
                Files.createDirectory(dir);
                System.out.println("Directory created!");
            } else {
                System.out.println("Directory already exists");
            }
        } catch (IOException e) {
            System.err.println("Failed to create directory: " + e.getMessage());
        }
    }
}

// Directory created!