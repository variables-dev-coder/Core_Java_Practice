package day69_Local_Date_Time;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime meeting = LocalDateTime.of(2025, 10, 10, 15, 30);
        LocalDateTime parsed = LocalDateTime.parse("2025-10-08T16:45:30");

        System.out.println("Now: " + now);
        System.out.println("Meeting: " + meeting);
        System.out.println("Parsed: " + parsed);
    }
}

//Now: 2025-10-08T17:18:20.950959900
//Meeting: 2025-10-10T15:30
//Parsed: 2025-10-08T16:45:30