package day70_Zone_Offset_Time;

/*
Convert Time Between Zones
Convert any given time from one zone to another easily
Example:
 */

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneConversionExample {
    public static void main(String[] args) {
        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime newYorkTime = indiaTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime londonTime = indiaTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime tokyoTime = indiaTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        System.out.println("India Time: " + indiaTime);
        System.out.println("New York Time: " + newYorkTime);
        System.out.println("London Time: " + londonTime);
        System.out.println("Tokyo Time: " + tokyoTime);
    }
}

/*
India Time: 2025-10-11T21:09:44.833744500+05:30[Asia/Kolkata]
New York Time: 2025-10-11T11:39:44.833744500-04:00[America/New_York]
London Time: 2025-10-11T16:39:44.833744500+01:00[Europe/London]
Tokyo Time: 2025-10-12T00:39:44.833744500+09:00[Asia/Tokyo]

Use withZoneSameInstant() to preserve the actual moment in time across different zones.
 */