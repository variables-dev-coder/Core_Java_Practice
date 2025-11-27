package day75_Modern_I_O_Reading_Writing_Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex6_DeleteFile {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("D:/SKILL/JAVA/Core_Java_Practice/src/day75_Modern_I_O_Reading_Writing_Files/Delete.txt");

        if(Files.deleteIfExists(path)) {
            System.out.println("File deleted");
        } else {
            System.out.println("File not found");
        }
    }
}


// Explanation
//Deletes file safely without throwing error if missing.