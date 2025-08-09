package revisaion_Core_Oop;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping i = " + i);
                continue; // skip rest of loop body
            }
            System.out.println("i = " + i);
        }
    }
}


/*
i = 1
i = 2
Skipping i = 3
i = 4
i = 5


 */

/*
continue Statement
Purpose: Skips the current iteration and jumps to the next iteration of the loop.
In for loop → moves to increment step.
In while / do-while → jumps back to condition check.
Can also be used with label to skip to next iteration of an outer loop.
Syntax:
continue;        // Unlabeled continue
continue label;  // Labeled continue

 */