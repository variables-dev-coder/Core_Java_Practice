package day72_Formatting_Parsing_Dates_and_Times;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReformatISODate {
    public static void main(String[] args) {
        String isoString = "2025-10-08T14:35:50";
        LocalDateTime dateTime = LocalDateTime.parse(isoString);

        String custom = dateTime.format(DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a"));
        System.out.println("Formatted: " + custom);
    }
}

//Formatted: 08 Oct 2025, 02:35 pm