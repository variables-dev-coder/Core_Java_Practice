package day72_Formatting_Parsing_Dates_and_Times;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseExample {
    public static void main(String[] args) {
        String input = "08-10-2025 14:30";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(input, formatter);

        System.out.println("Parsed DateTime: " + dateTime);
    }
}

// Parsed DateTime: 2025-10-08T14:30