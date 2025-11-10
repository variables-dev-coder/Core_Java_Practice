package day72_Formatting_Parsing_Dates_and_Times;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MultiFormatExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(today.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
        System.out.println(today.format(DateTimeFormatter.ofPattern("EEEE, MMMM dd yyyy")));
        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy.MM.dd")));
    }
}

/*
10/11/2025
Nov 10, 2025
Monday, November 10 2025
2025.11.10
 */