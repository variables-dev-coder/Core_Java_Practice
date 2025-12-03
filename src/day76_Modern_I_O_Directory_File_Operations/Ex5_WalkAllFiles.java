package day76_Modern_I_O_Directory_File_Operations;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex5_WalkAllFiles {
    public static void main(String[] args) throws Exception {

        Path root = Paths.get("project");

        Files.walk(root)
                .forEach(System.out::println);
    }
}

//project
//project\data
//project\data\logs
//project\data\logs\2025


//Lists all files + folders recursively
//Very powerful for scanning apps