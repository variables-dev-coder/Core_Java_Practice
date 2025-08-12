package day13_Arrays_Strings_DSA_Part2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class Student {
    private final String name;
    private final List<String> subjects; // Mutable type

    // Constructor with defensive copy
    public Student(String name, List<String> subjects) {
        this.name = name;
        // Create a new copy of the list to prevent external modification
        this.subjects = new ArrayList<>(subjects);
    }

    public String getName() {
        return name;
    }

    // Getter with defensive copy
    public List<String> getSubjects() {
        // Return a copy, not the original list
        return new ArrayList<>(subjects);
        // Or return Collections.unmodifiableList(subjects);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        List<String> subjectList = Arrays.asList("Math", "Science");
        Student student = new Student("John", subjectList);

        System.out.println("Original Subjects: " + student.getSubjects());

        // Try modifying the list returned by getter
        student.getSubjects().add("History");

        System.out.println("After modification attempt: " + student.getSubjects());
    }
}


//Original Subjects: [Math, Science]
//After modification attempt: [Math, Science]


/*

Explanation
1. Defensive Copy in Constructor
Prevents external list references from modifying the internal list after object creation.

2. Defensive Copy in Getter
Ensures that the returned list is a new copy, not the actual internal reference.

3. Why not return the original list?
If we return the original subjects, external code can directly modify it, breaking immutability.

4. Alternative
Use Collections.unmodifiableList(subjects) for read-only access.

 */