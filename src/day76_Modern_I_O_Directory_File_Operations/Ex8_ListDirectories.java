package day76_Modern_I_O_Directory_File_Operations;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex8_ListDirectories {
    public static void main(String[] args) throws Exception {

        Files.list(Paths.get("project"))
                .filter(Files::isDirectory)
                .forEach(System.out::println);
    }
}

//project\data

//Common task in backend
//Good for folder management