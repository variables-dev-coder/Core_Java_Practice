package day72_Formatting_Parsing_Dates_and_Times;

public class Notes {
    public static void main(String[] args) {

        /*
Formatting & Parsing Dates and Times
------------------------------------

1. Overview: Why Formatting & Parsing Matters
    Formatting → Convert a LocalDate, LocalDateTime, etc. → into a string
    Parsing → Convert a string → into a LocalDate, LocalDateTime, etc.

Handled by java.time.format.DateTimeFormatter — part of the modern Java Date-Time API (java.time).


2. Built-in Formatters (Ready to Use)

Java provides predefined formatters for common date/time standards (especially ISO 8601).

| Formatter                               | Example Output                            | Usage         |
| --------------------------------------- | ----------------------------------------- | ------------- |
| `DateTimeFormatter.ISO_DATE`            | `2025-10-08`                              | Date only     |
| `DateTimeFormatter.ISO_TIME`            | `14:45:30.123`                            | Time only     |
| `DateTimeFormatter.ISO_LOCAL_DATE_TIME` | `2025-10-08T14:45:30`                     | Date + Time   |
| `DateTimeFormatter.ISO_ZONED_DATE_TIME` | `2025-10-08T14:45:30+05:30[Asia/Kolkata]` | ZonedDateTime |
| `DateTimeFormatter.BASIC_ISO_DATE`      | `20251008`                                | Compact date  |

Example :

import java.time.*;
import java.time.format.*;

public class BuiltInFormatters {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println("ISO_DATE: " + now.format(DateTimeFormatter.ISO_DATE));
        System.out.println("ISO_TIME: " + now.format(DateTimeFormatter.ISO_TIME));
        System.out.println("ISO_LOCAL_DATE_TIME: " + now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("BASIC_ISO_DATE: " + now.format(DateTimeFormatter.BASIC_ISO_DATE));
    }
}


ISO_DATE: 2025-10-08
ISO_TIME: 13:45:30.671
ISO_LOCAL_DATE_TIME: 2025-10-08T13:45:30.671
BASIC_ISO_DATE: 20251008


3. Custom Patterns with ofPattern()

When working with users, reports, or UI, you often need custom date formats (e.g. "08-10-2025 02:30 PM").

Example:

import java.time.*;
import java.time.format.*;

public class CustomFormatterExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE, MMM dd yyyy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("hh:mm a, dd/MM/yyyy");

        System.out.println(now.format(formatter1));
        System.out.println(now.format(formatter2));
        System.out.println(now.format(formatter3));
    }
}

Pattern Symbols:

| Symbol | Meaning             | Example   |
| :----- | :------------------ | :-------- |
| `y`    | Year                | 2025      |
| `M`    | Month (number/text) | 10 or Oct |
| `d`    | Day of month        | 08        |
| `E`    | Day of week         | Wednesday |
| `H`    | Hour (0–23)         | 14        |
| `h`    | Hour (1–12)         | 02        |
| `m`    | Minute              | 30        |
| `s`    | Second              | 45        |
| `a`    | AM/PM               | PM        |


4. Parsing Strings → Dates/Times

You can parse date/time strings back into objects using the same DateTimeFormatter.

Example 1: Parse Custom Date String

import java.time.*;
import java.time.format.*;

public class ParseExample {
    public static void main(String[] args) {
        String input = "08-10-2025 14:30";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(input, formatter);

        System.out.println("Parsed DateTime: " + dateTime);
    }
}


Parsed DateTime: 2025-10-08T14:30


Example 2: Parse Only a Date

String dateStr = "2025-10-08";
LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ISO_DATE);
System.out.println("Parsed LocalDate: " + date);



5. Combining ZonedDateTime and Formatter

import java.time.*;
import java.time.format.*;

public class ZonedFormatExample {
    public static void main(String[] args) {
        ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm z");
        String formatted = zoned.format(formatter);

        System.out.println("Tokyo Time: " + formatted);
    }
}


Tokyo Time: 08 Oct 2025 18:55 JST


6. Real-world Scenarios


| Use Case          | Example               |
| ----------------- | --------------------- |
| Logging           | `yyyy-MM-dd HH:mm:ss` |
| API JSON          | `ISO_LOCAL_DATE_TIME` |
| Reports           | `dd/MM/yyyy hh:mm a`  |
| Banking / Finance | `BASIC_ISO_DATE`      |
| User-friendly UI  | `EEEE, dd MMM yyyy`   |


7. Parsing + Formatting (Round Trip)

String dateStr = "08-10-2025 21:15";
DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

LocalDateTime parsed = LocalDateTime.parse(dateStr, f);
String formattedAgain = parsed.format(f);

System.out.println("Parsed: " + parsed);
System.out.println("Formatted Back: " + formattedAgain);


Round-trip output:

Parsed: 2025-10-08T21:15
Formatted Back: 08-10-2025 21:15


Master-Level Insights
---------------------
    1.Always use ISO format for APIs & databases (machine-readable).
    2.Use custom formats only for UI or reports.
    3.DateTimeFormatter is immutable and thread-safe → safe to use in concurrent applications.
    4.For Locale-based formatting (e.g., Hindi, Japanese), use:

DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.JAPAN);

    5.Prefer LocalDateTime.parse() for local time zones,
      or ZonedDateTime.parse() if your string includes time zone info.



         */
    }
}
