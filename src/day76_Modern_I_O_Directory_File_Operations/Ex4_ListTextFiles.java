package day76_Modern_I_O_Directory_File_Operations;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex4_ListTextFiles {
    public static void main(String[] args) throws Exception {

        Path folder = Paths.get("project/data");

        try (DirectoryStream<Path> ds = Files.newDirectoryStream(folder, "*.txt")) {
            for (Path p : ds) {
                System.out.println(p);
            }
        }
    }
}

//Very efficient for filters
//Uses DirectoryStream