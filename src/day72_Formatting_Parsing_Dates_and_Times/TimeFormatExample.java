package day72_Formatting_Parsing_Dates_and_Times;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatExample {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(14, 45, 30);

        System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss"))); // 24-hour
        System.out.println(time.format(DateTimeFormatter.ofPattern("hh:mm:ss a"))); // 12-hour
    }
}

//14:45:30
//02:45:30 pm