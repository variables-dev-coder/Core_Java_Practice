package day69_Local_Date_Time;

// Check if a Given Date Is in the Past or Future

import java.time.LocalDate;

public class DateValidation {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate eventDate = LocalDate.of(2025, 12, 25); // Christmas

        if (eventDate.isAfter(today)) {
            System.out.println("🎄 Event is in the future!");
        } else if (eventDate.isBefore(today)) {
            System.out.println("⏳ Event has already passed.");
        } else {
            System.out.println("🎉 Event is today!");
        }
    }
}

// Concepts Used:
//isAfter(), isBefore(), isEqual()
//Excellent for validating booking or deadline systems.
//Real-world use: Event planning, deadline reminders, or ticket booking systems.
