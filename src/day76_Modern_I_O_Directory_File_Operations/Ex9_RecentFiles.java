package day76_Modern_I_O_Directory_File_Operations;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex9_RecentFiles {
    public static void main(String[] args) throws Exception {

        long last24hrs = System.currentTimeMillis() - 24 * 60 * 60 * 1000;

        Files.walk(Paths.get("project"))
                .filter(Files::isRegularFile)
                .filter(p -> {
                    try {
                        return Files.getLastModifiedTime(p).toMillis() > last24hrs;
                    } catch (Exception e) {
                        return false;
                    }
                })
                .forEach(System.out::println);
    }
}


//Very useful for log rotation
//Used by monitoring systems