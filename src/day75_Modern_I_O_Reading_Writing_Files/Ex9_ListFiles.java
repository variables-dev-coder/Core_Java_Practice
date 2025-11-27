package day75_Modern_I_O_Reading_Writing_Files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex9_ListFiles {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get(".");

        DirectoryStream<Path> stream = Files.newDirectoryStream(dir);

        for (Path file : stream) {
            System.out.println(file.getFileName());
        }
    }
}

//.git
//.gitignore
//.idea
//Core_Java_Practice.iml
//heapdump-7572.hprof
//jfr-recording.jfr
//out
//README.md
//src


//Explanation
//Prints names of all files and folders in current directory.