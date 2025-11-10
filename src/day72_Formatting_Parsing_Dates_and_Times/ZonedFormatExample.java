package day72_Formatting_Parsing_Dates_and_Times;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedFormatExample {
    public static void main(String[] args) {
        ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm z");
        String formatted = zoned.format(formatter);

        System.out.println("Tokyo Time: " + formatted);
    }
}


// Tokyo Time: 10 Nov 2025 14:44 JST