package day77_Modern_I_O_Exception_Handling_Best_Practices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example6_DeleteFile {

    public static void main(String[] args) {

        Path path = Path.of("D:\\SKILL\\JAVA\\Core_Java_Practice\\src\\day77_Modern_I_O_Exception_Handling_Best_Practices/delete.txt");

        try {
            Files.deleteIfExists(path);
            System.out.println("File deleted or already removed.");
        } catch (IOException e) {
            System.err.println("Delete failed: " + e.getMessage());
        }
    }
}

//File deleted or already removed.