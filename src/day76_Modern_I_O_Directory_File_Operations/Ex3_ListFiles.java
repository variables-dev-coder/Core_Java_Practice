package day76_Modern_I_O_Directory_File_Operations;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex3_ListFiles {
    public static void main(String[] args) throws Exception {

        Path folder = Paths.get("project/data");

        Files.list(folder)
                .forEach(System.out::println);
    }
}

//project\data\logs

//Lists only direct children
//Returns Stream<Path>