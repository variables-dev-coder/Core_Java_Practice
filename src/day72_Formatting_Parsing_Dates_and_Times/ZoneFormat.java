package day72_Formatting_Parsing_Dates_and_Times;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneFormat {
    public static void main(String[] args) {
        ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm z VV");

        System.out.println(tokyo.format(formatter));
    }
}

//10 Nov 2025 15:13 JST Asia/Tokyo