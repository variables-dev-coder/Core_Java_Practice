package revision_10;

import java.io.*;

public class Example10 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("File error: " + e);
        }
    }
}

//File error: java.io.FileNotFoundException: test.txt (The system cannot find the file specified)