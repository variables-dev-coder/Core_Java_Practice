package day70_Zone_Offset_Time;

/*
1.ZoneId – Identifying the Time Zone
ZoneId represents a specific region’s time zone, like "Asia/Kolkata" or "America/New_York".

Example:
 */

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

/*
System Zone: Asia/Calcutta
India Zone: Asia/Kolkata
New York Zone: America/New_York

ZoneId.systemDefault() automatically picks the zone from your system clock.

 */