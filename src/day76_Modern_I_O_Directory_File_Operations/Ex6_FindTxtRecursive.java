package day76_Modern_I_O_Directory_File_Operations;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex6_FindTxtRecursive {
    public static void main(String[] args) throws Exception {

        Path root = Paths.get("project");

        Files.walk(root)
                .filter(Files::isRegularFile)
                .filter(p -> p.toString().endsWith(".txt"))
                .forEach(System.out::println);   //
    }
}


// Real backend example
// Used in log scanning, batch processing