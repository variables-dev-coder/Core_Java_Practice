package revisaion_Core_Oop;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Breaking loop at i = " + i);
                break; // exit loop
            }
            System.out.println("i = " + i);
        }
        System.out.println("Loop ended");
    }

}

/*
i = 1
i = 2
Breaking loop at i = 3
Loop ended


1. Theory Explanation
break Statement
Purpose: Immediately terminates the loop or switch statement.
Control moves to the next statement after the loop/switch.
Can be used with label to break out of nested loops.
Syntax:
break;        // Unlabeled break
break label;  // Labeled break


continue Statement
Purpose: Skips the current iteration and jumps to the next iteration of the loop.
In for loop → moves to increment step.
In while / do-while → jumps back to condition check.
Can also be used with label to skip to next iteration of an outer loop.
Syntax:
continue;        // Unlabeled continue
continue label;  // Labeled continue


 */