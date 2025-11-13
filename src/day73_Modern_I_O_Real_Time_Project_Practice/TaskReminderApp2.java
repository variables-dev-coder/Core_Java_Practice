package day73_Modern_I_O_Real_Time_Project_Practice;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskReminderApp2 {
    public static void main(String[] args) throws InterruptedException {
        List<Task> tasks = new ArrayList<>();

        // Add sample tasks
        tasks.add(new Task("Project Submission", LocalDateTime.of(2025, 10, 20, 18, 0)));
        tasks.add(new Task("Team Meeting", LocalDateTime.of(2025, 10, 15, 10, 30)));
        tasks.add(new Task("Exam Preparation", LocalDateTime.of(2025, 10, 25, 8, 0)));
        tasks.add(new Task("Client Presentation", LocalDateTime.of(2025, 10, 17, 14, 0)));

        // Sort tasks by nearest deadline
        tasks.sort(Comparator.comparing(Task::getDeadline));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a");

        System.out.println("==============  TASK REMINDER APP ==============");
        for (Task task : tasks) {
            System.out.println(task);
        }
        System.out.println("==================================================");

        // Periodic reminder check (every 5 seconds)
        while (true) {
            System.out.println("\n Checking task reminders at: " +
                    LocalDateTime.now().format(formatter));
            for (Task task : tasks) {
                checkTaskReminder(task);
            }
            System.out.println("--------------------------------------------------");
            Thread.sleep(5000); // waits 5 seconds
        }
    }

    private static void checkTaskReminder(Task task) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime deadline = task.getDeadline();

        if (now.isBefore(deadline)) {
            Duration duration = Duration.between(now, deadline);
            long days = duration.toDays();
            long hours = duration.minusDays(days).toHours();
            long minutes = duration.minusDays(days).minusHours(hours).toMinutes();

            System.out.println(" " + task.getName() + " → Remaining: " +
                    days + " days, " + hours + " hours, " + minutes + " minutes");
        } else if (now.isAfter(deadline)) {
            System.out.println(" " + task.getName() + " → Deadline Passed!");
        } else {
            System.out.println(" " + task.getName() + " → Due Now!");
        }
    }
}
