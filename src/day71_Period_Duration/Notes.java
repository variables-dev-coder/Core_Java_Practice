package day71_Period_Duration;

public class Notes {
    public static void main(String[] args) {

        /*

Concept Overview
----------------

| Concept      | Use For                | Works With                              | Measures                       |
| ------------ | ---------------------- | --------------------------------------- | ------------------------------ |
| **Period**   | Date-based differences | `LocalDate`                             | Years, Months, Days            |
| **Duration** | Time-based differences | `LocalTime`, `LocalDateTime`, `Instant` | Hours, Minutes, Seconds, Nanos |


1.Period — Date Differences (Y/M/D)
-----------------------------------

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, 5, 10);
        LocalDate endDate = LocalDate.of(2025, 10, 8);

        Period period = Period.between(startDate, endDate);

        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());

        System.out.println("\nTotal Period: " + period);
    }
}


Logic Explanation:

Period.between(startDate, endDate) calculates the exact difference between two LocalDate values.

Example output:
Years: 5, Months: 4, Days: 28
→ means from May 10, 2020 to Oct 8, 2025 is 5 years, 4 months, and 28 days.



2.Calculate Age using Period.between()
--------------------------------------

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int year = sc.nextInt();
        System.out.print("Enter your birth month: ");
        int month = sc.nextInt();
        System.out.print("Enter your birth day: ");
        int day = sc.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        System.out.println("You are " + age.getYears() + " years, " +
                           age.getMonths() + " months, and " +
                           age.getDays() + " days old.");
    }
}

Real-world use:
Used in forms, HR systems, or insurance applications to compute user age or service duration.




3.Duration — Time Differences (H/M/S/Nanos)
-------------------------------------------

import java.time.*;

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


Logic:

Duration.between() calculates exact time difference down to nanoseconds.

Example output:
PT4H15M30S → 4 hours, 15 minutes, 30 seconds.



4.Measure Execution Time (Performance Timing)
---------------------------------------------

import java.time.*;

public class ExecutionTimer {
    public static void main(String[] args) {
        Instant start = Instant.now();

        // simulate heavy operation
        for (int i = 0; i < 1_000_000; i++);

        Instant end = Instant.now();

        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Execution time: " + timeElapsed.toMillis() + " ms");
    }
}


Used in:
Benchmarking code, API latency tracking, logging frameworks, etc.
This is a practical use of Instant + Duration.


5.Difference between Period and Duration
----------------------------------------

| Feature                     | Period                   | Duration                                |
| --------------------------- | ------------------------ | --------------------------------------- |
| Works with                  | `LocalDate`              | `LocalTime`, `LocalDateTime`, `Instant` |
| Measures                    | Years, Months, Days      | Hours, Minutes, Seconds, Nanos          |
| Format                      | `P5Y4M2D`                | `PT5H30M10S`                            |
| Use Case                    | Age, Subscription Expiry | Stopwatch, Performance Timer            |
| DST (Daylight Saving) Aware | Yes                      | Yes                                     |



6.Combined Example — Full DateTime Difference
---------------------------------------------

import java.time.*;

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


Use case:
Perfect for logging systems, subscription expiration, or showing “time since last login”.




Master Tips

1.Always use Period for calendar logic (like birthdays or anniversaries).
2.Use Duration for real-time measurement (like stopwatch, execution timer).
3.Convert both to standard units using:
    toDays(), toHours(), toMinutes()
4.Combine them for complete datetime calculations.
5.For global systems → use Instant and convert with zone-aware APIs.



         */
    }
}
