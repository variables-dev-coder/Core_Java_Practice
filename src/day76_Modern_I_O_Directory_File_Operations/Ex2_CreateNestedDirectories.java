package day76_Modern_I_O_Directory_File_Operations;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex2_CreateNestedDirectories {
    public static void main(String[] args) throws Exception {

        Path dir = Paths.get("project/data/logs/2025");

        Files.createDirectories(dir);

        System.out.println("Nested directories created: " + dir.toAbsolutePath());
    }
}

// Nested directories created: D:\SKILL\JAVA\Core_Java_Practice\project\data\logs\2025

//Creates all missing parent folders
//Never fails for missing parents