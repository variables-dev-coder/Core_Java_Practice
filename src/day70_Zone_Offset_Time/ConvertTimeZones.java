package day70_Zone_Offset_Time;

// Convert current IST time to UTC and Tokyo

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConvertTimeZones {
    public static void main(String[] args) {
        // Current IST time
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("IST Time: " + istTime);

        // Convert IST → UTC
        ZonedDateTime utcTime = istTime.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("UTC Time: " + utcTime);

        // Convert IST → Tokyo
        ZonedDateTime tokyoTime = istTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("Tokyo Time: " + tokyoTime);
    }
}

/*
IST Time: 2025-10-11T21:21:19.036366700+05:30[Asia/Kolkata]
UTC Time: 2025-10-11T15:51:19.036366700Z[UTC]
Tokyo Time: 2025-10-12T00:51:19.036366700+09:00[Asia/Tokyo]


Logic Explanation:
withZoneSameInstant() adjusts the clock keeping the same instant in time, but shows it in another zone.
IST → UTC difference is -5h 30m, and Tokyo → IST difference is +3h 30m.



 */