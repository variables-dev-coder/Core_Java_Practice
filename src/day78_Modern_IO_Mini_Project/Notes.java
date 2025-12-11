package day78_Modern_IO_Mini_Project;

public class Notes {
    public static void main(String[] args) {

        /*

Day 10 – File Data Handler App
==============================
A real-world style utility that every backend engineer should know how to build.

1. Architecture of “File Data Manager” App
------------------------------------------
Your app will follow this flow:

1. Ask user for input file path
2. Read file safely using Files.newBufferedReader()
3. Process all lines
    -Count total lines
    -Split words → count words
    -Count characters (with/without spaces)
4. Save result into an output file
5. Handle all exceptions properly



-------------------------------------------------------------------------------


2. Master-Level Concepts You’ll Use
----------------------------------
Try-with-resources
    Automatic closing of Reader/Writer:

try (BufferedReader br = Files.newBufferedReader(path)) {
    ...
}



Files API (NIO.2)
    Files.exists(path)
    Files.newBufferedReader(path)
    Files.newBufferedWriter(path)
    Files.writeString(...)
    Path.of(...)


Word Processing
    Splitting smartly using regex:

String[] words = line.trim().split("\\s+");


Character Counting

Two types:
    With spaces
    Without spaces


-------------------------------------------------------------------------------------


3. Full Master-Level Runnable Program
-------------------------------------
Clean, structured, production-style code.




import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileDataManagerApp {

    public static void main(String[] args) {

        Path inputFile = Path.of("input.txt");
        Path outputFile = Path.of("output_summary.txt");

        try {
            // Auto-create input file if missing
            if (!Files.exists(inputFile)) {
                Files.createFile(inputFile);
                Files.writeString(inputFile, "Hello Munna!\nThis is your Java File Handler.\nWelcome to Day 78!");
                System.out.println("Sample input file created: " + inputFile.toAbsolutePath());
            }

            // Processing file
            FileSummary summary = analyzeFile(inputFile);

            // Writing result
            writeSummary(outputFile, summary);

            System.out.println("\n File analysis complete!");
            System.out.println("Output written to: " + outputFile.toAbsolutePath());

        } catch (IOException e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }

    // Analyze File
    public static FileSummary analyzeFile(Path path) {

        int lineCount = 0;
        int wordCount = 0;
        int charWithSpaces = 0;
        int charWithoutSpaces = 0;

        try (BufferedReader br = Files.newBufferedReader(path)) {

            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;

                // Characters
                charWithSpaces += line.length();
                charWithoutSpaces += line.replace(" ", "").length();

                // Words
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }

        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }

        return new FileSummary(lineCount, wordCount, charWithSpaces, charWithoutSpaces);
    }

    // Write Summary to output file
    public static void writeSummary(Path path, FileSummary summary) {

        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
            }

            try (BufferedWriter bw = Files.newBufferedWriter(path)) {

                bw.write("===== FILE SUMMARY REPORT =====\n");
                bw.write("Total Lines: " + summary.lineCount + "\n");
                bw.write("Total Words: " + summary.wordCount + "\n");
                bw.write("Characters (with spaces): " + summary.charWithSpaces + "\n");
                bw.write("Characters (without spaces): " + summary.charWithoutSpaces + "\n");
                bw.write("=================================\n");
            }

        } catch (IOException e) {
            System.err.println("Error writing summary: " + e.getMessage());
        }
    }
}

// DTO class
class FileSummary {
    int lineCount;
    int wordCount;
    int charWithSpaces;
    int charWithoutSpaces;

    public FileSummary(int l, int w, int cs, int cws) {
        this.lineCount = l;
        this.wordCount = w;
        this.charWithSpaces = cs;
        this.charWithoutSpaces = cws;
    }
}


-----------------------------------------------------------------------------------


4. Explanation
--------------
FileSummary class
    This makes your program scalable (clean OOP design).


Resource safety
    Using try-with-resources removes the need for manual closing.


Fault tolerance
    If input file doesn’t exist → it creates automatically
    If output file doesn’t exist → creates automatically
    If reading fails → prints error
    App never crashes


Real-world usage
This pattern is used in:
    Log analyzers
    Report generators
    Text processors
    IDEs & compilers
    File synchronization tools

You're building production-level utilities now.



         */
    }
}
