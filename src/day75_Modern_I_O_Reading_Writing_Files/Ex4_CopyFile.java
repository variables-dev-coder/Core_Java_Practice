package day75_Modern_I_O_Reading_Writing_Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ex4_CopyFile {
    public static void main(String[] args) throws Exception {
        Path src = Paths.get("D:/SKILL/JAVA/Core_Java_Practice/src/day75_Modern_I_O_Reading_Writing_Files/Example4.txt");
        Path dest = Paths.get("D:/SKILL/JAVA/Core_Java_Practice/src/day75_Modern_I_O_Reading_Writing_Files/Example4_Copy.txt");

        Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
    }
}

//Explanation
//Copies file and replaces if already exists.