package day71_Period_Duration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class DateTimeDifference {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2024, 10, 8, 10, 0);
        LocalDateTime end = LocalDateTime.of(2025, 10, 8, 15, 30);

        // Extract date part difference
        Period dateDiff = Period.between(start.toLocalDate(), end.toLocalDate());
        // Extract time part difference
        Duration timeDiff = Duration.between(start.toLocalTime(), end.toLocalTime());

        System.out.println("Date Difference: " + dateDiff.getYears() + " years, "
                + dateDiff.getMonths() + " months, " + dateDiff.getDays() + " days");
        System.out.println("Time Difference: " + timeDiff.toHours() + " hours, "
                + (timeDiff.toMinutes() % 60) + " minutes");
    }
}

//Date Difference: 1 years, 0 months, 0 days
//Time Difference: 5 hours, 30 minutes