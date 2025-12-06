package day77_Modern_I_O_Exception_Handling_Best_Practices;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example9_ListFiles {

    public static void main(String[] args) {

        Path dir = Path.of(".");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path p : stream) {
                System.out.println("file" + p.getFileName());
            }
        } catch (IOException e) {
            System.err.println("Could not list files: " + e.getMessage());
        }
    }
}


//file.git
//file.gitignore
//file.idea
//filebackup_source.txt
//fileCore_Java_Practice.iml
//filedemo_folder
//fileheapdump-7572.hprof
//filejfr-recording.jfr
//filemy_data_folder
//fileout
//fileoutput.txt
//fileREADME.md
//filesrc