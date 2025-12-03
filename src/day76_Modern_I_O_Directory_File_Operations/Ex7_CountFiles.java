package day76_Modern_I_O_Directory_File_Operations;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex7_CountFiles {
    public static void main(String[] args) throws Exception {

        long count = Files.walk(Paths.get("project"))
                .filter(Files::isRegularFile)
                .count();

        System.out.println("Total Files: " + count);
    }
}

// Total Files: 0

//Count files like Windows Explorer
//Good interview question