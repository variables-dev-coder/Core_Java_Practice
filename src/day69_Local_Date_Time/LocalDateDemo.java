package day69_Local_Date_Time;

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

//Today: 2025-10-08
//Birthday: 2000-05-15
//Parsed: 2025-10-08