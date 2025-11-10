package day72_Formatting_Parsing_Dates_and_Times;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseFullDateTime {
    public static void main(String[] args) {
        String input = "2025-10-08 18:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime dateTime = LocalDateTime.parse(input, formatter);
        System.out.println(dateTime);
    }
}


//2025-10-08T18:30