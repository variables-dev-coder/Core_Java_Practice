package day78_Modern_IO_Mini_Project;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDataManagerApp {

    public static void main(String[] args) {

        Path inputFile = Path.of("D:\\SKILL\\JAVA\\Core_Java_Practice\\src\\day78_Modern_IO_Mini_Project\\input.txt");
        Path outputFile = Path.of("D:\\SKILL\\JAVA\\Core_Java_Practice\\src\\day78_Modern_IO_Mini_Project\\output.txt");

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
