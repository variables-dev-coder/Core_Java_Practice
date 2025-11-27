package day75_Modern_I_O_Reading_Writing_Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ex5_MoveFile {
    public static void main(String[] args) throws Exception {
        Path src = Paths.get("D:/SKILL/JAVA/Core_Java_Practice/src/day75_Modern_I_O_Reading_Writing_Files/OldFile.txt");
        Path dest = Paths.get("D:/SKILL/JAVA/Core_Java_Practice/src/day75_Modern_I_O_Reading_Writing_Files/NewFile.txt");

        Files.move(src, dest, StandardCopyOption.REPLACE_EXISTING);
    }
}

//Explanation
//Renames file or moves it to another folder
//from old file are copy and transfer to new file, and old file deleted
// If again run this same code without old its throw exception