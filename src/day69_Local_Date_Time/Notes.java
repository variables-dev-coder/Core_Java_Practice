package day69_Local_Date_Time;

public class Notes {
    public static void main(String[] args) {

        /*

Day 1 – Local Date & Time Basics
===================================
    Introduction: Why new Date/Time API was introduced
    LocalDate → represents a date (no time zone)
    LocalTime → represents only time
    LocalDateTime → represents both date and time
    Common methods: now(), of(), plusDays(), minusMonths(), getDayOfWeek(), etc.

Practice:
    Print current date and time
    Add/subtract days/months
    Format date/time


1.WHY java.time EXISTS (The Motivation)
-------------------------------------
Before Java 8, date and time handling was painful —
you had classes like java.util.Date and java.util.Calendar, which had:
    Mutability (not thread-safe)
    Confusing month indexing (January = 0 )
    Poor API design (methods like getYear() deprecated)

Java 8 introduced the modern Date-Time API (JSR 310) inside the package
java.time, inspired by Joda-Time library.

These classes are:
    Immutable
    Thread-safe
    Readable
    Fluent in design


2.THE CORE CLASSES OVERVIEW
----------------------------
| Purpose                     | Class           | Example                 |
| --------------------------- | --------------- | ----------------------- |
| Represents date only        | `LocalDate`     | 2025-10-08              |
| Represents time only        | `LocalTime`     | 16:42:21.123            |
| Represents both date & time | `LocalDateTime` | 2025-10-08T16:42:21.123 |

No timezone data in these 3 classes. (Timezone support comes later with ZonedDateTime)


3.LOCALDATE (Date Without Time)
-------------------------------
import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2000, 5, 15);
        LocalDate parsed = LocalDate.parse("2025-10-08");

        System.out.println("Today: " + today);
        System.out.println("Birthday: " + birthday);
        System.out.println("Parsed: " + parsed);
    }
}

Output Example

Today: 2025-10-08
Birthday: 2000-05-15
Parsed: 2025-10-08


Useful Methods

LocalDate date = LocalDate.now();
System.out.println(date.getYear());
System.out.println(date.getMonth());
System.out.println(date.getDayOfWeek());
System.out.println(date.plusDays(5));
System.out.println(date.minusMonths(2));
System.out.println(date.isLeapYear());


Immutable Reminder:
Each method returns a new object, not modifying the original date.


Real-World Use Case

Suppose you’re building a subscription app, and you want to check expiry date:

LocalDate startDate = LocalDate.now();
LocalDate expiryDate = startDate.plusMonths(6);

if (LocalDate.now().isAfter(expiryDate)) {
    System.out.println("Subscription expired!");
} else {
    System.out.println("Subscription active.");
}


4.LOCALTIME (Time Without Date)
---------------------------------
Creating LocalTime

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime fixed = LocalTime.of(14, 30, 45);
        LocalTime parsed = LocalTime.parse("09:15:30");

        System.out.println("Now: " + now);
        System.out.println("Fixed: " + fixed);
        System.out.println("Parsed: " + parsed);
    }
}

Useful Methods

LocalTime time = LocalTime.of(10, 0);
System.out.println(time.plusHours(2));   // 12:00
System.out.println(time.minusMinutes(30)); // 09:30
System.out.println(time.isBefore(LocalTime.NOON)); // true/false
System.out.println(time.getSecond());


Use case:
In scheduling systems, LocalTime is used for daily tasks (e.g. notifications at 10:00 AM).


5.LOCALDATETIME (Date + Time Combined)
---------------------------------------
Creating LocalDateTime

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


Useful Methods

LocalDateTime dateTime = LocalDateTime.now();
System.out.println(dateTime.plusDays(2).plusHours(3));
System.out.println(dateTime.withMonth(12));
System.out.println(dateTime.getDayOfWeek());
System.out.println(dateTime.toLocalDate());
System.out.println(dateTime.toLocalTime());


toLocalDate() / toLocalTime() let you separate the date or time components when needed.


6.COMBINING AND SEPARATING DATE & TIME
----------------------------------------
You can combine a date and a time like this:

LocalDate date = LocalDate.of(2025, 10, 8);
LocalTime time = LocalTime.of(14, 45);
LocalDateTime dateTime = date.atTime(time);
System.out.println(dateTime); // 2025-10-08T14:45

Or extract them back:

LocalDate extractedDate = dateTime.toLocalDate();
LocalTime extractedTime = dateTime.toLocalTime();


7.REAL-WORLD PROJECT SNIPPET (Mini Use Case)
---------------------------------------------

Example: “Meeting Scheduler” — Add meeting reminder after 30 minutes

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MeetingScheduler {
    public static void main(String[] args) {
        LocalDateTime meeting = LocalDateTime.now().plusMinutes(30);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        System.out.println("Meeting Scheduled At: " + meeting.format(format));
    }
}



8. INTERNAL INSIGHT (For Mastery)
---------------------------------
    Internally, LocalDate stores days since epoch (1970-01-01).
    LocalTime stores nanoseconds of the day.
    All are final classes, meaning they cannot be subclassed.
    They use value-based classes, meaning equality is based on values, not references.

Example:

LocalDate d1 = LocalDate.of(2025, 10, 8);
LocalDate d2 = LocalDate.of(2025, 10, 8);
System.out.println(d1 == d2); // false
System.out.println(d1.equals(d2)); // true


9.MASTER-LEVEL EXERCISES
------------------------
Try these yourself

1. Create a program that prints:
    Today’s date
    Tomorrow’s date
    Date after 100 days
    Day of the week 100 days from now

2. Calculate your exact age in years, months, and days using LocalDate.
(You’ll use Period in next lessons, but try manually for now.)

3. Create a meeting reminder using LocalDateTime that shows how many hours remain until the meeting.

10. SUMMARY FOR DAY 1
---------------------
| Concept         | Class         | Key Point                                     |
| --------------- | ------------- | --------------------------------------------- |
| Date only       | LocalDate     | Immutable, no time zone                       |
| Time only       | LocalTime     | Precise to nanoseconds                        |
| Date + Time     | LocalDateTime | Combination of both                           |
| Key Features    |               | Immutable, Thread-safe, Fluent API            |
| Real-world uses |               | Billing cycles, scheduling, logs, task timers |



         */
    }
}
