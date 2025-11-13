package day73_Modern_I_O_Real_Time_Project_Practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private String name;
    private LocalDateTime deadline;

    public Task(String name, LocalDateTime deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a");
        return " Task: " + name + " | Deadline: " + deadline.format(formatter);
    }
}
