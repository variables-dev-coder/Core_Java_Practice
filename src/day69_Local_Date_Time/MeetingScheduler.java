package day69_Local_Date_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MeetingScheduler {
    public static void main(String[] args) {
        LocalDateTime meeting = LocalDateTime.now().plusMinutes(30);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        System.out.println("Meeting Scheduled At: " + meeting.format(format));
    }
}

//Meeting Scheduled At: 08-10-2025 17:51