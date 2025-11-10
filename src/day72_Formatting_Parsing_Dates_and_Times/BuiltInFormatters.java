package day72_Formatting_Parsing_Dates_and_Times;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BuiltInFormatters {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println("ISO_DATE: " + now.format(DateTimeFormatter.ISO_DATE));
        System.out.println("ISO_TIME: " + now.format(DateTimeFormatter.ISO_TIME));
        System.out.println("ISO_LOCAL_DATE_TIME: " + now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("BASIC_ISO_DATE: " + now.format(DateTimeFormatter.BASIC_ISO_DATE));
    }
}


/*
ISO_DATE: 2025-11-10
ISO_TIME: 10:59:48.4435025
ISO_LOCAL_DATE_TIME: 2025-11-10T10:59:48.4435025
BASIC_ISO_DATE: 20251110
 */