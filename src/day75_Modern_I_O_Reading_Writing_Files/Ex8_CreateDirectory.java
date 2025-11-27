package day75_Modern_I_O_Reading_Writing_Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex8_CreateDirectory {
    public static void main(String[] args) throws Exception {
        Path dir = Paths.get("D:/SKILL/JAVA/Core_Java_Practice/src/day75_Modern_I_O_Reading_Writing_Files/newDirectory.txt");

        if (!Files.exists(dir)) {
            Files.createDirectory(dir);
            System.out.println("Directory created");
        }
    }
}


// Explanation
//Creates a folder if it does not exist.