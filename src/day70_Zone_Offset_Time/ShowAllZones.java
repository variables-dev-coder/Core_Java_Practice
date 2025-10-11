package day70_Zone_Offset_Time;

// Display all available Zone IDs

import java.time.ZoneId;

public class ShowAllZones {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds()
                .stream()
                .sorted()
                .forEach(System.out::println);
    }
}

/*
Use case:
These zone IDs are used for user-specific regional conversions in enterprise
apps — e.g., "America/New_York", "Europe/London", "Asia/Kolkata".

 */