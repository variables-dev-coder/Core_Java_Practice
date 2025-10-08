package day69_Local_Date_Time;

// Display Formatted Date and Time

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomDateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy hh:mm a");
        String formatted = now.format(formatter);

        System.out.println("Formatted Date-Time: " + formatted);
    }
}

//Formatted Date-Time: Wednesday, 08 Oct 2025 05:33 pm

//Concepts Used:
//DateTimeFormatter.ofPattern() for custom format.
//EEEE → Day name, MMM → Month short name, a → AM/PM
//Real-world use: User-facing logs, invoices, or system notifications.