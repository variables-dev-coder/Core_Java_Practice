package day76_Modern_I_O_Directory_File_Operations;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex10_DeleteEmptyFolders {
    public static void main(String[] args) throws Exception {

        Path root = Paths.get("project");

        Files.walk(root)
                .sorted((a, b) -> b.compareTo(a)) // delete children first
                .filter(Files::isDirectory)
                .forEach(p -> {
                    try {
                        Files.delete(p);
                        System.out.println("Deleted: " + p);
                    } catch (Exception ignored) {}
                });
    }
}

//Deleted: project\data\logs\2025
//Deleted: project\data\logs
//Deleted: project\data
//Deleted: project

//Deletes empty folders recursively
//Sort is required to avoid parent-before-child deletion