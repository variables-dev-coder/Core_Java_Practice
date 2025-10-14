package day71_Period_Duration;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(14, 30, 0);
        LocalTime end = LocalTime.of(18, 45, 30);

        Duration duration = Duration.between(start, end);

        System.out.println("Hours: " + duration.toHours());
        System.out.println("Minutes: " + duration.toMinutes());
        System.out.println("Seconds: " + duration.getSeconds());
        System.out.println("Duration: " + duration);
    }
}


//Hours: 4
//Minutes: 255
//Seconds: 15330
//Duration: PT4H15M30S