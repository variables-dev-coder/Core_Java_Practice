package day71_Period_Duration;

import java.time.Duration;
import java.time.Instant;

public class ExecutionTimer {
    public static void main(String[] args) {
        Instant start = Instant.now();

        // simulate heavy operation
        for (int i = 0; i < 1_000_000; i++);

        Instant end = Instant.now();

        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Execution time: " + timeElapsed.toMillis() + " ms");
    }
}


// Execution time: 1 ms