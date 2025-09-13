package revision_10;

import java.io.*;

public class Example5 {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt");
        fr.read();
        fr.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Handled IOException: " + e);
        }
    }
}

// Handled IOException: java.io.FileNotFoundException: test.txt (The system cannot find the file specified)