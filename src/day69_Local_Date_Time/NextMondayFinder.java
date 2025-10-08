package day69_Local_Date_Time;

// Find Next Monday from Today

import java.time.DayOfWeek;
import java.time.LocalDate;

public class NextMondayFinder {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextMonday = today.with(java.time.temporal.TemporalAdjusters.next(DayOfWeek.MONDAY));

        System.out.println("Today: " + today);
        System.out.println("Next Monday: " + nextMonday);
    }
}


//Today: 2025-10-08
//Next Monday: 2025-10-13


//Concepts Used:
//TemporalAdjusters.next() to find next specific day.
//Helps when you want next billing cycle, meeting, or reporting day.
// Real-world use: Scheduling weekly reports or maintenance tasks.