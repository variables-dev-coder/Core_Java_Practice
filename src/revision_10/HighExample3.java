package revision_10;

import java.io.*;

public class HighExample3 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        } catch (IOException e) {
            System.out.println("File handling error: " + e.getMessage());
        }
    }
}

//File handling error: data.txt (The system cannot find the file specified)