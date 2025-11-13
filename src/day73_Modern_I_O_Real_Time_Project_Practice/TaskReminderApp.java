package day73_Modern_I_O_Real_Time_Project_Practice;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TaskReminderApp {
    public static void main(String[] args) {

        // Step 1: Task Details

        String taskName = "Project Submission";
        LocalDateTime deadline = LocalDateTime.of(2025, 10, 20, 18, 0);

        // Step 2 : Current time
        LocalDateTime now = LocalDateTime.now();

        // Step 3 : Calculate remaining time using Duration
        Duration duration = Duration.between(now, deadline);
        long days = duration.toDays();
        long hours = duration.minusDays(days).toHours();
        long minutes = duration.minusDays(days).minusHours(hours).toMinutes();

        // Step 4 : Period for date difference
        Period period = Period.between(now.toLocalDate(), deadline.toLocalDate());

        // Step 5 : Display formatted result
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a");

        System.out.println("Task: " + taskName);
        System.out.println("Deadline: " + deadline.format(formatter));
        System.out.println("Remainder: " + period.getDays() + " days, " + hours + " hours, " + minutes + " minutes");

        // Step 6 : Friendly reminder
        if (now.isBefore(deadline)) {
            System.out.println("Task is still pending. Stay focused!");
        } else {
            System.out.println("Deadline passed! Time to review your task.");
        }
    }
}


/*
Task: Project Submission
Deadline: 20 Oct 2025, 06:00 pm
Remainder: -24 days, -19 hours, 0 minutes
Deadline passed! Time to review your task.
 */