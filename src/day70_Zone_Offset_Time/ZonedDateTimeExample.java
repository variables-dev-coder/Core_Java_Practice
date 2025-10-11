package day70_Zone_Offset_Time;

/*
2.ZonedDateTime – Date, Time, and Zone Combined
ZonedDateTime combines:
LocalDateTime + ZoneId = ZonedDateTime

Example:
 */

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("System Default: " + now);
        System.out.println("India Time: " + indiaTime);
        System.out.println("New York Time: " + newYorkTime);
    }
}

/*
System Default: 2025-10-11T21:06:44.290841700+05:30[Asia/Calcutta]
India Time: 2025-10-11T21:06:44.290841700+05:30[Asia/Kolkata]
New York Time: 2025-10-11T11:36:44.292847800-04:00[America/New_York]

Explanation:

+05:30 → Offset for IST

-04:00 → Offset for New York (Eastern Daylight Time)

[Asia/Kolkata] → Region info

 */