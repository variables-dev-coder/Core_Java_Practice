package day70_Zone_Offset_Time;

// Compare OffsetDateTime vs ZonedDateTime

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class OffsetVsZoned {
    public static void main(String[] args) {
        OffsetDateTime offsetNow = OffsetDateTime.now();
        ZonedDateTime zonedNow = ZonedDateTime.now();

        System.out.println("OffsetDateTime: " + offsetNow);
        System.out.println("ZonedDateTime : " + zonedNow);

        System.out.println("\nOffset: " + offsetNow.getOffset());
        System.out.println("Zone ID: " + zonedNow.getZone());
    }
}

/*
OffsetDateTime: 2025-10-11T21:40:42.746746200+05:30
ZonedDateTime : 2025-10-11T21:40:42.747745600+05:30[Asia/Calcutta]

Offset: +05:30
Zone ID: Asia/Calcutta

 */