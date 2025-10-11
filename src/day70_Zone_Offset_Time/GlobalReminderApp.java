package day70_Zone_Offset_Time;

// Global Reminder App Concept

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class GlobalReminderApp {
    public static void main(String[] args) {
        Map<String, ZoneId> users = Map.of(
                "Munna (India)", ZoneId.of("Asia/Kolkata"),
                "Alex (USA)", ZoneId.of("America/New_York"),
                "Yuki (Japan)", ZoneId.of("Asia/Tokyo"),
                "James (UK)", ZoneId.of("Europe/London")
        );

        // Global event time in UTC
        ZonedDateTime globalEventUTC = ZonedDateTime.of(
                LocalDateTime.of(2025, 10, 8, 12, 0), ZoneId.of("UTC"));

        System.out.println("Global Event (UTC): " + globalEventUTC);

        // Convert event to each user's local time
        users.forEach((user, zone) -> {
            ZonedDateTime localEvent = globalEventUTC.withZoneSameInstant(zone);
            System.out.println(user + " -> " + localEvent);
        });
    }
}

/*
Logic:
Store event timestamps in UTC for consistency.
Convert to each user’s ZoneId before display.
This is exactly how apps like Google Calendar handle time zones.

Global Event (UTC): 2025-10-08T12:00Z[UTC]
James (UK) -> 2025-10-08T13:00+01:00[Europe/London]
Yuki (Japan) -> 2025-10-08T21:00+09:00[Asia/Tokyo]
Alex (USA) -> 2025-10-08T08:00-04:00[America/New_York]
Munna (India) -> 2025-10-08T17:30+05:30[Asia/Kolkata]

 */