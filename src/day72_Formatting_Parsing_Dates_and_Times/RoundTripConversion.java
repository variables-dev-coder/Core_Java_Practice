package day72_Formatting_Parsing_Dates_and_Times;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RoundTripConversion {
    public static void main(String[] args) {
        String input = "08-10-2025";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date = LocalDate.parse(input, formatter);
        String formattedAgain = date.format(DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy"));

        System.out.println("Original: " + input);
        System.out.println("Formatted: " + formattedAgain);
    }
}

//Original: 08-10-2025
//Formatted: Wednesday, 08 Oct 2025