package day77_Modern_I_O_Exception_Handling_Best_Practices;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Example3_AppendFile {

    public static void main(String[] args) {

        Path path = Path.of("D:\\SKILL\\JAVA\\Core_Java_Practice\\src\\day77_Modern_I_O_Exception_Handling_Best_Practices/log.txt");

        String log = "New log entry: " + System.currentTimeMillis() + "\n";

        try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {

            bw.write(log);
            System.out.println("Log appended");
        } catch (IOException e) {
            System.err.println("Unable to append: " + e.getMessage());
        }
    }
}

//Log appended