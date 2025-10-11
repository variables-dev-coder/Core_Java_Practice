package day70_Zone_Offset_Time;

// Real-World Mini Example – Global Meeting Scheduler

import java.time.ZoneId;
import java.time.ZonedDateTime;
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

/*
Global Meeting Schedule:
India:   08-Oct-2025 06:00 pm IST
New York:08-Oct-2025 08:30 am GMT-04:00
London:  08-Oct-2025 01:30 pm BST
Tokyo:   08-Oct-2025 09:30 pm JST


 */