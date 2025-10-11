package day70_Zone_Offset_Time;

/*
ZoneOffset – The Fixed Difference from UTC
ZoneOffset represents how far ahead/behind a time is from UTC.
For example:
India (IST) = +05:30
New York (EST) = -04:00

Example:
 */

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class ZoneOffsetExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        ZoneOffset offset = ZoneOffset.of("+05:30");

        OffsetDateTime dateTimeWithOffset = OffsetDateTime.of(now, offset);
        System.out.println("Offset Time: " + dateTimeWithOffset);
    }
}

/*
Offset Time: 2025-10-11T21:12:54.431740200+05:30

OffsetDateTime = LocalDateTime + ZoneOffset
It does not store region info (no daylight savings adjustment).

 */