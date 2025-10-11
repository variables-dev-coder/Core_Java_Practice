package day70_Zone_Offset_Time;

// Find what time it will be in London when it’s 10 PM in New York

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LondonTimeFromNY {
    public static void main(String[] args) {
        // Assume 10 PM New York time today
        LocalDate today = LocalDate.now();
        LocalTime nyTime = LocalTime.of(22, 0);
        ZonedDateTime nyDateTime = ZonedDateTime.of(today, nyTime, ZoneId.of("America/New_York"));

        // Convert to London time
        ZonedDateTime londonTime = nyDateTime.withZoneSameInstant(ZoneId.of("Europe/London"));

        System.out.println("New York: " + nyDateTime);
        System.out.println("London : " + londonTime);
    }
}

/*
New York: 2025-10-11T22:00-04:00[America/New_York]
London : 2025-10-12T03:00+01:00[Europe/London]


Logic:
Time zones differ based on UTC offset.
When it’s 10 PM in New York, it’s typically 3 AM in London (next day), depending on DST.


 */