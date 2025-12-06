package day77_Modern_I_O_Exception_Handling_Best_Practices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example4_FileExistsCheck {

    public static void main(String[] args) {

        Path path = Path.of("D:\\SKILL\\JAVA\\Core_Java_Practice\\src\\day77_Modern_I_O_Exception_Handling_Best_Practices/user.txt");


        if (!Files.exists(path)) {
            System.out.println("File does not exist!");
            return;
        }

        try {
            Files.lines(path).forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Cannot read: " + e.getMessage());
        }
    }
}

//File does not exist!