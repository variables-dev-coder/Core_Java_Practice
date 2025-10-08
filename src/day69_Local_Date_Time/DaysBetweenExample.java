package day69_Local_Date_Time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetweenExample {
    public static void main(String[] args) {
        LocalDate projectStart = LocalDate.of(2025, 1, 1);
        LocalDate today = LocalDate.now();

        long daysPassed = ChronoUnit.DAYS.between(projectStart, today);

        System.out.println("Days since project started: " + daysPassed);
    }
}

//Days since project started: 280