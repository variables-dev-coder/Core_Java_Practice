package day72_Formatting_Parsing_Dates_and_Times;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomFormatterExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE, MMM dd yyyy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("hh:mm a, dd/MM/yyyy");

        System.out.println(now.format(formatter1));
        System.out.println(now.format(formatter2));
        System.out.println(now.format(formatter3));
    }
}

/*
10-11-2025 11:05
Monday, Nov 10 2025
11:05 am, 10/11/2025
 */