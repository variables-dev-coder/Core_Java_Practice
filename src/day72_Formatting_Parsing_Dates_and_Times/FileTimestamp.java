package day72_Formatting_Parsing_Dates_and_Times;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileTimestamp {
    public static void main(String[] args) {
        String filename = "backup_" +
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss")) +
                ".zip";
        System.out.println(filename);
    }
}

// backup_20251110_114752.zip