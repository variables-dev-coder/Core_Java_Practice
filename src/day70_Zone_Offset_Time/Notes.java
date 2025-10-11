package day70_Zone_Offset_Time;

public class Notes {
    public static void main(String[] args) {

        /*

1.Why Do We Need Zoned Time?
-----------------------------
In global systems (like payment gateways, airline booking, and stock trading),
time zones differ — and storing time without the zone can cause chaos

Example:
A server in the USA saves 2025-10-08T10:00.
A user in India reads it as 2025-10-08T10:00, but that’s actually 7:30 PM IST!

To fix this, Java introduced ZonedDateTime, ZoneId, and OffsetDateTime to handle exact time globally.



2.ZoneId – Identifying the Time Zone
------------------------------------
ZoneId represents a specific region’s time zone, like "Asia/Kolkata" or "America/New_York".

Example:

import java.time.ZoneId;

public class ZoneIdExample {
    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.systemDefault(); // Your system's default zone
        ZoneId zone2 = ZoneId.of("Asia/Kolkata");
        ZoneId zone3 = ZoneId.of("America/New_York");

        System.out.println("System Zone: " + zone1);
        System.out.println("India Zone: " + zone2);
        System.out.println("New York Zone: " + zone3);
    }
}


Output (example)

System Zone: Asia/Kolkata
India Zone: Asia/Kolkata
New York Zone: America/New_York

ZoneId.systemDefault() automatically picks the zone from your system clock.



3. ZonedDateTime – Date, Time, and Zone Combined
------------------------------------------------
ZonedDateTime combines:
LocalDateTime + ZoneId = ZonedDateTime

Example:

import java.time.ZonedDateTime;
import java.time.ZoneId;

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


Output Example:

System Default: 2025-10-08T17:40:00.123+05:30[Asia/Kolkata]
India Time: 2025-10-08T17:40:00.123+05:30[Asia/Kolkata]
New York Time: 2025-10-08T08:10:00.123-04:00[America/New_York]


Explanation:

+05:30 → Offset for IST
-04:00 → Offset for New York (Eastern Daylight Time)
[Asia/Kolkata] → Region info


4.Convert Time Between Zones
----------------------------
Convert any given time from one zone to another easily

Example:

import java.time.ZonedDateTime;
import java.time.ZoneId;

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


Output Example:

India Time: 2025-10-08T18:00+05:30[Asia/Kolkata]
New York Time: 2025-10-08T08:30-04:00[America/New_York]
London Time: 2025-10-08T13:00+01:00[Europe/London]
Tokyo Time: 2025-10-08T21:30+09:00[Asia/Tokyo]


Key Rule:
Use withZoneSameInstant() to preserve the actual moment in time across different zones.



5.ZoneOffset – The Fixed Difference from UTC
-----------------------------------------------
ZoneOffset represents how far ahead/behind a time is from UTC.
For example:
    India (IST) = +05:30
    New York (EST) = -04:00

Example:

import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class ZoneOffsetExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        ZoneOffset offset = ZoneOffset.of("+05:30");

        OffsetDateTime dateTimeWithOffset = OffsetDateTime.of(now, offset);
        System.out.println("Offset Time: " + dateTimeWithOffset);
    }
}

Output:

Offset Time: 2025-10-08T18:20:00.123+05:30


OffsetDateTime = LocalDateTime + ZoneOffset
It does not store region info (no daylight savings adjustment).




6.Difference: ZonedDateTime vs OffsetDateTime
---------------------------------------------

| Feature                   | ZonedDateTime           | OffsetDateTime            |
| ------------------------- | ----------------------- | ------------------------- |
| Contains region info      |  Yes (`Asia/Kolkata`)   |  No                       |
| Aware of daylight savings |  Yes                    |  No                       |
| Simpler for fixed offsets |                         |                           |
| Real-world use            | Global apps, scheduling | APIs, logging, timestamps |



7.Real-World Mini Example – Global Meeting Scheduler
----------------------------------------------------

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class GlobalMeetingScheduler {
    public static void main(String[] args) {
        ZonedDateTime meetingTimeIST = ZonedDateTime.of(2025, 10, 8, 18, 0, 0, 0, ZoneId.of("Asia/Kolkata"));

        ZonedDateTime nyTime = meetingTimeIST.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime londonTime = meetingTimeIST.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime tokyoTime = meetingTimeIST.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm a z");

        System.out.println(" Global Meeting Schedule:");
        System.out.println("India:   " + meetingTimeIST.format(fmt));
        System.out.println("New York:" + nyTime.format(fmt));
        System.out.println("London:  " + londonTime.format(fmt));
        System.out.println("Tokyo:   " + tokyoTime.format(fmt));
    }
}

Output Example:

 Global Meeting Schedule:
India:   08-Oct-2025 06:00 PM IST
New York:08-Oct-2025 08:30 AM EDT
London:  08-Oct-2025 01:00 PM BST
Tokyo:   08-Oct-2025 09:30 PM JST


8.Master-Level Notes
---------------------
Always store UTC time in DB, and convert to user’s zone at presentation layer.
For APIs, use OffsetDateTime or Instant — they’re zone-independent but precise.
Use ZoneRules (advanced) if you want to get all offsets and transitions for a region.


9.Practice Tasks (Grind Section)
---------------------------------
1 Convert current IST time to UTC and Tokyo.
2 Display all available zone IDs.
  ZoneId.getAvailableZoneIds().forEach(System.out::println);
3 Find what time it will be in London when it’s 10 PM in New York.
4 Create a global reminder app that triggers alerts based on each user’s region.
5 Compare OffsetDateTime.now() and ZonedDateTime.now() side by side.


Summary – Day 2 Complete
-------------------------

| Concept          | Purpose                         | Example                                |
| ---------------- | ------------------------------- | -------------------------------------- |
| `ZoneId`         | Identifies a region             | `Asia/Kolkata`, `America/New_York`     |
| `ZoneOffset`     | Fixed offset from UTC           | `+05:30`                               |
| `ZonedDateTime`  | Date-Time with zone info        | `2025-10-08T18:00+05:30[Asia/Kolkata]` |
| `OffsetDateTime` | Date-Time with fixed offset     | `2025-10-08T18:00+05:30`               |
| Use Case         | Global systems, APIs, databases | Timezone conversion, scheduling        |



         */
    }
}
