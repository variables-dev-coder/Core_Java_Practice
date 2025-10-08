package day69_Local_Date_Time;

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

//Now: 17:16:02.960382200
//Fixed: 14:30:45
//Parsed: 09:15:30