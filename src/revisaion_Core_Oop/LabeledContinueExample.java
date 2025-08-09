package revisaion_Core_Oop;

public class LabeledContinueExample {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    continue outer; // skip outer loop iteration
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}


/*

3. Real-Time Use Cases
break: Stop searching when element is found.
continue: Skip processing for invalid or unwanted cases.

4. Interview Questions
What is the difference between break and continue?
Can break and continue be used outside loops?
What is a labeled break? When would you use it?
Can break be used in if statement directly?
Which is better for skipping logic — if or c

 */