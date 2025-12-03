package day76_Modern_I_O_Directory_File_Operations;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex1_CreateDirectory {
    public static void main(String[] args) throws Exception {

        Path dir = Paths.get("demo_folder");

        Files.createDirectory(dir);

        System.out.println("Directory created: " + dir.toAbsolutePath());
    }
}

// Directory created: D:\SKILL\JAVA\Core_Java_Practice\demo_folder

//Creates demo_folder in the project directory.
//❗ Fails if folder already exists.