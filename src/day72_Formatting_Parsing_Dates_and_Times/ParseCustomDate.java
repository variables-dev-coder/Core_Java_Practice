package day72_Formatting_Parsing_Dates_and_Times;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseCustomDate {
    public static void main(String[] args) {
        String input = "08/10/2025";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = LocalDate.parse(input, formatter);
        System.out.println("Parsed LocalDate: " + date);
    }
}


// Parsed LocalDate: 2025-10-08